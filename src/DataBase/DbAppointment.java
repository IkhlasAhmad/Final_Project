/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import AppLogic.Appointment;
import AppLogic.Patient;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ikhlas
 */
public class DbAppointment {
    DbConnection aDbConnection = DbConnection.getDBConnection();
     private String SQL;
     private Statement  aStatement;
     
   
      public DbAppointment() {
         try {
             aStatement = aDbConnection.getStatement();
                
         } catch (SQLException ex) {
             Logger.getLogger(DbPatient.class.getName()).log(Level.SEVERE, null, ex);
             
             
         }
    }
      
      public void insert(Appointment anAppointment){
          SQL = "insert into appointment values ('" + anAppointment.getDateLastVisit() + "','" +
                     anAppointment.getTime() + "','"+
                     anAppointment.getDateNextApp() + "','" +
                     anAppointment.getCardNum()+"','" +
                     anAppointment.getDentistName()+"')";
        try {
            aStatement.executeUpdate(SQL);
       
             
              
             JOptionPane.showMessageDialog(null, "The appointment is added");
         
      } catch (SQLException ex) {
            Logger.getLogger(DbAppointment.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}