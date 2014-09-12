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
    
    private String name;
    
    private String email;
    
    private String people;
    
    public Client()
    {
        name="";
        email="";
        people="";
    }
    
    public Client(String name, String email, String people){
        this.name = name;
        this.email = email;
        this.people = people;
    }
    
    public Client(String email, String people)
    {
        this.email = email;
        this.people = people;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the people
     */
    public String getPeople() {
        return people;
    }

    /**
     * @param people the people to set
     */
    public void setPeople(String people) {
        this.people = people;
    }
    
    
    
    
}
