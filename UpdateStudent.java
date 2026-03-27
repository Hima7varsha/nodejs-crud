import java.sql.*;

public class UpdateStudent {
    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/24wh1a0569_himavarsha",
                "root",
                "G@1315"
            );

            Statement stmt = con.createStatement();

            String query = "UPDATE students SET age = 25 WHERE id = 1";
            stmt.executeUpdate(query);

            System.out.println("Record Updated");

            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}