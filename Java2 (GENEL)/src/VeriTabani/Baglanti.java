/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VeriTabani;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.*;


/**
 *
 * @author GORKEM
 */
public class Baglanti {
    String kullad="root";
    String parola="";
    String db_name="vtio";
    String host="localhost";
    int port=3306;
    Connection con=null;
    Statement statement=null;
    ResultSet rs=null;
    public Baglanti(){
        String url="jdbc:mysql://"+host+":"+port+"/"+db_name+"?characterEncoding=utf8";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");            
            con=DriverManager.getConnection(url,kullad,parola);
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı");
        
        }catch(SQLException ex){
            System.out.println("Bağlantı Hatası");
        }
        
    }
    public static void main(String[] args) {
        Baglanti baglan=new Baglanti();
        //baglan.OgrenciEkle();
        baglan.OgrenciGetir();
        
    }
    public void OgrenciGetir(){
        String sorgu="Select * from ogrenci";
        String ad,soyad,bolum;
        Integer id;
        try {
            statement=con.createStatement();
            rs=statement.executeQuery(sorgu);
            
            while(rs.next()){
                id=rs.getInt("id");
                ad=rs.getString("ad");
               soyad=rs.getString("soyad");
               bolum=rs.getString("bolum");
               System.out.println("ADI SOYADI: "+ad+" "+soyad+"\nBölüm: "+bolum);
            }
        } catch (SQLException e) {
            System.out.println("Veritabanı Hatası");
        }
    }
        public void OgrenciEkle(){
            String ad="Görkem22",soyad="Görür",bolum="Bip";
            String sorgu="Insert into ogrenci(ad,soyad,bolum) value('"+ad+"','"+soyad+"','"+bolum+"')";
            try {
                statement=con.createStatement();
                statement.executeUpdate(sorgu);
            } catch (SQLException e) {
                System.out.println("Veriler Eklenemedi");
            }
        
        
    }
        public void Guncelle(){            
            String sorgu="Update ogrenci set soyad='yeni'where id=3";
            try {
              statement=con.createStatement();
              statement.executeUpdate(sorgu);
            } catch (Exception e) {
            }
               
        }
                public void Sil(){            
            String sorgu="Delete from ogrenci where id=4";
            try {
              statement=con.createStatement();
              statement.executeUpdate(sorgu);
            } catch (Exception e) {
            }
               
        }
}
