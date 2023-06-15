/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;


/**
 *
 * @author ASUS
 */
public class BarangMasukDetail {
    private int idBmd;
    private String kodeBarang;
    private int jumlahMasuk;
    private String kodeSuratJalan;
    
    public BarangMasukDetail(){
        
    }
    
    public BarangMasukDetail(int idBmd) {
        this.idBmd = idBmd;
    }
    
    public BarangMasukDetail(int idBmd, String kodeBarang ) {
        this.idBmd = idBmd;
        this.kodeBarang = kodeBarang;
    }
    
    public BarangMasukDetail(int idBmd, String kodeBarang, int jumlahMasuk ) {
        this.idBmd = idBmd;
        this.kodeBarang = kodeBarang;
        this.jumlahMasuk = jumlahMasuk;
    }
    
    public BarangMasukDetail(int idBmd, String kodeBarang, int jumlahMasuk, String kodeSuratJalan ) {
        this.idBmd = idBmd;
        this.kodeBarang = kodeBarang;
        this.jumlahMasuk = jumlahMasuk;
        this.kodeSuratJalan = kodeSuratJalan;
        
    }
    
    public int getIdBmd() {
        return idBmd;
    }

    public void setIdBmd(int idBmd) {
        this.idBmd = idBmd;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }
    
    public int getJumlahMasuk() {
        return jumlahMasuk;
    }

    public void setJumlahMasuk(int jumlahMasuk) {
        this.jumlahMasuk = jumlahMasuk;
    }

    public String getKodeSuratJalan() {
        return kodeSuratJalan;
    }

    public void setKodeSuratJalan(String kodeSuratJalan) {
        this.kodeSuratJalan = kodeSuratJalan;
    }
}

