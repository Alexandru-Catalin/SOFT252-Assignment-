/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Librari;

import Controller.State;

/**
 *
 * @author amarcu
 */
public class Books extends Items {
    
    public Books(int idNum, String name, State state, float rating, int extension) {
        super(idNum, name, state, rating, extension);
        this.setCategory("BOOK");
    }
    
 

   

}
