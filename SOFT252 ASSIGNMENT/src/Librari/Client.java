/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Librari;

import java.util.ArrayList;

/**
 *
 * @author amarcu
 */
public class Client extends User {
    
      private ArrayList<Message> clientMessage;
    
    public Client(int id, String password, String firstName, String lastName){
        super(id, password, firstName, lastName);
        this.clientMessage = new ArrayList<Message>();
    } 

    public ArrayList<Message> getClientMessage() {
        return clientMessage;
    }

    public void setClientMessage(ArrayList<Message> clientMessage) {
        this.clientMessage = clientMessage;
    }
    
    
    
    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}

