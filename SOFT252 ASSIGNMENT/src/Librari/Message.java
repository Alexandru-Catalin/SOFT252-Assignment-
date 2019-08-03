/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Librari;

import java.util.ArrayList;

/**
 *
 * @author amarcu
 */
public class Message {
    
    private String requestMessage;
    private String extensionMessage;
    private int senderId;
    private int receiverId;
    private String message;

    public Message(String requestMessage, String extensionMessage, int senderId, int receiverId, String message) {
        this.requestMessage = requestMessage;
        this.extensionMessage = extensionMessage;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.message = message;
    }
    
    public String getRequestMessage() {
        return requestMessage;
    }

    public void setRequestMessage(String requestMessage) {
        this.requestMessage = requestMessage;
    }

    public String getExtensionMessage() {
        return extensionMessage;
    }

    public void setExtensionMessage(String extensionMessage) {
        this.extensionMessage = extensionMessage;
    }

    public int getSenderId() {
        return senderId;
    }

    public void setSenderId(int senderId) {
        this.senderId = senderId;
    }

    public int getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(int receiverId) {
        this.receiverId = receiverId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    
    
    
    
}
