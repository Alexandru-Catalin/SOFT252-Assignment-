/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Librari.Books;
import Librari.Seriliaser;

/**
 *
 * @author amarcu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Books b = new Books(10, "Test", 1);
        System.out.println(b.getTitle());
        Seriliaser serialiser = new Seriliaser ("test.ser");
        serialiser.writeList(b);
    }
    
}
