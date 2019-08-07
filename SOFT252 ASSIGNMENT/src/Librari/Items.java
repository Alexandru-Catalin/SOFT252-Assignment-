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
public class Items implements Serializable{
    private State state;
    int id;
    private String title;
    private String category;
    private Borrow borrowInf;
    private float rating;
    private ArrayList<UserRating> userRating;
    private int extension;
    
    public Items(int idNum, String name, State state, float rating, int extensionPeriod){
        id=idNum;
        title = name;
        borrowInf = new Borrow();
        this.state = state;
        rating = 0;
        userRating = new ArrayList<>();
        extension = 0;
    }

    public int getExtension() {
        return extension;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }

   
    
    public Borrow getBorrowInf() {
        return borrowInf;
    }

    public void setBorrowInf(Borrow borrowInf) {
        this.borrowInf = borrowInf;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public ArrayList<UserRating> getUserRating() {
        return userRating;
    }

    public void setUserRating(ArrayList<UserRating> userRating) {
        this.userRating = userRating;
    }
    
    
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getCategory(){
        return category;
    }
    
    public void setCategory(String category){
        this.category = category;
    }
    
    public String getTitle(){
        return title;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
   

     public State getState() {
        return state;
    }
    
    public void setState(State aThis) {
        state = aThis;
    }
    
    public void BorrowItem(Client c, int length){
        state.BorrowItem(this, c, length);
    }
    
    public void ReturnState(){
        state.ReturnItem(this);
    }
    
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
