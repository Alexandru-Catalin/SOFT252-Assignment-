/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Librari;
import Controller.Observer;


/**
 *
 * @author amarcu
 */


public class Observable {
    
    public void registerObserver(Observer observer);
    
    public void removeObserver(Observer observer);
    
    public void notifyObserver();
}
