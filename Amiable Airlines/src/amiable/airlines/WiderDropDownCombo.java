/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amiable.airlines;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import javax.swing.JComboBox;

/**
 *
 * @author admin
 */
public class WiderDropDownCombo extends JComboBox{
    private String type;
    private boolean layingOut = false;
    private boolean wide = false;
    private int widestLength = 0;
    
    public WiderDropDownCombo(Object[] objs) {
        super(objs);
    }

    WiderDropDownCombo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean isWide(){
        return wide;
    }
    
    public void setWide(boolean wide) {
        this.wide = wide;
        widestLength = getWidestItemWidth();

    }
    
    public Dimension getsize() {
        Dimension dim = super.getSize();
        if (!layingOut && isWide()){
            dim.width = Math.max(widestLength, dim.width);
        }
        return dim;
    }
    
    public int getWidestItemWidth() {

        int numOfItems = this.getItemCount();
        Font font = this.getFont();
        FontMetrics metrics = this.getFontMetrics(font);
        int widest = 0;
        for (int i = 0; i < numOfItems; i++) {
            Object item = this.getItemAt(i);
            int lineWidth = metrics.stringWidth(item.toString());
            widest = Math.max(widest, lineWidth);
        }
    
        return widest + 5;
    }
    
    public void doLayout() {
        try {
            layingOut = true;
            super.doLayout();
        } finally {
            layingOut = false;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String t) {
        type = t;
    }
}
    

