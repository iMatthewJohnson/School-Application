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

   String getName();
   String getAddress();
   String getSocialSecurityNumber();
   GregorianCalendar getDateOfBirth();
 
   void setName(String name);
   void setAddress(String address);
   void setSocialSecurityNumber(String ssn);
   void setDateOfBirth(GregorianCalendar dateOfBirth);

   @Override
   String toString();
}
