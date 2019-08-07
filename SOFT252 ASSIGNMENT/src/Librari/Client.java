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

//Creating the clients subclass that extends the User superclass
public class Client extends User {
    
    private ArrayList<Items> borrowClientList; 
    private ArrayList<Message> clientMessage;
    
    public Client(int id, String password, String firstName, String lastName){
        super(id, password, firstName, lastName);
        //creating a special list of items, that will display the owned item only for the client that own that item. (in his inventory)
        this.borrowClientList = new ArrayList<Items>();
        this.clientMessage = new ArrayList<Message>();
    } 

    public ArrayList<Message> getClientMessage() {
        return clientMessage;
    }

    public void setClientMessage(ArrayList<Message> clientMessage) {
        this.clientMessage = clientMessage;
    }

    public ArrayList<Items> getBorrowClientList() {
        return borrowClientList;
    }

    public void setBorrowClientList(ArrayList<Items> borrowList) {
        this.borrowClientList = borrowList;
    }
    
    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}

