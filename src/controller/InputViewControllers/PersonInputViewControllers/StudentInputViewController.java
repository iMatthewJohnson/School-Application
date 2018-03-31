package controller.InputViewControllers.PersonInputViewControllers;

import ExceptionClasses.InvalidDataException;
import ExceptionClasses.NoDataException;
import baseclasses.Person;
import baseclasses.Student;
import baseclasses.StudentCourse;
import model.DataModel;
import utilities.TextFormatter;
import view.InputFormViews.InputFormView;
import view.InputFormViews.StudentInputFormView;

import javax.swing.*;
import java.awt.event.ActionEvent;

import static baseclasses.Student.StudentInfoFields.DATE_OF_GRADUATION;


public class StudentInputViewController extends PersonInputViewController {
    private StudentInputFormView studentInputView;

    public StudentInputViewController(DataModel dataModel) {
        super(dataModel);
        studentInputView = (StudentInputFormView) getView();
    }

    @Override
    protected void saveAdditionalInfo() {
        saveStudentInfo();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);
        String buttonPressed = event.getActionCommand();
        if (buttonPressed.equals("Add Class")) {
            //TODO:Change to list element rather than textfield
            JTextArea courseList = studentInputView.getCourseList();
            JTextField courseIdField = studentInputView.getCourseIdField();
            if (courseIdField.getText().equals(courseIdField.getToolTipText())) {
                ((InputFormView) getView()).getStatusLabel().setText("ERROR: Course ID is blank");
                hasError = true;
            } else {
                //Only add new line if there is already text in field
                courseList.setText(courseList.getText() +
                        (courseList.getText().length() > 0 ? "\n" : "") + courseIdField.getText());
                resetField(courseIdField);
            }
            updateUI();
        }
    }

    @Override
    protected void createView() {
        this.setView(new StudentInputFormView(this));
    }

    @Override
    protected void saveForm() {
        super.saveForm();
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
        String graduationDateAsString = setTextFromField(personFields.get(DATE_OF_GRADUATION.name()));
        try {
            student.setDateOfGraduation(graduationDateAsString.isEmpty() ? null :
                    TextFormatter.converDateAsTextToGregorgianCalendar(graduationDateAsString));
        }  catch (Exception e) {
            if (e instanceof NoDataException || e instanceof InvalidDataException) {
                displayErrorOnField(personFields.get(DATE_OF_GRADUATION.name()), e.getMessage());
            } else {
                e.printStackTrace();
            }
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
        COURSES
    }

}
