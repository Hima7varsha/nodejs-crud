import java.sql.*;

public class GetStudents {
    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/24wh1a0569_himavarsha",
                "root",
                "G@1315"
            );

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + "\t" +
                    rs.getString("name") + "\t" +
                    rs.getInt("age")
                );
            }

            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}