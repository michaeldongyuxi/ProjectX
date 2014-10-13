/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Michael
 */
public class DBTest {
    
    public static void main(String[] args){
        
        try{
        String dbURL = "jdbc:mysql://localhost:3306";
        String username = "root";
        String password = "michael931021";
        
        Connection connection = (Connection) DriverManager.getConnection(dbURL, username, null);
        
        Statement statement = connection.createStatement();
        statement.executeQuery("USE test");
        ResultSet result = statement.executeQuery("SELECT * "
                + "FROM Customers");
        
        while(result.next())
        {
            System.out.println("Here");
        }
        
        }
        
        catch(SQLException e){
            for(Throwable t : e)
                t.printStackTrace();
        }

        
        
    }
    
}
