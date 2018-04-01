/*
 * Controller class for the top level menu form
 */

package controller;

import controller.InputViewControllers.ClassroomInputViewControllers.ClassroomInputViewController;
import controller.InputViewControllers.PersonInputViewControllers.StudentInputViewController;
import controller.ReportViewControllers.ClassroomReportViewController;
import controller.ReportViewControllers.FacultyReportViewController;
import controller.ReportViewControllers.StudentReportViewController;
import model.DataModel;
import utilities.FormDataIO;
import view.MainMenuFormView;

import java.awt.event.ActionEvent;

/*
    Faculty menu currently disabled.
 */
public class MainMenuViewController extends ViewController {

    private DataModel classroomDataModel = new DataModel();
    private DataModel studentDataModel = new DataModel();
    private DataModel facultyDataModel = new DataModel();
    private StudentInputViewController studentInputViewController;

    private static final String CLASSROOM_FILE_NAME = "classroom";
    private static final String STUDENT_FILE_NAME = "student";

    @Override
    public void actionPerformed(ActionEvent event) {

        //  Figure out which button was clicked
        String menuItemClicked = event.getActionCommand();

        switch (menuItemClicked) {
            case "List Classrooms":
                new ClassroomReportViewController(classroomDataModel);
                break;
            case "Add Classroom":
                new ClassroomInputViewController(classroomDataModel);
                break;
            case "List Students":
                new StudentReportViewController(studentDataModel);
                break;
            case "List Faculty":
                new FacultyReportViewController(facultyDataModel);
                break;
            //Since adding a student and student courses are part of the same view and view controller, we must check
            //if the view has already been created or not (so we don't end up with two instances of Student views).
            //If it is open, just switch to the appropriate tab.
            case "Add Student":
                if (studentInputViewController == null) {
                    studentInputViewController = new StudentInputViewController(studentDataModel);
                }
                studentInputViewController.setVewTabFocus(StudentInputViewController.studentTabs.PERSONAL_INFO.ordinal());
                break;
            case "Student Courses":
                if (studentInputViewController == null) {
                    studentInputViewController = new StudentInputViewController(studentDataModel);
                }
                studentInputViewController.setVewTabFocus(StudentInputViewController.studentTabs.COURSES.ordinal());
                break;
            case "Save Data":
                FormDataIO.writeSerializedFile(classroomDataModel, CLASSROOM_FILE_NAME);
                FormDataIO.writeSerializedFile(studentDataModel, STUDENT_FILE_NAME);
            case "Read Data":
                classroomDataModel.setListOfElements(FormDataIO.readSerializedFile(CLASSROOM_FILE_NAME));
                studentDataModel.setListOfElements(FormDataIO.readSerializedFile(STUDENT_FILE_NAME));
            default:
                break;
        }

    }

    @Override
    protected void createView() {
        setView(new MainMenuFormView(this));

    }

    @Override
    protected void updateUI() {
        //Currently no implementation needed
    }
}
