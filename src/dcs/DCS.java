/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dcs;

import UserInterface.LoginScreen;
import UserInterface.UIFacade;

/**
 *
 * @author jit
 */
public class DCS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UIFacade anUIFacade = UIFacade.getUIFacade();
        anUIFacade.getLoginScreen();
    }
    
}
