/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Librari;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author amarcu
 */
public class Borrow implements Serializable{
    
    private Boolean isBorrowed = false;
    private int userId;
    private int borrowLength;
    private LocalDate startDate;
    private LocalDate returnDate;
    private Boolean overdueDate;
    private int extension;
    private float overdueTaxes;
    
    public Borrow()
    {
        this.isBorrowed = false;
        this.userId = -1;
        this.overdueDate = false;
        this.extension = 0;
        this.overdueTaxes = 0f;
    }

    public Boolean getIsBorrowed() {
        return isBorrowed;
    }

    public void setIsBorrowed(Boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBorrowLength() {
        return borrowLength;
    }

    public void setBorrowLength(int borrowLength) {
        this.borrowLength = borrowLength;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public Boolean getOverdueDate() {
        return overdueDate;
    }

    public void setOverdueDate(Boolean overdueDate) {
        this.overdueDate = overdueDate;
    }

    public int getExtention() {
        return extension;
    }

    public void setExtention(int extention) {
        this.extension = extention;
    }
    
    
    public void extensionAdd(int userID, int borrowingTime){
        int extension;
        
        this.userId = userID;
        
        if(borrowingTime == 0){
            extension = 14;
        }
        else
        {
            extension = 31;
        }
        
        this.returnDate = returnDate.plusDays(extension);
    }
    
    public void userBorrow(int userID, int borrowingTime)
    {
        int borrowDate;
        
        this.isBorrowed = true;
        this.userId = userID;
        this.startDate = LocalDate.now();
        
        if(borrowingTime == 0)
        {
            borrowDate = 14;
        }
        else
        {
            borrowDate = 31 * 6;
        }
        
        this.returnDate = startDate.plusDays(borrowDate);
        this.overdueDate = false;
        this.extension = 0;
    }
    
    public void checkOverdue(LocalDate currentDate)
    {
        if(returnDate.isBefore(currentDate))
        {
            overdueDate = true;
            int i = returnDate.compareTo(currentDate);
            Math.abs(i);
            overdueTaxes = i * 10;
        }
    }
    
    public void returnDate()
    {
        if(overdueDate == true)
        {
            java.lang.System.out.println("Item cannot be returned until you pay the tax.");
        }
        else
        {
            isBorrowed = false;
            userId = -1;
            startDate = null;
            returnDate = null;
            extension = 0;
        }
    }

    public int getExtension() {
        return extension;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }

    public float getOverdueTaxes() {
        return overdueTaxes;
    }

    public void setOverdueTaxes(float overdueTaxes) {
        this.overdueTaxes = overdueTaxes;
    }
    
    
    
}
