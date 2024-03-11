/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import entity.CD;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class DAO {

    public DAO() {

    }

    public void saveObject(File f, List<CD> list) {
        try {
            FileOutputStream out = new FileOutputStream(f);
            ObjectOutputStream obj = new ObjectOutputStream(out);
            obj.writeObject(list);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public List<CD> readObject(File f) {
        List<CD> list = new ArrayList<>();
        try {
            FileInputStream out = new FileInputStream(f);
            ObjectInputStream obj = new ObjectInputStream(out);
            list = (List<CD>) obj.readObject();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }
}
