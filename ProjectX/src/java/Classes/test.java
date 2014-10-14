/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

/**
 *
 * @author Michael
 */
public class test {
    
    public static void main(String[] args){
        DBCmd d = new DBCmd();
        d.addUser(1, "123", "456", "789", "10");
        
        
        boolean check = d.validUser("7891", "101");
        if(check)
        {
            System.out.println("Matched");
        }
        else{
            System.out.println("Not match");
        }
    }
    
}
