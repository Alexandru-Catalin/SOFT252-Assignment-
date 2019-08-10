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
    
    private int userID;
    private int userRating;

    /**
     *
     * @param userID
     * @param userRating
     */
    public UserRating(int userID, int userRating) {
        this.userID = userID;
        this.userRating = userRating;
    }

    /**
     *
     * @return
     */
    public int getUserID() {
        return userID;
    }

    /**
     *
     * @param userID
     */
    public void setUserID(int userID) {
        this.userID = userID;
    }

    /**
     *
     * @return
     */
    public int getUserRating() {
        return userRating;
    }

    /**
     *
     * @param userRating
     */
    public void setUserRating(int userRating) {
        this.userRating = userRating;
    }   
}
