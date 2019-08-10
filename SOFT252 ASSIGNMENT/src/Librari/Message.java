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

//Creating the messages system, to be able to send messages as a client to the admin, and an admin to be able to send news/messages to the clients.
public class Message {
    
    private String requestMessage;
    private String extensionMessage;
    private int senderId;
    private int receiverId;
    private String message;

    /**
     *
     * @param requestMessage
     * @param extensionMessage
     * @param senderId
     * @param receiverId
     * @param message
     */
    public Message(String requestMessage, String extensionMessage, int senderId, int receiverId, String message) {
        this.requestMessage = requestMessage;
        this.extensionMessage = extensionMessage;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.message = message;
    }
    
    /**
     *
     * @return
     */
    public String getRequestMessage() {
        return requestMessage;
    }

    /**
     *
     * @param requestMessage
     */
    public void setRequestMessage(String requestMessage) {
        this.requestMessage = requestMessage;
    }

    /**
     *
     * @return
     */
    public String getExtensionMessage() {
        return extensionMessage;
    }

    /**
     *
     * @param extensionMessage
     */
    public void setExtensionMessage(String extensionMessage) {
        this.extensionMessage = extensionMessage;
    }

    /**
     *
     * @return
     */
    public int getSenderId() {
        return senderId;
    }

    /**
     *
     * @param senderId
     */
    public void setSenderId(int senderId) {
        this.senderId = senderId;
    }

    /**
     *
     * @return
     */
    public int getReceiverId() {
        return receiverId;
    }

    /**
     *
     * @param receiverId
     */
    public void setReceiverId(int receiverId) {
        this.receiverId = receiverId;
    }

    /**
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    
    
    
    
}
