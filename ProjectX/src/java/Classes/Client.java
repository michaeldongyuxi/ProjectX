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
public class Client {
    
    private String email = "";
    private String people = "";
    
    public Client()
    {
        email="";
        people="";
    }
    
    public Client(String email, String people)
    {
        this.email = email;
        this.people = people;
    }
}
