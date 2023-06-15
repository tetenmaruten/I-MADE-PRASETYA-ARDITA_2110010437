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
public class User {
    private int userId;
    private String username;
    private String namaUser;
    private String password;
    private String email;
    private String telepon;
    private String foto;
    private String hakAkses;
    private Date createdAt;
    private Date updatedAt;

    public User(){
        
    }
    
    
    public User(int userId) {
        this.userId = userId;        
    }
    
    public User(int userId, String username) {
        this.userId = userId;
        this.username = username;       
    }
    
    public User(int userId, String username, String namaUser, String password) {
        this.userId = userId;
        this.username = username;
        this.namaUser = namaUser;
        this.password = password;
    }
    
    public User(int userId, String username, String namaUser, String password, String email) {
        this.userId = userId;
        this.username = username;
        this.namaUser = namaUser;
        this.password = password;
        this.email = email;        
    }
    public User(int userId, String username, String namaUser, String password, String email, String telepon) {
        this.userId = userId;
        this.username = username;
        this.namaUser = namaUser;
        this.password = password;
        this.email = email;
        this.telepon = telepon;        
    }
    
    public User(int userId, String username, String namaUser, String password, String email, String telepon, String foto) {
        this.userId = userId;
        this.username = username;
        this.namaUser = namaUser;
        this.password = password;
        this.email = email;
        this.telepon = telepon;
        this.foto = foto;        
    }
    
    public User(int userId, String username, String namaUser, String password, String email, String telepon, String foto, String hakAkses) {
        this.userId = userId;
        this.username = username;
        this.namaUser = namaUser;
        this.password = password;
        this.email = email;
        this.telepon = telepon;
        this.foto = foto;
        this.hakAkses = hakAkses;
    }
    
    public User(int userId, String username, String namaUser, String password, String email, String telepon, String foto, String hakAkses, Date createdAt) {
        this.userId = userId;
        this.username = username;
        this.namaUser = namaUser;
        this.password = password;
        this.email = email;
        this.telepon = telepon;
        this.foto = foto;
        this.hakAkses = hakAkses;
        this.createdAt = createdAt;        
    }
    
    public User(int userId, String username, String namaUser, String password, String email, String telepon, String foto, String hakAkses, Date createdAt, Date updatedAt ) {
        this.userId = userId;
        this.username = username;
        this.namaUser = namaUser;
        this.password = password;
        this.email = email;
        this.telepon = telepon;
        this.foto = foto;
        this.hakAkses = hakAkses;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        
    }
    
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNamaUser() {
        return namaUser;
    }

    public void setNamaUser(String namaUser) {
        this.namaUser = namaUser;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getHakAkses() {
        return hakAkses;
    }

    public void setHakAkses(String hakAkses) {
        this.hakAkses = hakAkses;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}

