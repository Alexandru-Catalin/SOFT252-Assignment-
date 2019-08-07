/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Librari;
import java.time.LocalDate;

/**
 *
 * @author amarcu
 */

//Creating a system to be able to read the currentDate (to be able to calculate the borrowing length and taxes).
public class System {
    
    private LocalDate currentDate;
    
    public System()
    {
        this.currentDate = LocalDate.now();
    }

    public LocalDate getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(LocalDate currentDate) {
        this.currentDate = currentDate;
    }
    
}
