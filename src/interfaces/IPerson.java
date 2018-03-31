package interfaces;


import ExceptionClasses.InvalidDataException;
import ExceptionClasses.NoDataException;

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
   void setFirstName(String firstName) throws NoDataException;
   void setLastName(String lastName) throws NoDataException;
   void setAddress1(String address1) throws NoDataException;
   void setAddress2(String address2);
   void setCity(String city) throws NoDataException;
   void setState(String state) throws NoDataException, InvalidDataException;
   void setZipCode(String zipCode) throws NoDataException, InvalidDataException;
   void setSsn1(String ssn1) throws NoDataException, InvalidDataException;
   void setSsn2(String ssn2) throws NoDataException, InvalidDataException;
   void setSsn3(String ssn3) throws NoDataException, InvalidDataException;
   void setDateOfBirth(GregorianCalendar dateOfBirth) throws NoDataException;

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
