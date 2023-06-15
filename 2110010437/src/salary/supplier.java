/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

/**
 *
 * @author ASUS
 */
public class supplier {
    private String kodeSupplier;
    private String namaSupplier;
    private String alamat;
    private String noHp;

    public supplier() {
    }
    
    public supplier(String kodeSupplier ) {
        this.kodeSupplier = kodeSupplier;
        
    }
    
    public supplier(String kodeSupplier, String namaSupplier) {
        this.kodeSupplier = kodeSupplier;
        this.namaSupplier = namaSupplier;
       
    }
    
    public supplier(String kodeSupplier, String namaSupplier, String alamat ) {
        this.kodeSupplier = kodeSupplier;
        this.namaSupplier = namaSupplier;
        this.alamat = alamat;
        
    }
    
    
    public supplier(String kodeSupplier, String namaSupplier, String alamat, String noHp) {
        this.kodeSupplier = kodeSupplier;
        this.namaSupplier = namaSupplier;
        this.alamat = alamat;
        this.noHp = noHp;
    }
    
    
    public String getKodeSupplier() {
        return kodeSupplier;
    }

    public void setKodeSupplier(String kodeSupplier) {
        this.kodeSupplier = kodeSupplier;
    }

    public String getNamaSupplier() {
        return namaSupplier;
    }

    public void setNamaSupplier(String namaSupplier) {
        this.namaSupplier = namaSupplier;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }
    
}

