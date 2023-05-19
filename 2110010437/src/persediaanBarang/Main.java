/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persediaanBarang;
import salary.*;
import java.util.Date;

/**
 *
 * @author ASUS
 */

public class Main {
    public static void main(String[] args) {
        // Membuat objek Supplier
        supplier supplier = new supplier();
        supplier.setKodeSupplier("S001");
        supplier.setNamaSupplier("made");
        supplier.setAlamat("padang masyar");
        supplier.setNoHp("081234567890");

        // Membuat objek Barang
        Barang barang = new Barang();
        barang.setKodeBarang("B001");
        barang.setNamaSupplier("made");
        barang.setNamaBarang("Gele");
        barang.setWarna("Abu-Abu");
        barang.setType("Tipe A");
        barang.setStok(10);
        barang.setSatuan("Ton");

        // Membuat objek BarangMasuk
        BarangMasuk barangMasuk = new BarangMasuk();
        barangMasuk.setTanggal(new Date());
        barangMasuk.setKodeSupplier("S001");
        barangMasuk.setKodeSuratJalan("SJ001");

        // Membuat objek BarangMasukDetail
        BarangMasukDetail barangMasukDetail = new BarangMasukDetail();
        barangMasukDetail.setIdBmd(1);
        barangMasukDetail.setKodeBarang("B001");
        barangMasukDetail.setKodeSuratJalan("SJ001");

        // Membuat objek BarangKeluar
        BarangKeluar barangKeluar = new BarangKeluar();
        barangKeluar.setTanggal(new Date());
        barangKeluar.setKodeBarang("B001");
        barangKeluar.setJumlahKeluar(5);

        // Membuat objek User
        User user = new User();
        user.setUserId(1);
        user.setUsername("kacong");
        user.setNamaUser("User Satu");
        user.setPassword("kacongpentol");
        user.setEmail("kacongpentol@gmail.com");
        user.setTelepon("081234567891");
        user.setFoto("kacong.jpg");
        user.setHakAkses("Admin");
        user.setCreatedAt(new Date());
        user.setUpdatedAt(new Date());

        // Melakukan operasi atau aksi lainnya terkait objek-objek yang dibuat

        // Contoh penggunaan objek Supplier
        System.out.println("Kode Supplier: " + supplier.getKodeSupplier());
        System.out.println("Nama Supplier: " + supplier.getNamaSupplier());
        System.out.println("Alamat Supplier: " + supplier.getAlamat());
        System.out.println("No HP Supplier: " + supplier.getNoHp());

        // Contoh penggunaan objek Barang
        System.out.println("Kode Barang: " + barang.getKodeBarang());
        System.out.println("Nama Supplier: " + barang.getNamaSupplier());
        System.out.println("Nama Barang: " + barang.getNamaBarang());
        System.out.println("Warna Barang: " + barang.getWarna());
        System.out.println("Type Barang: " + barang.getType());
        System.out.println("Stok Barang: " + barang.getStok());
        System.out.println("Satuan Barang: " + barang.getSatuan());
        System.out.println("tanggal barangMasuk: " + barangMasuk.getTanggal());
        System.out.println("tanggal barangKeluar: " + barangKeluar.getTanggal());

        // Lanjutkan dengan penggunaan objek-objek lainnya sesuai kebutuhan
    }
    public static void displaySupplierInfo(supplier supplier) {
        System.out.println("Kode Supplier: " + supplier.getKodeSupplier());
        System.out.println("Nama Supplier: " + supplier.getNamaSupplier());
    }
    
    // Overload method untuk menampilkan informasi barang
    public static void displayBarangInfo(Barang barang) {
        System.out.println("Kode Barang: " + barang.getKodeBarang());
        System.out.println("Nama Barang: " + barang.getNamaBarang());
}
}

