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

//Creating the borrowing state using State pattern.
public class BorrowingState implements State,Serializable{

    /**
     *
     * @param i
     * @param c
     * @param length
     */
    @Override
    public void BorrowItem(Items i, Client c, int length) {
        i.setState(this);
    }

    @Override
    public void ReturnItem(Items i) {
        i.setState(new ReturnState());
        i.getBorrowInf().returnDate();
        
    }

    /**
     *
     */
    @Override
    public void printState() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
