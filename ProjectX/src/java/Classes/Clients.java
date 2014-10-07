/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

import java.util.ArrayList;

/**
 *
 * @author Michael
 */
public class Clients {
    
    private static Clients clients;
    
    private ArrayList clientsList;
    
    private Clients(){}
    
    public static Clients getClients(){
        
        if(clients == null)
        {
            clients = new Clients();
            clients.init();
        }
        return clients;
        
    }
    
    private Clients init(){
        clients.clientsList = new ArrayList();
        return null;
    }
    
    public void addCust(Client cust){
        clientsList.add(cust);
    }
    
    public void removeCust(Client cust){
        clientsList.remove(cust);
    }
    
    
}
