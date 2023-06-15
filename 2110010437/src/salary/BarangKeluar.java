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
public class BarangKeluar {
    private Date tanggal;
    private String kodeBarang;
    private int jumlahKeluar;
    
    
    public BarangKeluar(){
        
    }
    
    public BarangKeluar(Date tanggal) {
        this.tanggal = tanggal;
    }
    
    public BarangKeluar(Date tanggal, String kodeBarang ) {
        this.tanggal = tanggal;
        this.kodeBarang = kodeBarang;   
    }
    
    public BarangKeluar(Date tanggal, String kodeBarang, int jumlahKeluar ) {
        this.tanggal = tanggal;
        this.kodeBarang = kodeBarang;
        this.jumlahKeluar = jumlahKeluar;   
    }
    
    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public int getJumlahKeluar() {
        return jumlahKeluar;
    }

    public void setJumlahKeluar(int jumlahKeluar) {
        this.jumlahKeluar = jumlahKeluar;
    }
}

