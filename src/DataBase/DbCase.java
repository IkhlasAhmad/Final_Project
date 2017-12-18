/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import AppLogic.Appointment;
import AppLogic.PatientCase;
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
public class DbCase {
    
     DbConnection aDbConnection = DbConnection.getDBConnection();
     private String SQL;
     private Statement  aStatement;
     private int num;
      public DbCase() {
         try {
             aStatement = aDbConnection.getStatement();  
         } catch (SQLException ex) {
             Logger.getLogger(DbPatient.class.getName()).log(Level.SEVERE, null, ex);
             
             
         }
    }
      
      public void insert(PatientCase aCase){
          this.num = aCase.getMedicareCardNum();
          if(isaPatient()){
          SQL = "insert into patientcase values ('" +  
                  aCase.getMedicareCardNum() + "','" +
                     aCase.getDescription() + "','"+
                     aCase.getTreatment() + "','" +
                     aCase.getOperation()+"')";
          
        try {
                 aStatement.executeUpdate(SQL);
       
             JOptionPane.showMessageDialog(null, "Successfully added");
         
      } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
          }
          if(! isaPatient()){
            JOptionPane.showMessageDialog(null, "Add this patient to patient table to insert patient details! ");
          }
          
}
      public boolean isaPatient(){
          ResultSet rs ;
          String sql = "select cardNum from patient";
      
        try {
                rs = aStatement.executeQuery(sql);
                while(rs.next()){
                    if(rs.getInt("cardNum") == this.num){
                    return true;
                    }
                }
       
      } catch (SQLException ex) {
             System.out.println(ex.getMessage());
        } 
         return false;
      }
    
    
}
