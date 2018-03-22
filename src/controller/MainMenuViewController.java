/*
 * Controller class for the top level menu form
 */

package controller;

import model.DataModel;
import view.MainMenuFormView;

import java.awt.event.ActionEvent;


public class MainMenuViewController extends ViewController {

    private DataModel classroomDataModel = new DataModel();
    private DataModel studentDataModel = new DataModel();
    private DataModel facultyDataModel = new DataModel();


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
            case "Add Student":
                new StudentInputViewController(studentDataModel);
            default:
                break;
        }

    }

    @Override
    protected void createView() {
        this.setView(new MainMenuFormView(this));

    }

    @Override
    protected void updateUI() {
        //
    }
}
