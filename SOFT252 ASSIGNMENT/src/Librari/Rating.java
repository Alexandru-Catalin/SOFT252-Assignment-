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
public class Rating {
    
    private float rating;
    private ArrayList<UserRating> userRating;

    public Rating() {
        this.userRating = new ArrayList<UserRating>();
    }
    
    public float getAverageRating(){
    
        return rating;
    }
    
    /**
     *
     * @param averageRating
     */
    public void setAverageRating(int averageRating)
    {
        this.rating = averageRating;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public ArrayList<UserRating> getUserRating() {
        return userRating;
    }

    public void setUserRating(ArrayList<UserRating> userRating) {
        this.userRating = userRating;
    }
    
    public void addUserRating(int userVote, String userId)
    {
        UserRating u = new UserRating(userId, userVote);
        
        userRating.add(u);
    }
    
    public void updateUserRating()
    {
        int total = 0;
        float averageRating;
        
        for(UserRating u: userRating)
        {
            total += u.getUserRating();
        }
        
        averageRating = (float) total/userRating.size();
        
        rating = averageRating;
    }
}
