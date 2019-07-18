/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Librari;

import java.util.Observer;

/**
 *
 * @author amarcu
 */
public class Clients extends User {
    
    public Clients(int id, String password, String firstName, String lastName){
        super(id, password, firstName, lastName);
    } 

    @Override
    public void Update(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}

