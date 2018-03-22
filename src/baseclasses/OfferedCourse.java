package baseclasses;
import interfaces.ICourse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matt
 */
public class OfferedCourse implements ICourse {
    private Classroom classroom;
    private String courseName;
    private String courseId;

    public OfferedCourse(String courseId, String courseName, Classroom classroom) {
        this.classroom = classroom;
        this.courseName = courseName;
        this.courseId = courseId;
    }

    
    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    @Override
    public String toString() {
        return "OfferedCourse{" + "classroom=" + classroom + ", courseName=" + courseName + ", courseId=" + courseId + '}';
    }

    
    
}
