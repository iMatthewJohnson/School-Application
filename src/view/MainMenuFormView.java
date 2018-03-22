/*
 * Created by JFormDesigner on Wed Mar 21 20:56:49 EDT 2018
 */

package view;

import controller.MainMenuViewController;
import view.AbstractBaseClasses.FormView;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Matthew Johnson
 */

public class MainMenuFormView extends FormView{

    public MainMenuFormView(MainMenuViewController viewController) {
        super(viewController);
    }



    @Override
    protected void initAdditional() {
////        for (Component component : this.jMenuBar1.getComponents()) {
////            if (component instanceof JMenuItem) {
////                ((JMenuItem) component).addActionListener(viewController);
////            }
////        }
//        this.addClassroom.addActionListener(viewController);
//        this.listClassrooms.addActionListener(viewController);
//        this.listStudents.addActionListener(viewController);
//        this.listFaculty.addActionListener(viewController);
//        this.addStudent.addActionListener(viewController);
    }


    protected void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Matthew Johnson
        topLevelFrame = new JFrame();
        menuBar = new JMenuBar();
        fileMenu = new JMenu();
        editMenu = new JMenu();
        classroomMenu = new JMenu();
        addClassroom = new JMenuItem();
        listClassrooms = new JMenuItem();
        facultyMenu = new JMenu();
        addFaculty = new JMenuItem();
        listFaculty = new JMenuItem();
        studentMenu = new JMenu();
        addStudent = new JMenuItem();
        listStudents = new JMenuItem();
        studentCourses = new JMenuItem();

        //======== topLevelFrame ========
        {
            topLevelFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            Container topLevelFrameContentPane = topLevelFrame.getContentPane();
            topLevelFrameContentPane.setLayout(null);

            //======== menuBar ========
            {
                menuBar.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
                menuBar.setMinimumSize(null);
                menuBar.setMaximumSize(null);

                //======== fileMenu ========
                {
                    fileMenu.setText("File");
                }
                menuBar.add(fileMenu);

                //======== editMenu ========
                {
                    editMenu.setText("Edit");
                }
                menuBar.add(editMenu);

                //======== classroomMenu ========
                {
                    classroomMenu.setText("Classroom");

                    //---- addClassroom ----
                    addClassroom.setText("Add Classroom");
                    classroomMenu.add(addClassroom);

                    //---- listClassrooms ----
                    listClassrooms.setText("List Classrooms");
                    classroomMenu.add(listClassrooms);
                }
                menuBar.add(classroomMenu);

                //======== facultyMenu ========
                {
                    facultyMenu.setText("Faculty");

                    //---- addFaculty ----
                    addFaculty.setText("Add Faculty");
                    addFaculty.setToolTipText("");
                    facultyMenu.add(addFaculty);

                    //---- listFaculty ----
                    listFaculty.setText("List Faculty");
                    facultyMenu.add(listFaculty);
                }
                menuBar.add(facultyMenu);

                //======== studentMenu ========
                {
                    studentMenu.setText("Student");

                    //---- addStudent ----
                    addStudent.setText("Add Student");
                    studentMenu.add(addStudent);

                    //---- listStudents ----
                    listStudents.setText("List Students");
                    studentMenu.add(listStudents);

                    //---- studentCourses ----
                    studentCourses.setText("Courses");
                    studentMenu.add(studentCourses);
                }
                menuBar.add(studentMenu);
            }
            topLevelFrame.setJMenuBar(menuBar);

            { // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < topLevelFrameContentPane.getComponentCount(); i++) {
                    Rectangle bounds = topLevelFrameContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = topLevelFrameContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                topLevelFrameContentPane.setMinimumSize(preferredSize);
                topLevelFrameContentPane.setPreferredSize(preferredSize);
            }
            topLevelFrame.setSize(400, 300);
            topLevelFrame.setLocationRelativeTo(topLevelFrame.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Matthew Johnson
    private JFrame topLevelFrame;
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
