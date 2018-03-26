package baseclasses;

import interfaces.ICourse;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author matt
 */
public class StudentCourse implements ICourse {
    private String courseId;
    private ArrayList<Float> courseGrades;

    public StudentCourse(String courseId) {
        this.courseId = courseId;
        this.courseGrades = new ArrayList<>();
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public ArrayList<Float> getCourseGrades() {
        return courseGrades;
    }

    public void setCourseGrades(ArrayList<Float> courseGrades) {
        this.courseGrades = courseGrades;
    }

    @Override
    public String toString() {
        return "StudentCourse{" + "courseId=" + courseId + ", courseGrades=" + courseGrades + '}';
    }


}
