/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class datasetUser {
    
    private ArrayList<Integer> userId;
    private ArrayList<String> username;
    private ArrayList<String> namaUser;
    private ArrayList<String> password;
    private ArrayList<String> email;
    private ArrayList<String> telepon;
    private ArrayList<String> foto;
    private ArrayList<String> hakAkses;
    private ArrayList<Date> createdAt;
    private ArrayList<Date> updatedAt;
    
    public datasetUser(){
        
        
        userId = new ArrayList<Integer>();
        username = new ArrayList<String>();
        namaUser = new ArrayList<String>();
        password = new ArrayList<String>();
        email = new ArrayList<String>();
        telepon = new ArrayList<String>();
        foto = new ArrayList<String>();
        hakAkses = new ArrayList<String>();
        createdAt = new ArrayList<Date>();
        updatedAt = new ArrayList<Date>();
    }
    
    public void insertUserId(Integer isi){
        this.userId.add(isi);
    }
    
    public ArrayList<Integer> getRecordUserId(){
        return this.userId;
    }
    
    public void insertUsername(String isi){
        this.username.add(isi);
    }
    
    public ArrayList<String> getRecordUsername(){
        return this.username;
    }
    
    public void insertNamaUser(String isi){
        this.namaUser.add(isi);
    }
    
    public ArrayList<String> getRecordNamaUser(){
        return this.namaUser;
    }
    
    public void insertPassword(String isi){
        this.password.add(isi);
    }
    
    public ArrayList<String> getRecordPassword(){
        return this.password;
    }
    
    public void insertEmail(String isi){
        this.email.add(isi);
    }
    
    public ArrayList<String> getRecordEmail(){
        return this.email;
    }
    
    public void insertTelepon(String isi){
        this.telepon.add(isi);
    }
    
    public ArrayList<String> getRecordTelepon(){
        return this.telepon;
    }
    
    public void insertFoto(String isi){
        this.foto.add(isi);
    }
    
    public ArrayList<String> getRecordFoto(){
        return this.foto;
    }
    
    public void insertHakAkses(String isi){
        this.hakAkses.add(isi);
    }
    
    public ArrayList<String> getRecordHakAkses(){
        return this.hakAkses;
    }
    
    public void insertCreatedAt(Date isi){
        this.createdAt.add(isi);
    }
    
    public ArrayList<Date> getRecordCreatedAt(){
        return this.createdAt;
    }
    
    public void insertUpdatedAt(Date isi){
        this.updatedAt.add(isi);
    }
    
    public ArrayList<Date> getRecordUpdateAt(){
        return this.updatedAt;
    }
    
}
