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
public abstract class AbstractPatient {
    private String name;
    private int medicareCardNumber;
    private int age;
   private int phoneNumber;
   private String email;
   private String city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMedicareCardNumber() {
        return medicareCardNumber;
    }

    public void setMedicareCardNumber(int medicareCardNumber) {
        this.medicareCardNumber = medicareCardNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
  
   
    public String getInfo(AbstractPatient aPatient) {
       
        return "Patient name=" + aPatient.getName() + "\n medicareCardNumber=" + aPatient.getMedicareCardNumber() +
                "\n age=" + aPatient.getAge() + "\n phoneNumber=" +
                aPatient.getPhoneNumber() + "\n email=" + aPatient.getEmail() + "\n city=" + aPatient.getCity();
    }
    
     public abstract boolean isNull();

    
    
    
}
