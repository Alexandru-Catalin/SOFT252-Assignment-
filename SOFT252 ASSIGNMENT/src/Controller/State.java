/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Librari.Client;
import Librari.Items;


/**
 *
 * @author amarcu
 */
//Using State pattern to be able to borrow and return Items
public interface State {
    
    /**
     *
     * @param i
     * @param c
     * @param length
     */
    public void BorrowItem(Items i, Client c, int length);

    /**
     *
     * @param i
     */
    public void ReturnItem(Items i);

    /**
     *
     */
    public void printState();

}
