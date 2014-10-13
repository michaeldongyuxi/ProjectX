/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Michael
 */
public class DBCmd {

//Should be a singleton
    private static final String DBUrl = "jdbc:mysql://localhost:3306";
    
    Connection connection;
    
    public DBCmd(){
        try{
            
            connection = DriverManager.getConnection(DBUrl, "root", null);
                    
            }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public boolean addUser(int id, String LastName, String FirstName, 
            String Email, String Username, String Password)
    {
        
        try {
            Connection c;
            c = DriverManager.getConnection(DBUrl, "root", null);
            Statement statement;
            statement = c.createStatement();
            statement.executeQuery("USE test");
            statement.executeQuery("SELECT * "
                + "FROM Customers");
            statement.executeUpdate("INSERT customer(id)"
                    + "VALUES(32);");
            System.out.println("Executed");
            //statement.executeUpdate("INSERT customer (LastName, FirstName, Email, Username, Password) VALUES('Dong', 'Yuxi','michaeldongyuxi@gmail.com', 'michaeldongyuxi', '1599951');");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }
    
}
