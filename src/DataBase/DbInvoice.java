/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import AppLogic.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jit
 */
public class DbInvoice {
     DbConnection aDbConnection = DbConnection.getDBConnection();
     private String SQL;
     private Statement  aStatement;
     private ResultSet aResultSet;
  
     public DbInvoice(){
             try {
             aStatement = aDbConnection.getStatement();
         } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null, ex.getMessage());
         } 
     }
     public void insert(Invoice anInvoice , int num){
          SQL = "insert into invoice values ('" + anInvoice.getNum()  + "','" + anInvoice.getPaidMoney() + "','" +
                    anInvoice.getRemainingMoney() + "','" + anInvoice.getTotal() +"')" ;
        try {
            aStatement.executeUpdate(SQL);
     //  JOptionPane.showMessageDialog(null, "The appointment is added");
         
      } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
}
   
   public void update(Invoice anInvoice ){
       
 
       SQL = "update invoice set "
                 + "paidMoney='"+anInvoice.getPaidMoney()
         +"'," +" total = '"+anInvoice.getTotal()
         +"', remainingMoney = '"+anInvoice.getRemainingMoney()
          +"'"+ " where cardNum = "+anInvoice.getNum()+" ";
       
     
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
   
}
 