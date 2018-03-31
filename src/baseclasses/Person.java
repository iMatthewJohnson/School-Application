package baseclasses;

import ExceptionClasses.InvalidDataException;
import ExceptionClasses.NoDataException;
import interfaces.IFormData;
import interfaces.IPerson;
import interfaces.IReport;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author matt
 */
public class Person implements IPerson, IReport, IFormData {
    private String firstName;
    private String lastName;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zipCode;
    private String ssn1;
    private String ssn2;
    private String ssn3;
    private GregorianCalendar dateOfBirth;

    public String getFirstName() {
        return firstName;
    }


    @Override
    public void setFirstName(String firstName) throws NoDataException{
        if (firstName.isEmpty()) {
            throw new NoDataException("First Name field is blank");
        } else {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws NoDataException{
        if (lastName.isEmpty()) {
            throw new NoDataException("Last Name field is blank");
        } else {
            this.lastName = lastName;
        }
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) throws NoDataException {
        if (address1.isEmpty()) {
            throw new NoDataException("Address 1 field is blank");
        } else {
            this.address1 = address1;
        }
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) throws NoDataException {
        if (city.isEmpty()) {
            throw new NoDataException("City field is blank");
        }
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) throws NoDataException, InvalidDataException {
        if(state.isEmpty()) {
            throw new NoDataException("State field is blank");
        }
        if (state.length()!= 2) {
            throw new InvalidDataException("State needs to be 2 letter abbreviation");
        }
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) throws NoDataException, InvalidDataException{
        if (zipCode.isEmpty()) {
            throw new NoDataException("Zip code field is blank");
        }
        try {
            Integer.parseInt(zipCode);
        } catch (Exception e) {
            throw new InvalidDataException("Zip code contains nonnumerical characters");
        }
        if (zipCode.length() != 5) {
            throw new InvalidDataException("Zip code needs to be 5 digits");
        }
        this.zipCode = zipCode;
    }

    public String getFullAddress() {
        return address1 +
                (address2.equals("") ? "" : ", " + address2) + " | " +
                city + ", " + state + " " + zipCode;
    }

    public String getSsn1() {
        return ssn1;
    }

    public void setSsn1(String ssn1)  throws NoDataException, InvalidDataException {

            //Check if empty
            if (ssn1.isEmpty()) {
                throw new NoDataException("SSN1 is blank");
            }

            //Check if number
            try {
                Integer.parseInt(ssn1);
            } catch (Exception e){
                throw new InvalidDataException("SSN1 contains nonnumerical characters");
            }
            //Check if number is only 3 digits
            if (ssn1.length() != 3) {
                throw new InvalidDataException("SSN1 needs to be 3 digits");
            }

            this.ssn1 = ssn1;
    }

    public String getSsn2() {
        return ssn2;
    }

    public void setSsn2(String ssn2) throws NoDataException, InvalidDataException{
        //Check if empty
        if (ssn2.isEmpty()) {
            throw new NoDataException("SSN2 is blank");
        }

        //Check if number
        try {
            Integer.parseInt(ssn2);
        } catch (Exception e){
            throw new InvalidDataException("SSN2 contains nonnumerical characters");
        }
        //Check if number is only 3 digits
        if (ssn2.length() != 2) {
            throw new InvalidDataException("SSN2 needs to be 2 digits");
        }

        this.ssn2 = ssn2;
    }

    public String getSsn3() {
        return ssn3;
    }

    public void setSsn3(String ssn3) throws NoDataException, InvalidDataException {
        //Check if empty
        if (ssn3.isEmpty()) {
            throw new NoDataException("SSN3 is blank");
        }

        //Check if number
        try {
            Integer.parseInt(ssn3);
        } catch (Exception e){
            throw new InvalidDataException("SSN3 contains nonnumerical characters");
        }
        //Check if number is only 4 digits
        if (ssn3.length() != 4) {
            throw new InvalidDataException("SSN3 needs to be 4 digits");
        }

        this.ssn3 = ssn3;
    }

    public String getSocial() {
        return ssn1 + "-" + ssn2 + "-" + ssn3;
    }

    @Override
    public GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public void setDateOfBirth(GregorianCalendar dateOfBirth) throws NoDataException {
        if (dateOfBirth == null) {
            throw new NoDataException("Date of Birth is blank");
        }
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirthAsString() {
        return dateAsString(dateOfBirth);
    }

    protected String dateAsString(GregorianCalendar date) {
        if (date == null) {
            return "";
        } else {
            SimpleDateFormat fmt = new SimpleDateFormat("MM/dd/yyyy");
            return fmt.format(date.getTime());
        }
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + firstName + " " + lastName +
                ", address=" + address1 + " " + address2 + " " + city + " " + state + " " + zipCode +
                ", socialSecurityNumber=" + ssn1 + "-" + ssn2 + "-" + ssn3 +
                ", dateOfBirth=" + dateOfBirth.getTime() + "}";

    }

    @Override
    public String[] getReportCategoryData() {
        return new String[0];
    }

    @Override
    public String[] getReportCategories() {
        return new String[0];
    }


    public enum PersonalInfoFields {
        FIRST_NAME,
        LAST_NAME,
        ADDRESS1,
        ADDRESS2,
        CITY,
        STATE,
        ZIP_CODE,
        SSN1,
        SSN2,
        SSN3,
        DATE_OF_BIRTH
    }

}
