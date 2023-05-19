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
    public void getInfo(boolean showAddress, boolean showPhone) {
        System.out.println("Kode Supplier: " + kodeSupplier);
        System.out.println("Nama Supplier: " + namaSupplier);

        if (showAddress) {
            System.out.println("Alamat: " + alamat);
        }

        if (showPhone) {
            System.out.println("No HP: " + noHp);
        }
    }
}

