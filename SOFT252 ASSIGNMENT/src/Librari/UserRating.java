/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Librari;

import java.io.Serializable;

/**
 *
 * @author amarcu
 */
public class UserRating implements Serializable{
    
    private String userID;
    private int userRating;

    public UserRating(String userID, int userRating) {
        this.userID = userID;
        this.userRating = userRating;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public int getUserRating() {
        return userRating;
    }

    public void setUserRating(int userRating) {
        this.userRating = userRating;
    }   
}
