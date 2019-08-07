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
//Creating the ReturnState using State pattern.
public class ReturnState implements State,Serializable{

    @Override
    public void BorrowItem(Items i, Client c, int length) 
    {
        i.setState(new BorrowingState());
        i.getBorrowInf();
        i.getBorrowInf().userBorrow(c.getId(), length);
    }

    
    @Override
    public void ReturnItem(Items i) {
        i.setState(this);
    }

    @Override
    public void printState() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
