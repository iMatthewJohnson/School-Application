package controller.InputViewControllers.PersonInputViewControllers;

import baseclasses.Person;
import baseclasses.Student;
import baseclasses.StudentCourse;
import model.DataModel;
import view.InputFormViews.StudentInputFormView;

import javax.swing.*;
import java.awt.event.ActionEvent;


public class StudentInputViewController extends PersonInputViewController {
    private StudentInputFormView studentInputView;
    private Student student;

    public StudentInputViewController(DataModel dataModel) {
        super(dataModel);
        studentInputView = (StudentInputFormView) getView();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);
        String buttonPressed = event.getActionCommand();
        if (buttonPressed.equals("Add Class")) {
            //TODO:Change to list element rather than textfield
            JTextArea courseList = studentInputView.getCourseList();
            JTextField courseIdField = studentInputView.getCourseIdField();
            //Only add new line if there is already text in feild
            courseList.setText(courseList.getText() +
                    (courseList.getText().length() > 0 ? "\n" : "") + courseIdField.getText());
            resetField(courseIdField);
        }
    }

    @Override
    protected void createView() {
        this.setView(new StudentInputFormView(this));
    }

    @Override
    protected void saveForm() {
        super.saveForm();
        saveStudentInfo();
    }

    @Override
    protected void resetForm() {
        super.resetForm();
        studentInputView.getCourseList().setText("");
    }
    @Override
    protected Person getNewDataModelObject() {
        return new Student();
    }

    private void saveStudentInfo() {
        //Get the student by casting person instance variable from PersonInputViewController
        Student student = (Student) super.getPerson();
        //Save graduation date info
        String graduationDateAsString = getPersonFields().get(Student.StudentInfoFields.DATE_OF_GRADUATION.name());
        //TODO: Remove hard reference to "MM/DD/YYYY" and have it be a constant or refer back to textfield's placeholder text
        //TODO: Implement a method that parses through date entered and makes sure it's valid. If it's fixable then fix but if not then throw alert to user
        //Only save graduation date if it's in a date format
        if (!graduationDateAsString.equals("MM/DD/YYYY")) {
            student.setDateOfGraduation(converDateAsTextToGregorgianCalendar(graduationDateAsString));
        }

        //Save courses
        String[] courseList = studentInputView.getCourseList().getText().split("\n");
        for (String course : courseList) {
            student.addNewClass(new StudentCourse(course));
        }
    }

    public enum studentTabs {
        PERSONAL_INFO,
        STUDENT_INFO,
        COURSES;
    }

}
