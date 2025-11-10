import java.sql.*;

public class JDBCConnection {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {


        // import package
        // Load driver
        // Register driver
        // Create connection
        // Create statement
        // Execute Statement
        // Process the results
        // close connection



    String url="jdbc:postgresql://localhost:5432/Books";
    String username="postgres";
    String password="22222";
    String query = "select * from novel";


    Class.forName("org.postgresql.Driver");
    Connection con = DriverManager.getConnection(url, username,password);
    System.out.println("Connected to database successfully");
    Statement statement = con.createStatement();
    statement.execute(query);
    ResultSet resultSet = statement.getResultSet();

    // fetching all records

    while  (resultSet.next()) {
        System.out.print(resultSet.getInt(1) + " _ " );
        System.out.print(resultSet.getString(2) + " _ " );
        System.out.print(resultSet.getString(3) + " _ " );
        System.out.print(resultSet.getInt(4) + " _ " );
        System.out.println();
        }

//    resultSet.next();
//    resultSet.getString("bname");
//    System.out.println("Name of the book is " + resultSet.getString("bname"));


    con.close();
    System.out.println("Connection closed successfully");



    }







}
