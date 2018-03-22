/*
 * Created by JFormDesigner on Wed Mar 21 20:56:49 EDT 2018
 */

package view;

import controller.MainMenuViewController;

import java.awt.*;
import javax.swing.*;

/**
 * @author Matthew Johnson
 */

public class MainMenuFormView extends FormView {

    public MainMenuFormView(MainMenuViewController viewController) {
        super(viewController);
    }



    @Override
    protected void initAdditional() {

        this.addClassroom.addActionListener(viewController);
        this.listClassrooms.addActionListener(viewController);
        this.listStudents.addActionListener(viewController);
        this.listFaculty.addActionListener(viewController);
        this.addStudent.addActionListener(viewController);
    }


    protected void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Matthew Johnson
        this.menuBar = new JMenuBar();
        this.fileMenu = new JMenu();
        this.editMenu = new JMenu();
        this.classroomMenu = new JMenu();
        this.addClassroom = new JMenuItem();
        this.listClassrooms = new JMenuItem();
        this.facultyMenu = new JMenu();
        this.addFaculty = new JMenuItem();
        this.listFaculty = new JMenuItem();
        this.studentMenu = new JMenu();
        this.addStudent = new JMenuItem();
        this.listStudents = new JMenuItem();
        this.studentCourses = new JMenuItem();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(null);
        setName("topLevelFrame");
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== menuBar ========
        {
            this.menuBar.setMinimumSize(null);
            this.menuBar.setMaximumSize(null);
            this.menuBar.setName("menuBar");

            //======== fileMenu ========
            {
                this.fileMenu.setText("File");
                this.fileMenu.setName("fileMenu");
            }
            this.menuBar.add(this.fileMenu);

            //======== editMenu ========
            {
                this.editMenu.setText("Edit");
                this.editMenu.setName("editMenu");
            }
            this.menuBar.add(this.editMenu);

            //======== classroomMenu ========
            {
                this.classroomMenu.setText("Classroom");
                this.classroomMenu.setName("classroomMenu");

                //---- addClassroom ----
                this.addClassroom.setText("Add Classroom");
                this.addClassroom.setName("addClassroom");
                this.classroomMenu.add(this.addClassroom);

                //---- listClassrooms ----
                this.listClassrooms.setText("List Classrooms");
                this.listClassrooms.setName("listClassrooms");
                this.classroomMenu.add(this.listClassrooms);
            }
            this.menuBar.add(this.classroomMenu);

            //======== facultyMenu ========
            {
                this.facultyMenu.setText("Faculty");
                this.facultyMenu.setName("facultyMenu");

                //---- addFaculty ----
                this.addFaculty.setText("Add Faculty");
                this.addFaculty.setToolTipText("");
                this.addFaculty.setName("addFaculty");
                this.facultyMenu.add(this.addFaculty);

                //---- listFaculty ----
                this.listFaculty.setText("List Faculty");
                this.listFaculty.setName("listFaculty");
                this.facultyMenu.add(this.listFaculty);
            }
            this.menuBar.add(this.facultyMenu);

            //======== studentMenu ========
            {
                this.studentMenu.setText("Student");
                this.studentMenu.setName("studentMenu");

                //---- addStudent ----
                this.addStudent.setText("Add Student");
                this.addStudent.setName("addStudent");
                this.studentMenu.add(this.addStudent);

                //---- listStudents ----
                this.listStudents.setText("List Students");
                this.listStudents.setName("listStudents");
                this.studentMenu.add(this.listStudents);

                //---- studentCourses ----
                this.studentCourses.setText("Courses");
                this.studentCourses.setName("studentCourses");
                this.studentMenu.add(this.studentCourses);
            }
            this.menuBar.add(this.studentMenu);
        }
        setJMenuBar(this.menuBar);

        { // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        setSize(400, 300);
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Matthew Johnson
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenu editMenu;
    private JMenu classroomMenu;
    private JMenuItem addClassroom;
    private JMenuItem listClassrooms;
    private JMenu facultyMenu;
    private JMenuItem addFaculty;
    private JMenuItem listFaculty;
    private JMenu studentMenu;
    private JMenuItem addStudent;
    private JMenuItem listStudents;
    private JMenuItem studentCourses;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
