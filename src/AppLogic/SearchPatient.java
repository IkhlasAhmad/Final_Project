/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppLogic;

import DataBase.DbFacade;

/**
 *
 * @author jit
 */
public class SearchPatient {
    
    public SearchPatient(){
        
    }
    
    public AbstractPatient getPatient(int num){
        
          AbstractPatient aPatient = DbFacade.getDbFacade().searchPatient(num);
          
          if(aPatient.getMedicareCardNumber() == num){
                return (Patient)aPatient ; 
            }
        
       
         return new NullPatient();
    }
}
