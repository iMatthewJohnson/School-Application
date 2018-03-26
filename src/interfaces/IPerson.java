package interfaces;


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
public interface IPerson {
   //==== Personal Info Setters ====//
   void setFirstName(String firstName);
   void setLastName(String lastName);
   void setAddress1(String address1);
   void setAddress2(String address2);
   void setCity(String city);
   void setState(String state);
   void setZipCode(String zipCode);
   void setSsn1(String ssn1);
   void setSsn2(String ssn2);
   void setSsn3(String ssn3);
   void setDateOfBirth(GregorianCalendar dateOfBirth);

   //==== Personal Info Getters ====//
   String getFirstName();
   String getLastName();
   String getAddress1();
   String getAddress2();
   String getCity();
   String getState();
   String getZipCode();
   String getSsn1();
   String getSsn2();
   String getSsn3();
   GregorianCalendar getDateOfBirth();

   @Override
   String toString();
}
