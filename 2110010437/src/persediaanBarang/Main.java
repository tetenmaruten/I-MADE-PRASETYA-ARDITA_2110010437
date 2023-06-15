/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persediaanBarang;
import salary.*;
import dataset.*;
import java.util.Date;
import Form.*;

/**
 *
 * @author ASUS
 */

public class Main {
    public static void main(String[] args) {
        
        new  frameUtama().setVisible(true);
        // Membuat objek Supplier
//        supplier supplier = new supplier();
//        supplier.setKodeSupplier("S001");
//        supplier.setNamaSupplier("made");
//        supplier.setAlamat("padang masyar");
//        supplier.setNoHp("081234567890");
//
//        // Membuat objek Barang
//        Barang barang = new Barang();
//        barang.setKodeBarang("B001");
//        barang.setNamaSupplier("made");
//        barang.setNamaBarang("Gele");
//        barang.setWarna("Abu-Abu");
//        barang.setType("Tipe A");
//        barang.setStok(10);
//        barang.setSatuan("Ton");
//
//        // Membuat objek BarangMasuk
//        BarangMasuk barangMasuk = new BarangMasuk();
//        barangMasuk.setTanggal(new Date());
//        barangMasuk.setKodeSupplier("S001");
//        barangMasuk.setKodeSuratJalan("SJ001");
//
//        // Membuat objek BarangMasukDetail
//        BarangMasukDetail barangMasukDetail = new BarangMasukDetail();
//        barangMasukDetail.setIdBmd(1);
//        barangMasukDetail.setKodeBarang("B001");
//        barangMasukDetail.setKodeSuratJalan("SJ001");
//
//        // Membuat objek BarangKeluar
//        BarangKeluar barangKeluar = new BarangKeluar();
//        barangKeluar.setTanggal(new Date());
//        barangKeluar.setKodeBarang("B001");
//        barangKeluar.setJumlahKeluar(5);
//
//        // Membuat objek User
//        User user = new User();
//        user.setUserId(1);
//        user.setUsername("kacong");
//        user.setNamaUser("User Satu");
//        user.setPassword("kacongpentol");
//        user.setEmail("kacongpentol@gmail.com");
//        user.setTelepon("081234567891");
//        user.setFoto("kacong.jpg");
//        user.setHakAkses("Admin");
//        user.setCreatedAt(new Date());
//        user.setUpdatedAt(new Date());
//
//        // Melakukan operasi atau aksi lainnya terkait objek-objek yang dibuat
//
//        // Contoh penggunaan objek Supplier
//        System.out.println("Kode Supplier: " + supplier.getKodeSupplier());
//        System.out.println("Nama Supplier: " + supplier.getNamaSupplier());
//        System.out.println("Alamat Supplier: " + supplier.getAlamat());
//        System.out.println("No HP Supplier: " + supplier.getNoHp());
//
//        // Contoh penggunaan objek Barang
//        System.out.println("Kode Barang: " + barang.getKodeBarang());
//        System.out.println("Nama Supplier: " + barang.getNamaSupplier());
//        System.out.println("Nama Barang: " + barang.getNamaBarang());
//        System.out.println("Warna Barang: " + barang.getWarna());
//        System.out.println("Type Barang: " + barang.getType());
//        System.out.println("Stok Barang: " + barang.getStok());
//        System.out.println("Satuan Barang: " + barang.getSatuan());
//        System.out.println("tanggal barangMasuk: " + barangMasuk.getTanggal());
//        System.out.println("tanggal barangKeluar: " + barangKeluar.getTanggal());
//
//        // Lanjutkan dengan penggunaan objek-objek lainnya sesuai kebutuhan
//    }
//    public static void displaySupplierInfo(supplier supplier) {
//        System.out.println("Kode Supplier: " + supplier.getKodeSupplier());
//        System.out.println("Nama Supplier: " + supplier.getNamaSupplier());
//    }
//    
//    // Overload method untuk menampilkan informasi barang
//    public static void displayBarangInfo(Barang barang) {
//        System.out.println("Kode Barang: " + barang.getKodeBarang());
//        System.out.println("Nama Barang: " + barang.getNamaBarang());

// memanggil barang
//    datasetBarang uji = new datasetBarang();
//    uji.insertKodeBarang("A1");
//    uji.insertNamaBarang("Pentol");
//    uji.insertNamaSupplier("Kcong");
//    uji.insertWarna("Biru");
//    uji.insertType("Makanan");
//    uji.insertStok(4);
//    uji.insertSatuan("kg");
//    
//// memanggil Barang Keluar    
//    datasetBarangKeluar ujiBarangKeluar = new datasetBarangKeluar();
//    ujiBarangKeluar.insertTanggal(new Date());
//    ujiBarangKeluar.insertKodeBarang("A1");
//    ujiBarangKeluar.insertJumlahKeluar(4);
//    
//// memanggil supllier
//    datasetSupplier ujiSupplier = new datasetSupplier();
//    ujiSupplier.insertKodeSupplier("s1");
//    ujiSupplier.insertNamaSupplier("Kacong");
//    ujiSupplier.insertalamat("tajau pecah");
//    ujiSupplier.insertNoHp("081234567612");
//    
//// memanggil Barang Masuk
//    datasetBarangMasuk ujiBarangMasuk = new datasetBarangMasuk();
//    ujiBarangMasuk.insertTanggal(new Date());
//    ujiBarangMasuk.insertKodeSupplier("s1");
//    ujiBarangMasuk.insertKodeSuratJalan("LPM");
//    
//// memanggil barang masuk detail
//    datasetBarangMasukDetail ujiBarangMasukDetail = new datasetBarangMasukDetail();
//    ujiBarangMasukDetail.insertIdBmd(0437);
//    ujiBarangMasukDetail.insertKodeBarang("A1");
//    ujiBarangMasukDetail.insertJumlahMasuk(5);
//    ujiBarangMasukDetail.insertKodeSuratJalan("LPM");
//    
//// memanggil user
//    datasetUser ujiUser = new datasetUser();
//    ujiUser.insertUserId(001);
//    ujiUser.insertUsername("made");
//    ujiUser.insertNamaUser("Prasetya");
//    ujiUser.insertPassword("Ardita");
//    ujiUser.insertEmail("lolicon@gmail.com");
//    ujiUser.insertTelepon("081234567612");
//    ujiUser.insertFoto("smile");
//    ujiUser.insertHakAkses("Admin");
//    ujiUser.insertCreatedAt(new Date());
//    ujiUser.insertUpdatedAt(new Date());
//    
//    
//    
//    
// // menampilkan Barang   
//    System.out.println("Kode Barang: " + uji.getRecordKodeBarang());
//    System.out.println("Nama Barang:"+ uji.getRecordNamaBarang());
//    System.out.println("Nama Supplier"+ uji.getRecordNamaSupplier());
//    System.out.println("warna"+uji.getRecordWarna());
//    System.out.println("type"+uji.getRecordtype());
//    System.out.println("stok"+uji.getRecordStok());
//    System.out.println("satuan"+uji.getRecordSatuan());
//    
//// menampilkan barang keluar
//    System.out.println("kode barang"+ ujiBarangKeluar.getRecordKodeBarang());
//    System.out.println("tanggal"+ujiBarangKeluar.getRecordTanggal());
//    System.out.println("jumlah keluar"+ujiBarangKeluar.getRecordJumlahKeluar());
//    
//// menampikan suppiler
//    System.out.println("kode supplier"+ujiSupplier.getRecordKodeSupplier());
//    System.out.println("nama supplier"+ ujiSupplier.getRecordNamaSupplier());
//    System.out.println("alamat"+ujiSupplier.getRecordalamat());
//    System.out.println("no hp"+ujiSupplier.getRecordNoHp());
//    
//// menampilkan barang masuk    
//    System.out.println("Tanggal"+ ujiBarangMasuk.getRecordTanggal());
//    System.out.println("kode Supplier"+ ujiBarangMasuk.getRecordKodeSupplier());
//    System.out.println("kode Surat Jalan"+ ujiBarangMasuk.getRecordKodeSuratJalan());
//    
//// menampilkan Barang masuk detail
//    System.out.println("idBmd"+ ujiBarangMasukDetail.getRecordIdBmd());
//    System.out.println("kode Barang"+ ujiBarangMasukDetail.getRecordKodeBarang());
//    System.out.println("Jumlah Masuk"+ ujiBarangMasukDetail.getRecordJumlahMasuk());
//    System.out.println("kode surat Jalan"+ ujiBarangMasukDetail.getRecordKodeSuratJalan());
//    
////menampilkan user
//    System.out.println("userid"+ ujiUser.getRecordUserId());
//    System.out.println("User Name"+ ujiUser.getRecordUsername());
//    System.out.println("Nama user"+ ujiUser.getRecordNamaUser());
//    System.out.println("password"+ ujiUser.getRecordPassword());
//    System.out.println("email"+ ujiUser.getRecordEmail());
//    System.out.println("telepon"+ ujiUser.getRecordTelepon());
//    System.out.println("foto"+ ujiUser.getRecordFoto());
//    System.out.println("created at"+ ujiUser.getRecordCreatedAt());
//    System.out.println("update"+ ujiUser.getRecordUpdateAt());



}
}

