package baseclasses;
import interfaces.IReport;

import java.util.ArrayList;
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
public class Student extends Person implements IReport {
    private float currentGPA;
    private GregorianCalendar dateOfGraduation;
    private ArrayList<StudentCourse> enrolledCourses;
    private static final String[] REPORT_CATEGORIES = {"Name", "Address", "SSN","Date of Birth", "Date of Graduation"};

    public Student() {
        this.enrolledCourses = new ArrayList<>();
    }

   
    public float getCurrentGPA() {
        return currentGPA;
    }

    public void setCurrentGPA(float currentGPA) {
        this.currentGPA = currentGPA;
    }

    public GregorianCalendar getDateOfGraduation() {
        return dateOfGraduation;
    }

    public void setDateOfGraduation(GregorianCalendar dateOfGraduation) {
        this.dateOfGraduation = dateOfGraduation;
    }

    public ArrayList<StudentCourse> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(ArrayList<StudentCourse> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    @Override
    public String toString() {
        return "Student{" + "currentGPA=" + currentGPA + ", dateOfGraduation=" + dateOfGraduation.getTime() + ", enrolledCourses=" + enrolledCourses + '}';
    }


    @Override
    public String[] getReportCategoryData() {
        String[] reportCatagoriesData = {this.getName(),this.getAddress(), this.getSocialSecurityNumber(),this.getDateOfBirth().toString(),this.getDateOfGraduation().toString()};
        return reportCatagoriesData;
    }

    @Override
    public String[] getReportCategories() {
        return REPORT_CATEGORIES;
    }
}
