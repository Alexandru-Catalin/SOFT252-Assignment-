/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Librari;
import Controller.Observable;
import Controller.Observer;
import java.util.ArrayList;
/**
 *
 * @author amarcu
 */
public abstract class ConcreteLib implements Observable{
    
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    
    @Override
    public void registerObserver(Observer observer){
    observer.Update(id);
    observers.add(observer);
    }

    @Override
    public Boolean removeObserver(Observer observer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notifyObserver() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
