/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import AppLogic.Patient;
import DataBase.DbConnection;
import DataBase.DbFacade;
import DataBase.DbPatient;
import static DataBase.DbPatient.aResultSet;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jit
 */
public class ReportView extends JFrame{
     DbConnection aDbConnection = DbConnection.getDBConnection();
     private String SQL;
     private Statement  aStatement;
     public   static ResultSet aResultSet;
    public ReportView(){
         try {
             aStatement = aDbConnection.getStatement();
         } catch (SQLException ex) {
             System.out.println(ex.getMessage());
         }
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setVisible(true);
        this.setTitle("Report");
        this.setLocationRelativeTo(null);
        
        
        DefaultTableModel model = new DefaultTableModel(new String[]{"Card_number", "Description", "Treatment", 
                 "Opreation" },0);
             
           
               JTable table = new JTable();
               JPanel panel = new JPanel();
               String SQL="select * from patientcase"; 
         try {
             aResultSet=aStatement.executeQuery(SQL);
         } catch (SQLException ex) {
             System.out.println(ex.getMessage());
         }
               
        try {
            while(aResultSet.next()){
//                  String name = aResultSet.getString("name");
//    int phone = aResultSet.getInt("phone");
//    String city = aResultSet.getString("city");
//    int age = aResultSet.getInt("age");
//    String email = aResultSet.getString("email");
//    int num = aResultSet.getInt("cardNum");
    
      String description = aResultSet.getString("description");
  //  int phone = aResultSet.getInt("phone");
    String treatment = aResultSet.getString("treatment");
    //int age = aResultSet.getInt("age");
    String opreation = aResultSet.getString("operation");
    int num = aResultSet.getInt("cardNum");
    
    
                model.addRow(new Object[]{num , description , treatment , opreation});
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
             
             table.setPreferredScrollableViewportSize(new Dimension(500,50));
       table.setFillsViewportHeight(true);
        table.setModel(model);            
       JScrollPane scroll = new JScrollPane(table);
        panel.add(scroll);
        this.add(panel);
      
    }

    public static void main(String[] args) {
        new ReportView().setVisible(true);
    }
}
