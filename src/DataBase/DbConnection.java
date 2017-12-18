/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ikhlas
 */
public class DbConnection {
   
    
     private static DbConnection aDBConnection;
     private static  Connection aConnection;
     private static Statement aStatement ; 
    private static final String DRIVER_PATH = "com.mysql.jdbc.Driver";  
    private static final String HOST = "jdbc:mysql://localhost/sdv_project";
    

    private DbConnection() throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER_PATH);
         aConnection = DriverManager.getConnection(HOST, "root", "root");
          }

    public static DbConnection getDBConnection() {
        if (aDBConnection == null) {
            try {
                aDBConnection = new DbConnection();
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
            return aDBConnection;
        }
        return aDBConnection;
    }

    public Statement getStatement() throws SQLException {
        aStatement=aConnection.createStatement();
        return  aStatement;
    }
    public void disconnect() {
        try {
            aConnection.close();
          aStatement.close();
            
        } catch (Exception ex) {
        }
    }
}
