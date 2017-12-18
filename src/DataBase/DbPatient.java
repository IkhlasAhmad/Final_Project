/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import AppLogic.AbstractPatient;
import AppLogic.NullPatient;
import AppLogic.Patient;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ikhlas
 */
public class DbPatient {
     DbConnection aDbConnection = DbConnection.getDBConnection();
     private String SQL;
     private Statement  aStatement;
     public   static ResultSet aResultSet;
  
     public DbPatient(){
             try {
             aStatement = aDbConnection.getStatement();
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage());
         }
     }
    public void addPatient(Patient aPatient) {
             try {
             SQL = "insert into patient values ('" + aPatient.getName() + "','" +
                     aPatient.getMedicareCardNumber() + "','" +
                     aPatient.getPhoneNumber() +"','" +
                     aPatient.getEmail() +"','"+
                     aPatient.getAge()+"','"+
                     aPatient.getCity()+"')";
             aStatement.executeUpdate(SQL);
             
              
             JOptionPane.showMessageDialog(null, "Added successfully");
             
         } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null,ex.getMessage());
         }
    }

    
    public AbstractPatient searchPatient(int num) {
          AbstractPatient aPatient = null ;
          
          SQL = "select * from patient where cardNum = "+num; 
          
         
         try {
             aResultSet = aStatement.executeQuery(SQL);
             
            
         } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null,ex.getMessage());
         }
             
                 try {
                      aPatient = new Patient();
                     while(aResultSet.next()){
                         
                         String name = aResultSet.getString("name");
                         int phone = aResultSet.getInt("phone");
                         String city = aResultSet.getString("city");
                         int age = aResultSet.getInt("age");
                         String email = aResultSet.getString("email");
                         
                        aPatient.setMedicareCardNumber(num);
                         aPatient.setName(name);
                         aPatient.setAge(age);
                         aPatient.setCity(city);
                         aPatient.setPhoneNumber(phone);
                         aPatient.setEmail(email);
                         
                        
                         return aPatient;
                         
                     }
                 } catch (SQLException ex) {
                      JOptionPane.showMessageDialog(null,ex.getMessage());
                 }
        
         
         return  aPatient;
     
    }
    

  
    public void deletePatient(Patient aPatient) {
       
             
             int num = aPatient.getMedicareCardNumber();
             String s = "select cardNum from patient";
             try {
                 aResultSet = aStatement.executeQuery(s);
             } catch (SQLException ex) {
                 Logger.getLogger(DbPatient.class.getName()).log(Level.SEVERE, null, ex);
             }
             try {
                 while(aResultSet.next()){
                     if(aResultSet.getInt("cardNum") ==  num){
                         try {
                             SQL = "delete from patient " + "where cardNum = " +  num  + "";
                             aStatement.executeUpdate(SQL);
                             JOptionPane.showMessageDialog(null, "The information of this patient is deleted");
                             break;
                             
                         } catch (SQLException ex) {
                             JOptionPane.showMessageDialog(null,ex.getMessage());  
                         }
                     }
                     else{
                         JOptionPane.showMessageDialog(null, "The medicare number is not exist"); 
                     }
                 }
             } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null,ex.getMessage());
             }
            

           
    }

  
    public void updatePatient(Patient aPatient) {
             SQL = "update patient set "
                 + "name='"+aPatient.getName()
         +"',"+" phone = "+aPatient.getPhoneNumber()
         +", email = '"+aPatient.getEmail()
          +"',"+" age = "+aPatient.getAge()
            +", city = '"+aPatient.getCity()
                 +"'"+ " where cardNum = "+aPatient.getMedicareCardNumber()+" ";
         try {
             int rows = aStatement.executeUpdate(SQL);
              if(rows>0){
                        JOptionPane.showMessageDialog(null, "Updated successfully");
                    
                    }else{
                   JOptionPane.showMessageDialog(null, "faild");
  
                    }
         } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage());
         
         }
    } 
    public List<Patient> gePatients(){
        List<Patient> patients= new ArrayList<>();
        String sql = "Select * from patient";
        try {
            aStatement = aDbConnection.getStatement();
            aResultSet = aStatement.executeQuery(sql);
            while(aResultSet.next()){
                Patient aPatient = new Patient();
                aPatient.setName(aResultSet.getString("name"));
                 aPatient.setAge(aResultSet.getInt("age"));
                 aPatient.setMedicareCardNumber(aResultSet.getInt("cardNum"));
                 aPatient.setEmail(aResultSet.getString("email"));
                 aPatient.setCity(aResultSet.getString("city"));
                 aPatient.setPhoneNumber(aResultSet.getInt("phone"));
                patients.add(aPatient);                
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        return patients;
    }


     }