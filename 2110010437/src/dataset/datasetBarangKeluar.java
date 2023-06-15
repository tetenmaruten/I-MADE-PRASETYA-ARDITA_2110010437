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
public class datasetBarangKeluar {
    private ArrayList<Date> tanggal;
    private ArrayList<String> kodeBarang;
    private ArrayList<Integer> jumlahKeluar;
        
    public datasetBarangKeluar(){
        tanggal = new ArrayList<Date>();
        kodeBarang = new ArrayList<String>();
        jumlahKeluar = new ArrayList<Integer>();
    }
    
    public void insertTanggal(Date isi){
        this.tanggal.add(isi);
    }
    
    public ArrayList<Date> getRecordTanggal(){
        return this.tanggal;
    }
    
    
    public void insertKodeBarang(String isi){
        this.kodeBarang.add(isi);
    }

    public ArrayList<String> getRecordKodeBarang(){
        return this.kodeBarang;
    }
    
    public void insertJumlahKeluar(Integer isi) {
        this.jumlahKeluar.add(isi);
    }

    public ArrayList<Integer> getRecordJumlahKeluar() {
        return this.jumlahKeluar;
    }
    
}
    
