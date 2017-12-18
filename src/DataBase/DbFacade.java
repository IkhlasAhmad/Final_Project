/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import AppLogic.*;
import java.util.List;


/**
 *
 * @author jit
 */
public class DbFacade {
    private DbAppointment aDbAppointment;
    private DbCase aDbCase;
    private DbPatient aDbPatient;
    private DbInvoice aDbInvoice;
    
      private static DbFacade facade;
    private DbFacade() {
       aDbAppointment = new DbAppointment();
        aDbCase = new DbCase();
        aDbPatient = new DbPatient();
        aDbInvoice = new DbInvoice();
       
    }
    public  static DbFacade  getDbFacade(){
        if(facade == null)
            return facade = new DbFacade();
        return facade;
    }
    public void addPatient(Patient aPatient) {
      aDbPatient.addPatient(aPatient);
    }
     public void deletePatient(Patient aPatient) {
      aDbPatient.deletePatient(aPatient);
    }
      
       public void updatePatient(Patient aPatient) {
      aDbPatient.updatePatient(aPatient);
    }
     public AbstractPatient searchPatient(int num) {
         
     AbstractPatient aPatient = aDbPatient.searchPatient(num);
        return aPatient;
    }
    
     public void insertApp(Appointment anAppointment){
         aDbAppointment.insert(anAppointment);
     }
     public void insertCaseOfPatient(PatientCase aCase){
         aDbCase.insert(aCase);
     }
     public void addInvoice(Invoice anInvoice , int num){
         aDbInvoice.insert( anInvoice ,  num);
     }
      public void updateInvoice(Invoice anInvoice ){
         aDbInvoice.update( anInvoice );
     }
     
    public List<Patient> gePatients(){
      return aDbPatient.gePatients();
    }
}
