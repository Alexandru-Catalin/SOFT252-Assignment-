/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Librari;
import java.io.*;

/**
 *
 * @author amarcu
 */
public class Seriliaser {
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Seriliaser(String filename){
        name = filename;
    }
    
    public Serializable readList()
    {
        Serializable loadedList = null;
        try {
        FileInputStream fileIn = new FileInputStream(name);
        ObjectInputStream in = new ObjectInputStream(fileIn);
        loadedList = (Serializable) in.readObject();
        in.close();
        fileIn.close();
        }catch (IOException i) {
            java.lang.System.out.println("File not found.");
            i.printStackTrace();
        }catch (ClassNotFoundException c) {
            java.lang.System.out.println("Class not found");
            c.printStackTrace();
        }
        return loadedList;
    }
    
    public boolean writeList(Serializable list){
        try {
            FileOutputStream fileOut = new FileOutputStream(name);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(list);
            out.close();
            fileOut.close();
            java.lang.System.out.println("Serialized data is saved in: " + name);
            return true;
         } catch (IOException i) {
            java.lang.System.out.println("Failed to load!");
            i.printStackTrace();
            return false;
         } 
    }   
}
