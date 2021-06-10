/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginregisterdb;

/**
 *
 * @author Acer
 */
//Import java sql
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Acer
 */
public class koneksi {
    //memanggil method koneksi dengan nama mysqlconfig
    private static Connection mysqlconfig;
    //method koneksi configDB() dengan throws exception jika gagal
    public static Connection configDB() throws SQLException{
        try {
            String url = "jdbc:mysql://localhost:3306/pbo_login"; //url database
            String user = "root";   //user
            String pass = "";       //pass
             //memanggil jdbc driver di library file (install jdbc terlebih dahulu di library)
            DriverManager.registerDriver(new com.mysql.jdbc.Driver()); 
            //menghubungkan dengan database
            mysqlconfig = DriverManager.getConnection(url, user, pass);
        }catch(SQLException e) {
            //jika gagal akan muncul pesan gagal dengan errornya
            System.err.print("koneksi gagal" +e.getMessage()); //error message
        }
        return mysqlconfig;
    }
}
