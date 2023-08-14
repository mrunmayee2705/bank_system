package banking.management.system;

import java.sql.*;

public class Con1 {

    Connection connection;
    Statement statement;
    public Con1(){
        try{
            
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem", "root","mihir0305" );
            statement = connection.createStatement();
        

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
