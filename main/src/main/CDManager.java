/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import DAO.DAO;
import entity.CD;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class CDManager {

    private List<CD> list;
    private DAO dao;

    public CDManager() {
        list = new ArrayList<>();
        dao = new DAO();
    }

    //add
    public void addCD(CD theCD) {
        list.add(theCD);
    }

    //dao
    //print
    public void print() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }

    public List<CD> getList() {
        return list;
    }

    public void setList(List<CD> list) {
        this.list = list;
    }

    public void saveCD(File f) {
        dao.saveObject(f, list);
    }

    public void readCD(File f) {
        setList(dao.readObject(f));
    }

    public List<CD> searchByCollection(String collection) {
        List<CD> templist = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getCollection().contains(collection)){
                templist.add(list.get(i));
            }
        }
        
        return templist;
    }

    public List<CD> searchByType(String type) {
        List<CD> templist = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getType().contains(type)){
                templist.add(list.get(i));
            }
        }
        return templist;
    }

    public List<CD> searchByTitle(String title) {
        List<CD> templist = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getTitle().contains( title)){
                templist.add(list.get(i));
            }
        }
        return templist;
    }

    public List<CD> searchByPrice(double price) {
        List<CD> templist = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getPrice()<=price){
                templist.add(list.get(i));
            }
        }
        return templist;
    }
}
