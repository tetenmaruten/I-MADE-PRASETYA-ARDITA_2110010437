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
public class datasetBarangMasuk {
    

    private ArrayList<Date> tanggal;
    private ArrayList<String> kodeSupplier;
    private ArrayList<String> kodeSuratJalan;

    public datasetBarangMasuk(){
        tanggal = new ArrayList<Date>();
        kodeSupplier = new ArrayList<String>();
        kodeSuratJalan = new ArrayList<String>();
    }
    
    public void insertTanggal(Date isi){
        this.tanggal.add(isi);
    }
    
    public ArrayList<Date> getRecordTanggal(){
        return this.tanggal;
    }
    
    public void insertKodeSupplier(String isi){
        this.kodeSupplier.add(isi);
    }
    
    public ArrayList<String> getRecordKodeSupplier(){
        return this.kodeSupplier;
    }
    
    
    public void insertKodeSuratJalan(String isi){
        this.kodeSuratJalan.add(isi);
    }
    
    public ArrayList<String> getRecordKodeSuratJalan(){
        return this.kodeSuratJalan;
    }
}
