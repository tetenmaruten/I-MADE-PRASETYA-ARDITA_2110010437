/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class BarangMasuk {
    private Date tanggal;
    private String kodeSupplier;
    private String kodeSuratJalan;
    
    
    public BarangMasuk(){
        
    }
    
    public BarangMasuk(Date tanggal ) {
        this.tanggal = tanggal;        
    }
    
    public BarangMasuk(Date tanggal, String kodeSupplier ) {
        this.tanggal = tanggal;
        this.kodeSupplier = kodeSupplier;
    }
    
    public BarangMasuk(Date tanggal, String kodeSupplier, String kodeSuratJalan ) {
        this.tanggal = tanggal;
        this.kodeSupplier = kodeSupplier;
        this.kodeSuratJalan = kodeSuratJalan;
        
    }
    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
       this.tanggal = tanggal;
    }

    public String getKodeSupplier() {
        return kodeSupplier;
    }

    public void setKodeSupplier(String kodeSupplier) {
        this.kodeSupplier = kodeSupplier;
    }

    public String getKodeSuratJalan() {
        return kodeSuratJalan;
    }

    public void setKodeSuratJalan(String kodeSuratJalan) {
        this.kodeSuratJalan = kodeSuratJalan;
    }
}
