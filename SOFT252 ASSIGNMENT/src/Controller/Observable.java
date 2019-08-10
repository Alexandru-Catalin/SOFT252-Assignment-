/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Controller.Observer;


/**
 *
 * @author amarcu
 */


public interface Observable {
    
    /**
     *
     * @param observer
     * @return
     */
    Boolean registerObserver(Observer observer);
    
    /**
     *
     * @param observer
     * @return
     */
    Boolean removeObserver(Observer observer);
    
    /**
     *
     */
    void notifyObserver();
}
