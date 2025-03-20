package ticketing.system;

import java.sql.*;
import java.text.SimpleDateFormat;

public class flightdb {

    static final String DB_URL = "jdbc:mysql://localhost:3306/flightdb";
    static final String USER = "root";
    static final String PASS = "";

    private static Connection conn = null;
    private static Statement stmt = null;
    private static PreparedStatement pstmt = null;

    public static void main(String[] args) {
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeConnection();
        }
    }

    private static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new SQLException("MySQL JDBC Driver not found");
        }
    }

    public static class Flight {
        private int id;
        private String flightType;
        private String destination;
        private String fromLocation;
        private String flightTier;
        private String name;
        private String passport;
        private String paymentMode;
        private String flightDate;
        private String returnDate;

        public Flight(int id, String flightType, String destination, String fromLocation, String flightTier, 
                      String name, String passport, String paymentMode, String flightDate, String returnDate) {
            this.id = id;
            this.flightType = flightType;
            this.destination = destination;
            this.fromLocation = fromLocation;
            this.flightTier = flightTier;
            this.name = name;
            this.passport = passport;
            this.paymentMode = paymentMode;
            this.flightDate = flightDate;
            this.returnDate = returnDate;
        }

        public int getId() {
            return id;
        }

        public String getFlightType() {
            return flightType;
        }

        public String getDestination() {
            return destination;
        }

        public String getFromLocation() {
            return fromLocation;
        }

        public String getFlightTier() {
            return flightTier;
        }

        public String getName() {
            return name;
        }

        public String getPassport() {
            return passport;
        }

        public String getPaymentMode() {
            return paymentMode;
        }

        public String getFlightDate() {
            return flightDate;
        }

        public String getReturnDate() {
            return returnDate;
        }

        @Override
        public String toString() {
            return "ID: " + id + "\nFlight Type: " + flightType + "\nDestination: " + destination +
                   "\nFrom: " + fromLocation + "\nFlight Tier: " + flightTier + "\nName: " + name +
                   "\nPassport: " + passport + "\nPayment Mode: " + paymentMode + "\nFlight Date: " + flightDate +
                   "\nReturn Date: " + returnDate + "\n-------------------------";
        }
    }

    public static int addFlight(String flightType, String destination, String fromLocation, String flightTier, 
                                String name, String passport, String paymentMode, String flightDate, String returnDate) {
        String query = "INSERT INTO flights (flight_type, destination, from_location, flight_tier, name, passport, payment_mode, flight_date, return_date) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        int generatedId = -1;
        SimpleDateFormat dbFormat = new SimpleDateFormat("yyyy-MM-dd");

        try (Connection conn = getConnection(); 
             PreparedStatement pstmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {

            var parsedFlightDate = dbFormat.parse(flightDate);
            var parsedReturnDate = dbFormat.parse(returnDate);
            String formattedFlightDate = dbFormat.format(parsedFlightDate);
            String formattedReturnDate = dbFormat.format(parsedReturnDate);

            pstmt.setString(1, flightType);
            pstmt.setString(2, destination);
            pstmt.setString(3, fromLocation);
            pstmt.setString(4, flightTier);
            pstmt.setString(5, name);
            pstmt.setString(6, passport);
            pstmt.setString(7, paymentMode);
            pstmt.setString(8, formattedFlightDate);
            pstmt.setString(9, formattedReturnDate);

            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        generatedId = generatedKeys.getInt(1);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return generatedId;
    }

    public static void viewFlights() {
        String query = "SELECT * FROM flights";

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {

            boolean hasFlights = false;
            while (rs.next()) {
                hasFlights = true;
                Flight flight = new Flight(
                        rs.getInt("id"),
                        rs.getString("flight_type"),
                        rs.getString("destination"),
                        rs.getString("from_location"),
                        rs.getString("flight_tier"),
                        rs.getString("name"),
                        rs.getString("passport"),
                        rs.getString("payment_mode"),
                        rs.getString("flight_date"),
                        rs.getString("return_date")
                );
                System.out.println(flight);
            }

            if (!hasFlights) {
                System.out.println("No flights found in the database.");
            }

        } catch (SQLException e) {
            System.err.println("Error while retrieving flight records: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static Flight viewFlightById(int id) {
        String query = "SELECT * FROM flights WHERE id = ?";

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, id);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    Flight flight = new Flight(
                            rs.getInt("id"),
                            rs.getString("flight_type"),
                            rs.getString("destination"),
                            rs.getString("from_location"),
                            rs.getString("flight_tier"),
                            rs.getString("name"),
                            rs.getString("passport"),
                            rs.getString("payment_mode"),
                            rs.getString("flight_date"),
                            rs.getString("return_date")
                    );
                    return flight;
                } else {
                    flight_mod.alert("No flight found with ID: " + id);
                    return null;
                }
            }

        } catch (SQLException e) {
            flight_mod.alert("Error while retrieving flight record with ID " + id + ": " + e.getMessage());
            e.printStackTrace();
             return null;
        }
    }

    public static boolean modifyFlight(int id, String flightType, String destination, String fromLocation, 
                                        String flightTier, String name, String passport, String paymentMode, 
                                        String flightDate, String returnDate) {
        String query = "UPDATE flights SET flight_type = ?, destination = ?, from_location = ?, flight_tier = ?, " +
                       "name = ?, passport = ?, payment_mode = ?, flight_date = ?, return_date = ? WHERE id = ?";

        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, flightType);
            pstmt.setString(2, destination);
            pstmt.setString(3, fromLocation);
            pstmt.setString(4, flightTier);
            pstmt.setString(5, name);
            pstmt.setString(6, passport);
            pstmt.setString(7, paymentMode);
            pstmt.setString(8, flightDate);
            pstmt.setString(9, returnDate);
            pstmt.setInt(10, id);

            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Flight record updated successfully.");
                return true;
            } else {
                System.out.println("No flight record found with ID: " + id);
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }


    public static boolean deleteFlight(int id) {
        String query = "DELETE FROM flights WHERE id = ?";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, id);
            int rowsAffected = pstmt.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    private static void closeConnection() {
        try {
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
