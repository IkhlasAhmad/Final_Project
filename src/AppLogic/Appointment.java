/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppLogic;

/**
 *
 * @author Ikhlas
 */
public class Appointment {
   String dateLastVisit;
   String time ;
   String dateNextApp;
   String dentistName;
   int cardNum ; 

    public String getDateLastVisit() {
        return dateLastVisit;
    }

    public void setDateLastVisit(String dateLastVisit) {
        this.dateLastVisit = dateLastVisit;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDateNextApp() {
        return dateNextApp;
    }

    public void setDateNextApp(String dateNextApp) {
        this.dateNextApp = dateNextApp;
    }

    public String getDentistName() {
        return dentistName;
    }

    public void setDentistName(String dentistName) {
        this.dentistName = dentistName;
    }

    public int getCardNum() {
        return cardNum;
    }

    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
    }
   
}
