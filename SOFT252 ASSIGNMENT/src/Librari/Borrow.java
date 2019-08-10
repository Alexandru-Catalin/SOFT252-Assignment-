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

//Checking if an item its borroed or not, seting extensions/taxes/borrowing time.
public class Borrow implements Serializable{
    
    private Boolean isBorrowed = false;
    private int userId;
    private int borrowLength;
    private LocalDate startDate;
    private LocalDate returnDate;
    private Boolean overdueDate;
    private int extension;
    private float overdueTaxes;
    
    /**
     *
     */
    public Borrow()
    {
        this.isBorrowed = false;
        this.userId = -1;
        this.overdueDate = false;
        this.extension = 0;
        this.overdueTaxes = 0f;
    }

    /**
     *
     * @return
     */
    public Boolean getIsBorrowed() {
        return isBorrowed;
    }

    /**
     *
     * @param isBorrowed
     */
    public void setIsBorrowed(Boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }

    /**
     *
     * @return
     */
    public int getUserId() {
        return userId;
    }

    /**
     *
     * @param userId
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     *
     * @return
     */
    public int getBorrowLength() {
        return borrowLength;
    }

    /**
     *
     * @param borrowLength
     */
    public void setBorrowLength(int borrowLength) {
        this.borrowLength = borrowLength;
    }

    /**
     *
     * @return
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    /**
     *
     * @param startDate
     */
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    /**
     *
     * @return
     */
    public LocalDate getReturnDate() {
        return returnDate;
    }

    /**
     *
     * @param returnDate
     */
    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    /**
     *
     * @return
     */
    public Boolean getOverdueDate() {
        return overdueDate;
    }

    /**
     *
     * @param overdueDate
     */
    public void setOverdueDate(Boolean overdueDate) {
        this.overdueDate = overdueDate;
    }

    /**
     *
     * @return
     */
    public int getExtention() {
        return extension;
    }

    /**
     *
     * @param extention
     */
    public void setExtention(int extention) {
        this.extension = extention;
    }
    
    //Creating the extension method

    /**
     *
     * @param borrowingTime
     */
    public void extensionAdd(int borrowingTime){
        int extension;
        
        if(borrowingTime == 0){
            extension = 14;
        }
        else
        {
            extension = 31;
        }
        
        this.returnDate = returnDate.plusDays(extension);
    }
    
    
    //Checking if an item its borrowed or not, and set the length of borrowing period for the Client that chan choose between 2weeks or 6 months

    /**
     *
     * @param userID
     * @param borrowingTime
     */
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
    
    
    //Check if an item tis overdue, If yes calculate the difference between the day it was borrow and return date and add taxes to it.

    /**
     *
     * @param currentDate
     */
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
    
    //Return items to the library, if an item its overdue the client can not return the items, first he have to pay the taxes for the overdue item and then return the rest of them.

    /**
     *
     */
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

    /**
     *
     * @return
     */
    public int getExtension() {
        return extension;
    }

    /**
     *
     * @param extension
     */
    public void setExtension(int extension) {
        this.extension = extension;
    }

    /**
     *
     * @return
     */
    public float getOverdueTaxes() {
        return overdueTaxes;
    }

    /**
     *
     * @param overdueTaxes
     */
    public void setOverdueTaxes(float overdueTaxes) {
        this.overdueTaxes = overdueTaxes;
    }
    
    
    
}
