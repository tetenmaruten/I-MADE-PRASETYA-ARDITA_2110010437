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
public class datasetBarang {
    private ArrayList<String> kodeBarang;
    private ArrayList<String> namaBarang;
    private ArrayList<String> namaSupplier;
    private ArrayList<String> warna;
    private ArrayList<String> type;
    private ArrayList<Integer> stok;
    private ArrayList<String> satuan;
    
    public datasetBarang(){
        kodeBarang = new ArrayList<String>();
        namaBarang = new ArrayList<String>();
        namaSupplier  = new ArrayList<String>();
        warna = new ArrayList<String>();
        type = new ArrayList<String>();
        stok = new ArrayList<Integer>();
        satuan = new ArrayList<String>();
    }
    
    
    public void insertKodeBarang(String isi){
        this.kodeBarang.add(isi);
    }
    
    public ArrayList<String> getRecordKodeBarang(){
        return this.kodeBarang;
    }
    
    public void insertNamaBarang(String isi){
        this.namaBarang.add(isi);
    }
    
    public ArrayList<String> getRecordNamaBarang(){
        return this.namaBarang;
    }

    public void insertNamaSupplier(String isi){
        this.namaSupplier.add(isi);
    }
    
    public ArrayList<String> getRecordNamaSupplier(){
        return this.namaSupplier;
    }
    
    public void insertWarna(String isi){
        this.warna.add(isi);
    }
    
    public ArrayList<String> getRecordWarna(){
        return this.warna;
    }
    
    public void insertType(String isi){
        this.type.add(isi);
    }
    
    public ArrayList<String> getRecordtype(){
        return this.type;
    }
    
    public void insertStok(Integer isi){
        this.stok.add(isi);
    }
    
    public ArrayList<Integer> getRecordStok(){
        return this.stok;
    }
    public void insertSatuan(String isi){
        this.satuan.add(isi);
    }
    
    public ArrayList<String> getRecordSatuan(){
        return this.satuan;
    }
    
}
