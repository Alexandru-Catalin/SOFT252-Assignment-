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
public class Items {
    int id;
    private String title;
    private int category;
    private float userRating;
    
    Items(int idNum, String name, int type){
        id=idNum;
        title = name;
        category = type;
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
}
