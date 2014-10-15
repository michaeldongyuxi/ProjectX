/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
    private static final String DBUrl = "jdbc:mysql://localhost:3306/oq";
    
    Connection connection;
    Statement statement;
    
    public DBCmd(){
        try{
            //Register JDBC Driver
            Class.forName("com.mysql.jdbc.Driver").newInstance(); 
            connection = DriverManager.getConnection(DBUrl, "root", null);
            statement = connection.createStatement();
            }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public boolean addUser(int id, String LastName, String FirstName, 
            String Email, String Password, int Type)
    {
        String cmdString = addUserCommand(id,LastName,FirstName,Email,Password, Type);
        try {
            System.out.println("Executed");
            statement.executeUpdate(cmdString);
            ResultSet rs = statement.executeQuery("SELECT * FROM customer;");
            printQuery(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }
    
    private String addUserCommand(int id, String LastName, String FirstName, 
            String Email, String Password, int Type){
        
        StringBuilder mutableString = new StringBuilder();
        mutableString.append("INSERT User");
        mutableString.append("(id, LastName, FirstName, Email, Password, Type)");
        mutableString.append("VALUES");
        mutableString.append("(");
        mutableString.append(id).append(",");
        mutableString.append("'").append(LastName).append("'").append(",");
        mutableString.append("'").append(FirstName).append("'").append(",");
        mutableString.append("'").append(Email).append("'").append(",");
        mutableString.append("'").append(Password).append("',");
        mutableString.append(Type);
        mutableString.append(");");
        
                
        return mutableString.toString();
    }
    
    public void deleteUser(String email){
        String cmdString = deleteUserCommand(email);
        try{
            statement.executeUpdate(cmdString);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    private String deleteUserCommand(String email){
        StringBuilder mutableString = new StringBuilder();
        mutableString.append("DELETE FROM customer");
        mutableString.append("WHERE email=").append(email);
        return mutableString.toString();
    }
    
    public int[] validUser(String Email, String Password){
        ResultSet rs = null;
        int[] result = new int[2];
        String queryString = 
                "SELECT Email, Password, Type "
                + "FROM User "
                + "WHERE Email='"+Email+"'"
                + "AND Password='"+Password+"';";
        System.out.println("QueryString is: "+queryString);
        
        try{
            rs = statement.executeQuery(queryString);
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        try{
        if(this.getRowCount(rs)>=1)
        {
              int Type = -1;
              result[0]=1;
              
              if(rs.absolute(1)){
                  Type = rs.getInt("Type");
                  result[1]=Type;
                  System.out.println("Type is: "+result[1]);
              }
              
              return result;
        }
        else{
            result[0]=0;
            return result;
        }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return result;
        
    }
    
    private boolean validAdmin(String Email, String Password){
        
        return false;
    }
    
    public String printQuery(ResultSet rs){
        StringBuilder mutableString = new StringBuilder();
        int columnNumber;
        try{
            
        columnNumber = rs.getMetaData().getColumnCount();
        System.out.println("ColumnNumber is: "+columnNumber);
        while(rs.next()){
            for(int i = 1; i <= columnNumber; i++)
            {
                String output = rs.getString(i);
                System.out.println(output);
            }
           }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return null;
    }
    
    
    public int getRowCount(ResultSet rs){
        int rowCount=0;
        try{
        if(rs.last())
        {
            rowCount = rs.getRow();
            rs.beforeFirst();
        }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rowCount;
    }

    
    
}
