/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Librari.Admin;
import Librari.Client;
import Librari.Items;
import Librari.Message;
import Librari.Seriliaser;
import Librari.User;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author amarcu
 */
public class ClientMenu extends javax.swing.JFrame {

    /**
     * Creates new form Librari
     */
    
    private Login loginUi;
    private String items;
    private ArrayList<Items> itemList;
    private ArrayList<Items> borrowList;
    private ArrayList<Items> cartList;
    private ArrayList<Items> returnList;
    private ArrayList<Items> extensionList;
    private ArrayList<Message> adminMessage;
    private ArrayList<Message> clientRequest;
    private ArrayList<Message> messageList;
    private ArrayList<Message> newsList;
    private ArrayList<Client> clientLog;
    private ArrayList<Admin> adminLog;
    private Client c;
    private ButtonGroup bg = new ButtonGroup();
    private ButtonGroup rb = new ButtonGroup();
    private ButtonGroup eb = new ButtonGroup();

    /**
     *
     * @return
     */
    public ArrayList<Client> getClientLog() {
        return clientLog;
    }

    /**
     *
     * @param clientLog
     */
    public void setClientLog(ArrayList<Client> clientLog) {
        this.clientLog = clientLog;
    }

    /**
     *
     * @return
     */
    public ArrayList<Admin> getAdminLog() {
        return adminLog;
    }

    /**
     *
     * @param adminLog
     */
    public void setAdminLog(ArrayList<Admin> adminLog) {
        this.adminLog = adminLog;
    }
    
    /**
     *
     * @return
     */
    public ArrayList<Message> getAdminMessage() {
        return adminMessage;
    }

    /**
     *
     * @param adminMessage
     */
    public void setAdminMessage(ArrayList<Message> adminMessage) {
        this.adminMessage = adminMessage;
    }
    
    
    
    private void groupButton(){
        bg.add(jRad1);
        bg.add(jRad2);
    }
    
    private void rateButton(){
        rb.add(jRB1);
        rb.add(jRB2);
        rb.add(jRB3);
        rb.add(jRB4);
        rb.add(jRB5);
    }
    
    private void extensionButton(){
        eb.add(jRE1);
        eb.add(jRE2);
    }
    
    /**
     *
     * @param l
     */
    public ClientMenu(Login l) {
          
        initComponents(); 
        groupButton();
        rateButton();
        extensionButton();
        
        this.itemList = new ArrayList<Items>();
        this.borrowList = new ArrayList<Items>();
        this.cartList = new ArrayList<Items>();
        this.returnList = new ArrayList<Items>();
        this.extensionList = new ArrayList<Items>();
        this.loginUi = l;
        this.adminMessage = new ArrayList<Message>();  
        this.clientRequest = new ArrayList<Message>();
        this.newsList = new ArrayList<Message>();
        this.messageList = new ArrayList<Message>();
        this.clientLog = new ArrayList<Client>();
        this.adminLog = new ArrayList<Admin>();
        
        String itemData = "";
        
        //Print all the Items in the ClientMenu witht their own ID.
        
        for (Items i : itemList){
            
            itemData += i.getId() + i.getTitle() + " " + i.getBorrowInf().getReturnDate() + " " + i.getRating() + "Stars, " + i.getCategory() + "\n";
            
        }
                        
        jSearch.setText(itemData);
        jSearch.setEditable(false);
        
    }
  
    /**
     *
     */
    public void setup()
    {
         String itemData = "";
        
        
        for (Items i : itemList){
            
            itemData += i.getId() + i.getTitle() + " " + i.getBorrowInf().getReturnDate() + " " + i.getRating() + "Stars, " + i.getCategory() + "\n";
            
        }
                        
        jSearch.setText(itemData);
        jSearch.setEditable(false);
    }

    /**
     *
     * @return
     */
    public ArrayList<Message> getMessageList() {
        return messageList;
    }

    //Receive admin private messages.

    /**
     *
     * @param messageList
     */
    public void setMessageList(ArrayList<Message> messageList) {
        this.messageList = messageList;
        
        String message = "";
        for (Message m : messageList){
           
            if (c.getId() == m.getReceiverId()) 
            {
                message += m.getRequestMessage()+ " " + "Admin ID:" + " " + m.getSenderId() + "\n";
            }
        }
 
        jMessages.setText(message);
    
    }
   
    /**
     *
     * @return
     */
    public ArrayList<Message> getNewsList() {
        return newsList;
    }

    //Receive admin news (for all the clients).

    /**
     *
     * @param newsList
     */
    public void setNewsList(ArrayList<Message> newsList) {
        this.newsList = newsList;
        String news = "";
        for (Message n : newsList){
            news += n.getRequestMessage()+ " " + "Admin ID:" + " " + n.getSenderId() + "\n";
        }
        jNews.setText(news);     
    }
    
    /**
     *
     * @param a
     */
    public void setClient(Client a)
    {
        c = a;
    }
    
    /**
     *
     * @param messageList
     */
    public void setAdminList(ArrayList<Message> messageList)
    {
        adminMessage = messageList;
        
    }

    /**
     *
     * @return
     */
    public ArrayList<Message> getClientRequest() {
        return clientRequest;
    }

    /**
     *
     * @param clientRequest
     */
    public void setClientRequest(ArrayList<Message> clientRequest) {
        this.clientRequest = clientRequest;
    }     
    
    /**
     *
     * @return
     */
    public String getItems() {
        return items;
    }

    /**
     *
     * @param items
     */
    public void setItems(String items) {
        this.items = items;
    }

    /**
     *
     * @return
     */
    public ArrayList<Items> getItemList() {
        return itemList;
    }

    /**
     *
     * @param itemList
     */
    public void setItemList(ArrayList<Items> itemList) {
        this.itemList = itemList;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSend = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jSearchItem = new javax.swing.JTextField();
        jSearchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jBorrowList = new javax.swing.JTextArea();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        jScrollPane2 = new javax.swing.JScrollPane();
        jClientItems = new javax.swing.JTextArea();
        label4 = new java.awt.Label();
        jScrollPane3 = new javax.swing.JScrollPane();
        jReturnField = new javax.swing.JTextArea();
        jBorrow = new javax.swing.JButton();
        jReturnButton = new javax.swing.JButton();
        jReturnItem = new javax.swing.JTextField();
        jItemButton = new javax.swing.JButton();
        jRequest = new javax.swing.JButton();
        label5 = new java.awt.Label();
        jExtension = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jExtensionField = new javax.swing.JTextArea();
        label6 = new java.awt.Label();
        jResources = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jSearch = new javax.swing.JTextArea();
        jRad1 = new javax.swing.JRadioButton();
        jRad2 = new javax.swing.JRadioButton();
        jTaxField = new javax.swing.JTextField();
        taxField = new java.awt.Label();
        jRB1 = new javax.swing.JRadioButton();
        jRB2 = new javax.swing.JRadioButton();
        jRB3 = new javax.swing.JRadioButton();
        jRB4 = new javax.swing.JRadioButton();
        jRB5 = new javax.swing.JRadioButton();
        jMoveExt = new javax.swing.JButton();
        jRE1 = new javax.swing.JRadioButton();
        jRE2 = new javax.swing.JRadioButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jResourceField = new javax.swing.JTextArea();
        WELCOME = new java.awt.Label();
        jLogOut = new javax.swing.JButton();
        label8 = new java.awt.Label();
        jScrollPane7 = new javax.swing.JScrollPane();
        jNews = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        jMessages = new javax.swing.JTextArea();
        label7 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Requests");

        label1.setText("Search Items ID");

        jSearchItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchItemActionPerformed(evt);
            }
        });

        jSearchButton.setText("Move To Borrow");
        jSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchButtonActionPerformed(evt);
            }
        });

        jBorrowList.setEditable(false);
        jBorrowList.setColumns(20);
        jBorrowList.setRows(5);
        jScrollPane1.setViewportView(jBorrowList);

        label2.setText("Borrow Items");

        label3.setText("Your Items");

        jClientItems.setEditable(false);
        jClientItems.setColumns(20);
        jClientItems.setRows(5);
        jScrollPane2.setViewportView(jClientItems);

        label4.setText("Return Items");

        jReturnField.setEditable(false);
        jReturnField.setColumns(20);
        jReturnField.setRows(5);
        jScrollPane3.setViewportView(jReturnField);

        jBorrow.setText("Borrow");
        jBorrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBorrowActionPerformed(evt);
            }
        });

        jReturnButton.setText("Return");
        jReturnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jReturnButtonActionPerformed(evt);
            }
        });

        jReturnItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jReturnItemActionPerformed(evt);
            }
        });

        jItemButton.setText("Move to Return");
        jItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemButtonActionPerformed(evt);
            }
        });

        jRequest.setText("Request");
        jRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRequestActionPerformed(evt);
            }
        });

        label5.setText("Extension Request");

        jExtensionField.setEditable(false);
        jExtensionField.setColumns(20);
        jExtensionField.setRows(5);
        jScrollPane5.setViewportView(jExtensionField);

        label6.setText("Resources Request");

        jResources.setText("Request");
        jResources.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jResourcesActionPerformed(evt);
            }
        });

        jSearch.setColumns(20);
        jSearch.setRows(5);
        jScrollPane6.setViewportView(jSearch);

        jRad1.setSelected(true);
        jRad1.setText("2 Weeks");
        jRad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRad1ActionPerformed(evt);
            }
        });

        jRad2.setText("6 Months");

        jTaxField.setEditable(false);
        jTaxField.setText("0.00");

        taxField.setText("£");

        jRB1.setSelected(true);
        jRB1.setText("1 Star");

        jRB2.setText("2 Stars");
        jRB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB2ActionPerformed(evt);
            }
        });

        jRB3.setText("3 Stars");

        jRB4.setText("4 Stars");

        jRB5.setText("5 Stars");

        jMoveExt.setText("Move to Extension");
        jMoveExt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMoveExtActionPerformed(evt);
            }
        });

        jRE1.setSelected(true);
        jRE1.setText("2 Weeks Extension");

        jRE2.setText("1 Mounth Extension");

        jResourceField.setColumns(20);
        jResourceField.setRows(5);
        jScrollPane4.setViewportView(jResourceField);

        javax.swing.GroupLayout jSendLayout = new javax.swing.GroupLayout(jSend);
        jSend.setLayout(jSendLayout);
        jSendLayout.setHorizontalGroup(
            jSendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSendLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jSendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jSendLayout.createSequentialGroup()
                        .addGroup(jSendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jSendLayout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jSendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRE1)
                                    .addComponent(jRE2)))
                            .addGroup(jSendLayout.createSequentialGroup()
                                .addComponent(jExtension, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jRequest)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jSendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4)
                            .addGroup(jSendLayout.createSequentialGroup()
                                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jResources)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jSendLayout.createSequentialGroup()
                        .addGroup(jSendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jSendLayout.createSequentialGroup()
                                .addComponent(jSearchItem, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSearchButton))
                            .addGroup(jSendLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jSendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRB3)
                                    .addComponent(jRB4)
                                    .addComponent(jRB5)
                                    .addComponent(jRB2)
                                    .addComponent(jRB1)))
                            .addGroup(jSendLayout.createSequentialGroup()
                                .addComponent(jReturnItem, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jItemButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jMoveExt))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jSendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jSendLayout.createSequentialGroup()
                                .addComponent(jReturnButton)
                                .addGap(18, 18, 18)
                                .addComponent(jTaxField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(taxField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jSendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jSendLayout.createSequentialGroup()
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jBorrow)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRad1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRad2)
                                    .addContainerGap(45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        jSendLayout.setVerticalGroup(
            jSendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jSendLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jSendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jSendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBorrow)
                        .addComponent(jRad1)
                        .addComponent(jRad2))
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jSendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jSendLayout.createSequentialGroup()
                        .addGroup(jSendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSearchItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSearchButton))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jSendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jSendLayout.createSequentialGroup()
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jSendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(taxField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jSendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jReturnItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jItemButton)
                                .addComponent(jMoveExt)
                                .addComponent(jReturnButton)
                                .addComponent(jTaxField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jSendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jSendLayout.createSequentialGroup()
                        .addComponent(jRB1)
                        .addGap(18, 18, 18)
                        .addComponent(jRB2)
                        .addGap(18, 18, 18)
                        .addComponent(jRB3)
                        .addGap(18, 18, 18)
                        .addComponent(jRB4)
                        .addGap(18, 18, 18)
                        .addComponent(jRB5))
                    .addGroup(jSendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jSendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jSendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jExtension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRequest))
                    .addGroup(jSendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jResources)
                        .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jSendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jSendLayout.createSequentialGroup()
                        .addComponent(jRE1)
                        .addGap(18, 18, 18)
                        .addComponent(jRE2))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(185, 185, 185))
        );

        WELCOME.setText("WELCOME");

        jLogOut.setText("Log Out");
        jLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogOutActionPerformed(evt);
            }
        });

        label8.setText("News");

        jNews.setEditable(false);
        jNews.setColumns(20);
        jNews.setRows(5);
        jScrollPane7.setViewportView(jNews);

        jMessages.setColumns(20);
        jMessages.setRows(5);
        jScrollPane8.setViewportView(jMessages);

        label7.setText("Admin messages");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(540, 540, 540)
                        .addComponent(WELCOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 308, Short.MAX_VALUE)
                                .addComponent(jLogOut))
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(WELCOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLogOut))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSend, javax.swing.GroupLayout.PREFERRED_SIZE, 848, Short.MAX_VALUE)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8)
                        .addGap(28, 28, 28))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //When the LogOut button its pressed, i m clearing all the text areas and saving the lists to display them on the next run of the program.
    private void jLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogOutActionPerformed
     
        this.setVisible(false);
        loginUi.setVisible(true);
        jBorrowList.setText("");
        jSearchItem.setText("");
        jReturnItem.setText("");
        jReturnField.setText("");
        jExtension.setText("");
        jExtensionField.setText("");
        jResourceField.setText("");
        jClientItems.setText("");
        
        Seriliaser itemLt = new Seriliaser("Items.ser");
        itemLt.writeList(itemList);
        Seriliaser clientLt = new Seriliaser("Clients.ser");
        clientLt.writeList(clientLog);
        Seriliaser newsLt = new Seriliaser("News.ser");
        newsLt.writeList(newsList);
        Seriliaser extLt = new Seriliaser("Extension.ser");
        extLt.writeList(extensionList);
        Seriliaser borrowLt = new Seriliaser("Borrow.ser");
        borrowLt.writeList(borrowList);
        Seriliaser adminLt = new Seriliaser("AdminMessages.ser");
        adminLt.writeList(adminMessage);
        
    }//GEN-LAST:event_jLogOutActionPerformed

    
    //Check the input ID with the resource id and move it in to the extention request field
    private void jMoveExtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMoveExtActionPerformed
        jClientItems.getText();
        jReturnItem.getText();

        String searchItem = "";
        String searchList = "";
        String testPass = "";

        for (Items i : cartList)
        {
            if (Integer.parseInt(jReturnItem.getText()) == i.getId())
            {
                i.getRating();
                i.BorrowItem(c, 0);
                returnList.add(i);
            }
        }

        String returnData = "";

        float totalTax = 0f;
        for (Items i : returnList)
        {
            returnData += i.getId() + i.getTitle() + " " + "return in " + i.getBorrowInf().getReturnDate() + " " + i.searchUserRating(c.getId()) + "Stars" + " " + c.getFirstName() +"\n";
            totalTax = i.getBorrowInf().getOverdueTaxes();
        }
        String taxes = totalTax + " ";
        jTaxField.setText(taxes);
        jExtensionField.setText(returnData);
    }//GEN-LAST:event_jMoveExtActionPerformed

    private void jRB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB2ActionPerformed

    private void jRad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRad1ActionPerformed

    }//GEN-LAST:event_jRad1ActionPerformed

    
    //Send a message to the Admin to request a new resource to be added to the librari.
    private void jResourcesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jResourcesActionPerformed

        jResourceField.getText();
        jResources.getText();
        
        String request = "";
        
        request += jResourceField.getText();
        
        Message r = new Message(request, "", c.getId(), 0, "");
        
        clientRequest.add(r);
        
    }//GEN-LAST:event_jResourcesActionPerformed

    
    //Send an extension request to the admin, with the period that the cliend would like to extend his borrowing time.
    private void jRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRequestActionPerformed

        jExtensionField.getText();
        jExtension.getText();
        jClientItems.getText();

        String searchItem = "";
        String searchList = "";
        String testPass = "";

        for (Items i : cartList)
        {
            if (Integer.parseInt(jExtension.getText()) == i.getId())
            {

                if (jRE1.isSelected() == true)
                {
                    i.addExtension(c.getId(),0);
                    System.out.println("2W");
                }
                else
                {
                    i.addExtension(c.getId(), 1);
                    System.out.println("1M");
                }

                i.getExtension();
                i.BorrowItem(c, 0);
                extensionList.add(i);
            }
        }
        String returnExtention = "";

        for (Items i : extensionList)
        {
            returnExtention += i.getId()+ " " + i.getTitle() + " " + "return in " + i.getBorrowInf().getReturnDate()+ " " + i.getExtension() + " days" + " " + i.searchUserRating(c.getId()) + "Stars"+ " " + c.getFirstName() + " " + "userId:" +c.getId()+"\n";
        }

        Message e = new Message(returnExtention, "", c.getId(), 0, "");

        adminMessage.add(e);
    }//GEN-LAST:event_jRequestActionPerformed

    
    //Rateing the book using radio buttons from 1 to 5, and move the book in to the Return Field, where it also check if the item is overdue and if the clients need to pay an extra tax.
    private void jItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemButtonActionPerformed
        // TODO add your handling code here:

        jClientItems.getText();
        jReturnItem.getText();

        String searchItem = "";
        String searchList = "";

        String testPass = "";

        for (Items i : cartList)
        {
            if (Integer.parseInt(jReturnItem.getText()) == i.getId())
            {

                if (jRB1.isSelected() == true)
                {
                    i.addUserRating(0, c.getId());
                    System.out.println("1");
                }
                else if(jRB2.isSelected() == true){
                    i.addUserRating(1, c.getId());
                    System.out.println("2");
                }
                else if (jRB3.isSelected() == true){
                    i.addUserRating(2, c.getId());
                    System.out.println("3");
                }
                else if(jRB4.isSelected()== true){
                    i.addUserRating(3, c.getId());
                    System.out.println("4");
                }
                else{
                    i.addUserRating(4, c.getId());
                    System.out.println("5");
                }

                i.getRating();
                i.BorrowItem(c, 0);
                returnList.add(i);
            }
        }

        String returnData = "";

        float totalTax = 0f;
        for (Items i : returnList)
        {
            returnData += i.getId() + i.getTitle() + " " + "return in " + i.getBorrowInf().getReturnDate() + " " + i.searchUserRating(c.getId()) + "Stars" +"\n";
            totalTax = i.getBorrowInf().getOverdueTaxes();
        }
        String taxes = totalTax + " ";
        jTaxField.setText(taxes);
        jReturnField.setText(returnData);
    }//GEN-LAST:event_jItemButtonActionPerformed

    private void jReturnItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jReturnItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jReturnItemActionPerformed

    
    //Make the payment for the Tax(if necessary) and return the resource in to the librari.
    private void jReturnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jReturnButtonActionPerformed

        jReturnField.getText();
        jSearch.getText();
        jTaxField.getText();

        String searchItem = " ";
        String searchList = " ";

        String testPass = " ";
        int j = 0;
        Boolean isFound = false;
        for (Items i : returnList)
        {

            if (Integer.parseInt(jReturnItem.getText()) == i.getId())
            {

                if(i.getBorrowInf().getOverdueDate() == true)
                {
                    jReturnButton.setText("Pay and Return");
                    System.out.println("Matched");

                    if (i.getBorrowInf().getOverdueDate() == false)
                    {
                        System.out.println("Not overdue");
                        i.ReturnState();
                        System.out.println("Returned");
                        isFound = true;
                    }
                }
                else
                {
                    System.out.println("Matched");
                    if (i.getBorrowInf().getOverdueDate() == false)
                    {
                        System.out.println("Not overdue");
                        i.ReturnState();
                        System.out.println("Returned");
                        isFound = true;
                    }
                }
                jReturnButton.setText("Return");
            }
            if (isFound == false)
            j++;
        }

        cartList.remove(j);

        String returnData = " ";

        for (Items i : cartList)
        {
            returnData += i.getId() + i.getTitle() + " " + "return in " + i.getBorrowInf().getReturnDate() +"\n";

            if(i.getBorrowInf().getOverdueDate() == true){
                returnData += i.getBorrowInf().getOverdueTaxes();
            }

        }

        String refresh = "";
        for (Items i : itemList){

            refresh += i.getId() + i.getTitle() + " " + i.getBorrowInf().getReturnDate() + " " + i.getRating() + "Stars" + "\n";
        }

        jSearch.setText(refresh);
        jClientItems.setText(returnData);

        jBorrowList.setText("");
        returnList.clear();
    }//GEN-LAST:event_jReturnButtonActionPerformed

    
    //Borrow and add the resource to the client. (the book its storying all the client details, admin checking them easyer).
    private void jBorrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBorrowActionPerformed
        // TODO add your handling code here:
        jBorrowList.getText();
        jSearch.getText();

        String searchItem = "";
        String searchList = "";

        String testPass = "";

        for (Items i : itemList)
        {
            if (Integer.parseInt(jSearchItem.getText()) == i.getId())
            {

                if (jRad1.isSelected() == true)
                {
                    i.getBorrowInf().userBorrow(c.getId(), 0);
                    cartList.add(i);
                    c.getBorrowClientList().add(i);
                }
                else
                {
                    i.getBorrowInf().userBorrow(c.getId(), 1);
                    cartList.add(i);
                    c.getBorrowClientList().add(i);
                }

                i.getBorrowInf().checkOverdue(LocalDate.now());
            }
        }

        String chartData = "";

        for (Items i : c.getBorrowClientList())
        {
            chartData += i.getId() + i.getTitle() + " " + "return in " + i.getBorrowInf().getReturnDate() +"\n";
        }

        jClientItems.setText(chartData);
        borrowList.clear();
    }//GEN-LAST:event_jBorrowActionPerformed

    
    //Borrow an item by ID, and check if that item its already borrowed by another client.
    private void jSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchButtonActionPerformed
        jSearchItem.getText();
        jSearch.getText();

        String searchItem = "";
        String searchList = "";

        String testPass = "";

        for (Items i : itemList)
        {
            if (Integer.parseInt(jSearchItem.getText()) == i.getId())
            {
                if (i.getBorrowInf().getIsBorrowed() == false)
                {
                    borrowList.add(i);
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Already borrowed!");
                }
            }
        }

        String borrowData = "";

        for (Items i : borrowList)
        {
            borrowData += i.getId() + i.getTitle() + " " + "return in " + i.getBorrowInf().getReturnDate() +"\n";
        }

        jBorrowList.setText(borrowData);

        System.out.println(c.getFirstName());
    }//GEN-LAST:event_jSearchButtonActionPerformed

    private void jSearchItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSearchItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClientMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label WELCOME;
    private javax.swing.JButton jBorrow;
    private javax.swing.JTextArea jBorrowList;
    private javax.swing.JTextArea jClientItems;
    private javax.swing.JTextField jExtension;
    private javax.swing.JTextArea jExtensionField;
    private javax.swing.JButton jItemButton;
    private javax.swing.JButton jLogOut;
    private javax.swing.JTextArea jMessages;
    private javax.swing.JButton jMoveExt;
    private javax.swing.JTextArea jNews;
    private javax.swing.JRadioButton jRB1;
    private javax.swing.JRadioButton jRB2;
    private javax.swing.JRadioButton jRB3;
    private javax.swing.JRadioButton jRB4;
    private javax.swing.JRadioButton jRB5;
    private javax.swing.JRadioButton jRE1;
    private javax.swing.JRadioButton jRE2;
    private javax.swing.JRadioButton jRad1;
    private javax.swing.JRadioButton jRad2;
    private javax.swing.JButton jRequest;
    private javax.swing.JTextArea jResourceField;
    private javax.swing.JButton jResources;
    private javax.swing.JButton jReturnButton;
    private javax.swing.JTextArea jReturnField;
    private javax.swing.JTextField jReturnItem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextArea jSearch;
    private javax.swing.JButton jSearchButton;
    private javax.swing.JTextField jSearchItem;
    private javax.swing.JPanel jSend;
    private javax.swing.JTextField jTaxField;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label taxField;
    // End of variables declaration//GEN-END:variables
}
