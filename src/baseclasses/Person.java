package baseclasses;
import interfaces.IReport;
import interfaces.IPerson;
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matt
 */
public class Person implements IPerson {
    private String name;
    private String address;
    private String socialSecurityNumber;
    private GregorianCalendar dateOfBirth;
  
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        if (socialSecurityNumber.length() == 9) {
            this.socialSecurityNumber = socialSecurityNumber;
        } else {
            System.out.println("Social security number does not meet length requirements.");
        }
    }

    public GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(GregorianCalendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", address=" + address + ", socialSecurityNumber=" + socialSecurityNumber + ", dateOfBirth=" + dateOfBirth.getTime() + '}';
        
    }
    
    
    
    
}
