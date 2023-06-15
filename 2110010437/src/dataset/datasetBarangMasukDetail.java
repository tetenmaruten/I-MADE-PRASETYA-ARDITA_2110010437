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
public class datasetBarangMasukDetail {
    
    private ArrayList<Integer> idBmd;
    private ArrayList<String> kodeBarang;
    private ArrayList<Integer> jumlahMasuk;
    private ArrayList<String> kodeSuratJalan;
    
    public datasetBarangMasukDetail(){
        
        idBmd = new ArrayList<Integer>();
        kodeBarang = new ArrayList<String>();
        jumlahMasuk = new ArrayList<Integer>();
        kodeSuratJalan = new ArrayList<String>();
        
    }
    
    public void insertIdBmd(Integer isi){
        this.idBmd.add(isi);
    }
    
    public ArrayList<Integer> getRecordIdBmd(){
        return this.idBmd;
    }
    
    public void insertKodeBarang(String isi){
        this.kodeBarang.add(isi);
    }
    
    public ArrayList<String> getRecordKodeBarang(){
        return this.kodeBarang;
    }
    
    public void insertJumlahMasuk(Integer isi){
        this.jumlahMasuk.add(isi);
    }
    
    public ArrayList<Integer> getRecordJumlahMasuk(){
        return this.jumlahMasuk;
    }
    
    public void insertKodeSuratJalan(String isi){
        this.kodeSuratJalan.add(isi);
    }
    
    public ArrayList<String> getRecordKodeSuratJalan(){
        return this.kodeSuratJalan;
    }
    
}
