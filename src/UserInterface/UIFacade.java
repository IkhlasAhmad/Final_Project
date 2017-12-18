/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

/**
 *
 * @author jit
 */
public class UIFacade {
      private static UIFacade facade;
    private UIFacade() {
       
    }
    
    public static UIFacade getUIFacade(){
        if(facade == null){
            return facade = new UIFacade();
        }
         return facade;
    }
    
    public void getAddPatientView(){
        new AddPatientScreen().setVisible(true);         
    }
    public void getUpdatePatientView(){
        new UpdatePatientScreen().setVisible(true);         
    }
    public void getDeletePatientView(){
        new DeletePatientScreen().setVisible(true);         
    }
    public void getSearchPatientView(){
        new SearchPatientScreen().setVisible(true);         
    }
    public void getAdminServicesView(){
        new AdminServices().setVisible(true);         
    }
    public void getManageAppointmentView(){
        new ManageAppointmentScreen().setVisible(true);         
    }
    public void getManagePatientView(){
        new ManagePatientScreen().setVisible(true);         
    }
    public void getReportView(){
        new ReportView().setVisible(true);         
    }
    public void getLoginScreen(){
        new LoginScreen().setVisible(true);         
    }
    public void getDentistServicesView(){
        new DentistServices().setVisible(true);         
    }
     public void getPatientCaseView(){
        new PatientCaseScreen().setVisible(true);         
    }
      public void getManageDentistScreen(){
        new ManageDentistScreen().setVisible(true);         
    }
      public void getInvoiceScreen(){
           new InvoiceScreen().setVisible(true);
      }
      
    
}
