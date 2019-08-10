/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Controller.State;
import Librari.Admin;
import Librari.Books;
import Librari.Client;
import Librari.DVDs;
import Librari.Items;
import Librari.Message;
import Librari.ReturnState;
import Librari.Seriliaser;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author amarcu
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    
    private ClientMenu clientUi;
    private AdminMenu adminUi;
    private ArrayList<Message> adminMessage;
    private ArrayList<Message> clientRequest;
    private ArrayList<Items> itemList;
    private ArrayList<Message> newsList;
    private ArrayList<Message> messageList;
    private ArrayList<Client> clientLog;
    private ArrayList<Admin> adminLog;
    private ArrayList<Items> extensionList;
    private ArrayList<Items> borrowList;
    
    
    //Creating the ressources and storing them.

    /**
     *
     */
    public Login() {
        initComponents();
        
        clientUi = new ClientMenu(this);
        adminUi = new AdminMenu(this);
        this.adminMessage = new ArrayList<Message>();
        this.itemList = new ArrayList<Items>();
        this.clientRequest = new ArrayList<Message>();
        this.newsList = new ArrayList<Message>();
        this.messageList = new ArrayList<Message>();
        this.clientLog = new ArrayList<Client>();
        this.adminLog = new ArrayList<Admin>();
        
        State state = new ReturnState();
        float rating = 0f;
        Books h = new Books(1," Learn C++",state, rating, 0);
        DVDs p = new DVDs(2," Java For Everyone",state, rating, 0);
        Books c = new Books(3," My First Game",state, rating, 0);
        Books a = new Books(800," The Raven", state, rating, 0);
        Books s = new Books(801," Book Of Secrets",state, rating, 0);
        Books d = new Books(802," Best Magicians",state, rating, 0);
        Books f = new Books(803," The Adventures of Corvus Corax",state, rating, 0);
        Books g = new Books(400," Learn Japanese",state, rating, 0);
        
        Books i = new Books(900," World War 2",state, rating, 0);
        Books k = new Books(808," Room 408",state, rating, 0);
        Books l = new Books(700," Best Painters",state, rating, 0);
        
        Books v = new Books(903," Dinosaurs",state, rating, 0);
        
        DVDs e = new DVDs(804," Best Friends",state, rating, 0);
        DVDs r = new DVDs(805," Skeleton Army",state, rating, 0);
        DVDs t = new DVDs(806," Monster World",state, rating, 0);
        DVDs y = new DVDs(807," Vampires Night",state, rating, 0);
        DVDs j = new DVDs(500," Atomic Bomb",state, rating, 0); 
        DVDs o = new DVDs(901," World War 1",state, rating, 0);
        
        DVDs z = new DVDs(902," Life of Boris",state, rating, 0);
        DVDs x = new DVDs(100," Psychology Explained for Everyone",state, rating, 0);
        
        System.out.println(f.getCategory());
        System.out.println(e.getCategory());
        
        itemList.add(h);
        itemList.add(p);
        itemList.add(c);
        itemList.add(f);
        itemList.add(e);
        itemList.add(r);
        itemList.add(t);
        itemList.add(y);
        itemList.add(g);
        itemList.add(a);
        itemList.add(j);
        itemList.add(i);
        itemList.add(o);
        itemList.add(s);
        itemList.add(k);
        itemList.add(l);
        itemList.add(z);
        itemList.add(x);
        itemList.add(d);
        itemList.add(v);
        
        
        //Locate/Read the data.
        
        Seriliaser itemLt = new Seriliaser("Items.ser");
 
        itemList = (ArrayList<Items>) itemLt.readList();
        
        Seriliaser clientLt = new Seriliaser("Clients.ser");
        clientLog = (ArrayList<Client>) clientLt.readList();
        
        Seriliaser newsLt = new Seriliaser("News.ser");
        newsList = (ArrayList<Message>) newsLt.readList();
        
        Seriliaser adminLt = new Seriliaser("AdminMessages.ser");
        adminMessage = (ArrayList<Message>) adminLt.readList();
    }

    /**
     *
     * @return
     */
    public ArrayList<Items> getBorrowList() {
        return borrowList;
    }

    /**
     *
     * @param borrowList
     */
    public void setBorrowList(ArrayList<Items> borrowList) {
        this.borrowList = borrowList;
    }
    
    /**
     *
     * @return
     */
    public ArrayList<Items> getExtensionList() {
        return extensionList;
    }

    /**
     *
     * @param extensionList
     */
    public void setExtensionList(ArrayList<Items> extensionList) {
        this.extensionList = extensionList;
    }
    
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
    public ArrayList<Message> getMessageList() {
        return messageList;
    }

    /**
     *
     * @param messageList
     */
    public void setMessageList(ArrayList<Message> messageList) {
        this.messageList = messageList;
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
    public ArrayList<Message> getNewsList() {
        return newsList;
    }

    /**
     *
     * @param newsList
     */
    public void setNewsList(ArrayList<Message> newsList) {
        this.newsList = newsList;
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
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jUserId = new javax.swing.JTextField();
        jPass = new javax.swing.JPasswordField();
        Login = new javax.swing.JButton();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        jUserId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUserIdActionPerformed(evt);
            }
        });

        jPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPassActionPerformed(evt);
            }
        });

        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        label1.setText("Password");

        label2.setText("Wellcome in Librari");

        label3.setText("Enter ID");

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPass, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(jUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(Login)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Login)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //Creates 5 clients with different ID's, when the Login button is pressed it will check if the ID is corresponding to the password. Also checking if its a client or an admin.
    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
        jUserId.getText();
        jPass.getPassword();
        
        Client c = new Client(100, "Dan", "Dan", "Dan");
        Client v = new Client(101, "James", "James", "James");
        Client b = new Client(102, "Alex", "Alex", "Alex");
        Client n = new Client(103, "Bob", "Bob", "Bob");
        Client m = new Client(104, "Paul", "Paul", "");
        
        Admin a = new Admin(1, "Corvus", "Corvus", "Corvus");
        
        adminLog.add(a);
        clientLog.add(c);
        clientLog.add(v);
        clientLog.add(b);
        clientLog.add(n);
        clientLog.add(m);
        
        for(Client u : clientLog)
        {
            if(u.getId() == Integer.parseInt(jUserId.getText()))
            {
                String testPass = "";
                for (int i = 0; i < jPass.getPassword().length; i++) 
                {
                    testPass += jPass.getPassword()[i];
                }
                
                if(u.getPassword().equals(testPass))
                {
                    
                    this.setVisible(false);
                    clientUi.setVisible(true);
                    clientUi.setClient(u);
                    clientUi.setAdminMessage(adminMessage);
                    clientUi.setAdminList(adminMessage);
                    clientUi.setClientRequest(clientRequest);
                    clientUi.setNewsList(newsList);
                    clientUi.setItemList(itemList);
                    clientUi.setMessageList(messageList);
                    clientUi.setup();
                    clientUi.setAdminLog(adminLog);
                    clientUi.setClientLog(clientLog);
                    jUserId.setText("");
                    jPass.setText("");
                    return;
                }   
                else{
                    JOptionPane.showMessageDialog(this, "Wrong Password");
                }
            }        
        }    
        
        for(Admin u : adminLog)
        {
            if(u.getId() == Integer.parseInt(jUserId.getText()))
            {
                String testPass = "";
                for (int i = 0; i < jPass.getPassword().length; i++) 
                {
                    testPass += jPass.getPassword()[i];
                }
                
                if(u.getPassword().equals(testPass))
                {
                    
                    this.setVisible(false);
                    adminUi.setVisible(true);
                    adminUi.setAdmin(u);
                    adminUi.setAdminMessage(adminMessage);
                    adminUi.setClientRequest(clientRequest);
                    adminUi.setNewsList(newsList);
                    adminUi.setItemList(itemList);
                    adminUi.setMessageList(messageList);  
                    adminUi.setAdmminLog(adminLog);
                    adminUi.setClientLog(clientLog);
                    jUserId.setText("");
                    jPass.setText("");
                    return;
                }   
                else {
                    JOptionPane.showMessageDialog(this, "Wrong Password");
                }
            }        
        }    
        
    }//GEN-LAST:event_LoginActionPerformed
    
    private void jUserIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUserIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jUserIdActionPerformed

    private void jPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPassActionPerformed
        
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPasswordField jPass;
    private javax.swing.JTextField jUserId;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    // End of variables declaration//GEN-END:variables
}
