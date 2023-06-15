/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class datasetSupplier {
    
    private ArrayList<String> kodeSupplier;
    private ArrayList<String> namaSupplier;
    private ArrayList<String> alamat;
    private ArrayList<String> noHp;
    
    
    public datasetSupplier(){
        kodeSupplier= new ArrayList<String>();
        namaSupplier = new ArrayList<String>();
        alamat  = new ArrayList<String>();
        noHp = new ArrayList<String>();
    }
    
    
    public void insertKodeSupplier(String isi){
        this.kodeSupplier.add(isi);
    }
    
    public ArrayList<String> getRecordKodeSupplier(){
        return this.kodeSupplier;
    }
    
    public void insertNamaSupplier(String isi){
        this.namaSupplier.add(isi);
    }
    
    public ArrayList<String> getRecordNamaSupplier(){
        return this.namaSupplier;
    }
    
    public void insertalamat(String isi){
        this.alamat.add(isi);
    }
    
    public ArrayList<String> getRecordalamat(){
        return this.alamat;
    }
    
    public void insertNoHp(String isi){
        this.noHp.add(isi);
    }
    
    public ArrayList<String> getRecordNoHp(){
        return this.noHp;
    }

    
    
}
