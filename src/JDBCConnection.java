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
    String query = "select bname from novel where bid = 1";


    Class.forName("org.postgresql.Driver");
    Connection con = DriverManager.getConnection(url, username,password);
    System.out.println("Connected to database successfully");
    Statement statement = con.createStatement();
    statement.execute(query);
    ResultSet resultSet = statement.getResultSet();

    resultSet.next();
    resultSet.getString("bname");
    System.out.println("Name of the book is " + resultSet.getString("bname"));


    con.close();
    System.out.println("Connection closed successfully");



    }







}
