/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Librari;

import Controller.State;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author amarcu
 */

//Creating the Superclass Items that save all the details of an item, the clients details beeing stored on the item when its borrowed.
public class Items implements Serializable{
    private State state;
    int id;
    private String title;
    private String category;
    private Borrow borrowInf;
    private float rating;
    private ArrayList<UserRating> userRating;
    private int extension;
    
    /**
     *
     * @param idNum
     * @param name
     * @param state
     * @param rating
     * @param extensionPeriod
     */
    public Items(int idNum, String name, State state, float rating, int extensionPeriod){
        id=idNum;
        title = name;
        borrowInf = new Borrow();
        this.state = state;
        rating = 0;
        userRating = new ArrayList<>();
        extension = 0;
    }

    /**
     *
     * @return
     */
    public int getExtension() {
        return extension;
    }

    /**
     *
     * @param extension
     */
    public void setExtension(int extension) {
        this.extension = extension;
    }

    /**
     *
     * @return
     */
    public Borrow getBorrowInf() {
        return borrowInf;
    }

    /**
     *
     * @param borrowInf
     */
    public void setBorrowInf(Borrow borrowInf) {
        this.borrowInf = borrowInf;
    }

    /**
     *
     * @return
     */
    public float getRating() {
        return rating;
    }

    /**
     *
     * @param rating
     */
    public void setRating(float rating) {
        this.rating = rating;
    }

    /**
     *
     * @return
     */
    public ArrayList<UserRating> getUserRating() {
        return userRating;
    }

    /**
     *
     * @param userRating
     */
    public void setUserRating(ArrayList<UserRating> userRating) {
        this.userRating = userRating;
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
    public String getCategory(){
        return category;
    }
    
    /**
     *
     * @param category
     */
    public void setCategory(String category){
        this.category = category;
    }
    
    /**
     *
     * @return
     */
    public String getTitle(){
        return title;
    }
    
    /**
     *
     * @param title
     */
    public void setTitle(String title){
        this.title = title;
    }
   
    /**
     *
     * @return
     */
    public State getState() {
        return state;
    }
    
    /**
     *
     * @param aThis
     */
    public void setState(State aThis) {
        state = aThis;
    }
    
    /**
     *
     * @param c
     * @param length
     */
    public void BorrowItem(Client c, int length){
        state.BorrowItem(this, c, length);
    }
    
    /**
     *
     */
    public void ReturnState(){
        state.ReturnItem(this);
    }
    
    
    //Creating and displaying the user Rating from 1 to 5 using radio buttons

    /**
     *
     * @param userVote
     * @param userId
     */
    public void addUserRating(int userVote, int userId)
    {
        int starRate;
        float averageRating = 0f;
        
        if(userVote == 0)
        {
            starRate = 1;
        }
        else if(userVote == 1)
        {
            starRate = 2;
        }
        else if(userVote == 2){
            starRate = 3;
        }
        else if(userVote == 3){
            starRate = 4;
        }
        else{
            starRate = 5;
        }
            
        UserRating u = new UserRating(userId, starRate);
        
        userRating.add(u);
        
        for (UserRating i : userRating) {
            averageRating += i.getUserRating();
        }
        
        rating = averageRating / userRating.size();
    }
    
    /**
     *
     * @param userId
     * @param userExtension
     */
    public void addExtension(int userId, int userExtension){
        
        int extensionVote;
        
        if (userExtension == 0) 
        {
            extensionVote = 14;
        }
        else
        {
            extensionVote = 31;
        }   
        extension = extensionVote;
    }
    
    
    //Search for user Rating, so an user that rate a book will not be able to rate the same book 2 times.

    /**
     *
     * @param id
     * @return
     */
    public int searchUserRating(int id)
    {
        for (UserRating i : userRating)
        {
            if (id == i.getUserID()) {
                return i.getUserRating();
            }
        }
        
        return 0;
    }
}
