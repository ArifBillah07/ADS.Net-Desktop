/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adsnet.helper;
import com.mysql.cj.jdbc.Driver;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Arif
 */
public class ConnectionHelper {
    private static final String DB_NAME = "db_adsnet";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static final String URL = "jdbc:mysql://localhost:3306/" + DB_NAME;
    
    public static Connection getConnection() throws SQLException{
        DriverManager.registerDriver(new Driver());
        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        return connection;
    }
    
}
