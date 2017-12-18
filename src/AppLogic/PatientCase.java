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
public class PatientCase {
    String operation;
    String treatment;
    String description ;
    int medicareCardNum;

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMedicareCardNum() {
        return medicareCardNum;
    }

    public void setMedicareCardNum(int medicareCardNum) {
        this.medicareCardNum = medicareCardNum;
    }
    
}
