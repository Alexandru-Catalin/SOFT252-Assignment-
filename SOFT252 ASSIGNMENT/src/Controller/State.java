/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Librari.Items;
import com.sun.security.ntlm.Client;

/**
 *
 * @author amarcu
 */
public interface State {
    
    public void BorrowItem(Items i, Client c, int length);

    /**
     *
     * @param i
     */
    public void ReturnItem(Items i);
    public void printState();

}
