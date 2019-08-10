/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Librari;
import Controller.Observer;
import java.io.Serializable;

/**
 *
 * @author amarcu
 */

//Creating the superClass User that store all the details of a client/admin
public abstract class User implements Observer, Serializable {
    private int id;
    private String password;
    private String firstName;
    private String lastName;
    
    /**
     *
     * @param lID
     * @param lPassword
     * @param lFirstName
     * @param lLastName
     */
    public User (int lID, String lPassword, String lFirstName, String lLastName){
        id=lID;
        password = lPassword;
        firstName = lFirstName;
        lastName = lLastName;
    }
    
    /**
     *
     * @return
     */
    public int getId(){
        return id;
    }
    
    /**
     *
     * @param id
     */
    public void setId(int id){
        this.id = id;
    }
    
    /**
     *
     * @return
     */
    public String getPassword(){
        return password;
    }
    
    /**
     *
     * @param password
     */
    public void setPassword(String password){
        this.password = password;
    }
    
    /**
     *
     * @return
     */
    public String getFirstName(){
        return firstName;
    }
    
    /**
     *
     * @param firstName
     */
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    /**
     *
     * @return
     */
    public String getLastName(){
        return lastName;
    }
    
    /**
     *
     * @param lastName
     */
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
}
