package baseclasses;

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
public class Faculty extends Person {
    private GregorianCalendar dateOfHire;
    private GregorianCalendar dateOfTermination;
    private String status;
    private double salary;
    private ArrayList<FacultyCourse> listOfCourses;

    public Faculty() {
        this.dateOfHire = new GregorianCalendar();
        this.dateOfTermination = new GregorianCalendar();
        this.status = "NO STATUS SET";
        this.salary = 0;
        this.listOfCourses = new ArrayList<>();
    }


    public GregorianCalendar getDateOfHire() {
        return dateOfHire;
    }

    public void setDateOfHire(GregorianCalendar dateOfHire) {
        this.dateOfHire = dateOfHire;
    }

    public GregorianCalendar getDateOfTermination() {
        return dateOfTermination;
    }

    public void setDateOfTermination(GregorianCalendar dateOfTermination) {
        this.dateOfTermination = dateOfTermination;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status.equals("PARTTIME") || status.equals("FULLTIME")) {
            this.status = status;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public ArrayList<FacultyCourse> getListOfCourses() {
        return listOfCourses;
    }

    public void setListOfCourses(ArrayList<FacultyCourse> listOfCourses) {
        this.listOfCourses = listOfCourses;
    }

    @Override
    public String toString() {
        return "Faculty{" + "dateOfHire=" + dateOfHire.getTime() + ", dateOfTermination=" + dateOfTermination.getTime() + ", status=" + status + ", salary=" + salary + ", listOfCourses=" + listOfCourses + '}';
    }


}
