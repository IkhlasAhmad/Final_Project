/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppLogic;

/**
 *
 * @author jit
 */
public class NullPatient extends AbstractPatient{
       private static final String MESSAGE_404 = "Patient you've looked for, is not exsited";
       
    public NullPatient() {
        super();
    }
   
    
    public String getName() {
         return MESSAGE_404;
    }

    

    public int getMedicareCardNumber() {
         return Integer.parseInt(MESSAGE_404);
    }

   
    public int getAge() {
        return Integer.parseInt(MESSAGE_404);
    }

   
    public int getPhoneNumber() {
        return Integer.parseInt(MESSAGE_404);
    }

    
    public String getEmail() {
         return MESSAGE_404;
    }

   
    public String getCity() {
        return MESSAGE_404;
    }

  
    
      @Override
    public boolean isNull() {
       return true;
    } 
}
 
    
