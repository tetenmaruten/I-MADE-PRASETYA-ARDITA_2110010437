/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

/**
 *
 * @author ASUS
 */
public class Barang {
    private String kodeBarang;
    private String namaBarang;
    private String namaSupplier;
    private String warna;
    private String type;
    private int stok;
    private String satuan;
    
    
    
    public Barang(){
    }
    
    public Barang(String kodeBarang ) {
    this.kodeBarang = kodeBarang;
    }
    
    public Barang(String kodeBarang, String namaBarang ) {
    this.kodeBarang = kodeBarang;
    this.namaBarang = namaBarang;
    }
    
    public Barang(String kodeBarang, String namaBarang, String namaSupplier ) {
    this.kodeBarang = kodeBarang;
    this.namaBarang = namaBarang;
    this.namaSupplier = namaSupplier;
    }
    
    public Barang(String kodeBarang, String namaBarang, String namaSupplier, String warna) {
    this.kodeBarang = kodeBarang;
    this.namaBarang = namaBarang;
    this.namaSupplier = namaSupplier;
    this.warna = warna;
    }
    
    public Barang(String kodeBarang, String namaBarang, String namaSupplier, String warna, String type) {
    this.kodeBarang = kodeBarang;
    this.namaBarang = namaBarang;
    this.namaSupplier = namaSupplier;
    this.warna = warna;
    this.type = type;
    }
    
    public Barang(String kodeBarang, String namaBarang, String namaSupplier, String warna, String type, int stok ) {
    this.kodeBarang = kodeBarang;
    this.namaBarang = namaBarang;
    this.namaSupplier = namaSupplier;
    this.warna = warna;
    this.type = type;
    this.stok = stok;
    }
    
    public Barang(String kodeBarang, String namaBarang, String namaSupplier, String warna, String type, int stok, String satuan ) {
    this.kodeBarang = kodeBarang;
    this.namaBarang = namaBarang;
    this.namaSupplier = namaSupplier;
    this.warna = warna;
    this.type = type;
    this.stok = stok;
    this.satuan = satuan;
    }
    
    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getNamaSupplier() {
        return namaSupplier;
    }

    public void setNamaSupplier(String namaSupplier) {
        this.namaSupplier = namaSupplier;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }
}

