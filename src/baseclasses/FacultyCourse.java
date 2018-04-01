package baseclasses;

import interfaces.ICourse;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author matt
 */
public class FacultyCourse implements ICourse, Serializable {
    private String courseId;

    FacultyCourse(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    @Override
    public String toString() {
        return "FacultyCourse{" + "courseId=" + courseId + '}';
    }


}
