/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Librari;
/**
 *
 * @author amarcu
 */
//Creating admin subclass of User(superclass).
public class Admin extends User {
    
    /**
     *
     * @param id
     * @param password
     * @param firstName
     * @param lastName
     */
    public Admin(int id, String password, String firstName, String lastName){
        super(id, password, firstName, lastName);
    } 

    /**
     *
     */
    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
