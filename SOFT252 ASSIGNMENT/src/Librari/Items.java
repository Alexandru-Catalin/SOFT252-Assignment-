/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Librari;

import Controller.State;

import java.io.Serializable;

/**
 *
 * @author amarcu
 */
public class Items implements Serializable{
    private State state;
    int id;
    private String title;
    private int category;
    private float userRating;
    private Borrow borrowInf;

    
    public Items(int idNum, String name, int type, State state){
        id=idNum;
        title = name;
        category = type;
        borrowInf = new Borrow();
        this.state = state;
    }

    public Borrow getBorrowInf() {
        return borrowInf;
    }

    public void setBorrowInf(Borrow borrowInf) {
        this.borrowInf = borrowInf;
    }
    
    
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getCategory(){
        return category;
    }
    
    public void setCategory(int category){
        this.category = category;
    }
    
    public String getTitle(){
        return title;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public float getUserRating(){
        return userRating;
    }
    
    public void setUserRating(float userRating){
        this.userRating = userRating;
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
}
