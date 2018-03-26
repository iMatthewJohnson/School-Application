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
 * @author matt
 */
public class Student extends Person implements IReport {
    private static final String[] REPORT_CATEGORIES = {"Name", "Address", "SSN", "Date of Birth", "Date of Graduation"};
    private float currentGPA;
    private GregorianCalendar dateOfGraduation;
    private ArrayList<StudentCourse> enrolledCourses;

    public Student() {
        enrolledCourses = new ArrayList<>();
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

    public void addNewClass(StudentCourse enrolledCourse) {
        enrolledCourses.add(enrolledCourse);
    }

    @Override
    public String toString() {
        return "Student";
        // return "Student{" + "currentGPA=" + currentGPA + ", dateOfGraduation=" + dateOfGraduation.getTime() + ", enrolledCourses=" + enrolledCourses + '}';
    }

    //TODO: protect this method from date of birth and date of graduation nullability
    @Override
    public String[] getReportCategoryData() {
        String[] reportCatagoriesData = {getFullName(), getFullAddress(), getSocial(), getDateOfBirthAsString(), getDateOfGraduationAsString()};
        return reportCatagoriesData;
    }

    @Override
    public String[] getReportCategories() {
        return REPORT_CATEGORIES;
    }

    public String getDateOfGraduationAsString() {
        return dateAsString(dateOfGraduation);
    }

    public enum StudentInfoFields {
        DATE_OF_GRADUATION;
    }

}
