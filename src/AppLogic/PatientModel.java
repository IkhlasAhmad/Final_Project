/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppLogic;


import java.util.List;
import java.util.Observable;

/**
 *
 * @author jit
 */
public class PatientModel  extends Observable{
    private List<Patient> patients;

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
        setChanged();
        notifyObservers();
    }
}
