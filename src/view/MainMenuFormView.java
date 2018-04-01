/*
 * Created by JFormDesigner on Wed Mar 21 20:56:49 EDT 2018
 */

package view;

import controller.MainMenuViewController;

import javax.swing.*;
import java.awt.*;

/**
 * @author Matthew Johnson
 */

public class MainMenuFormView extends FormView {

    public MainMenuFormView(MainMenuViewController viewController) {
        super(viewController);
    }

    @Override
    protected void initAdditional() {
        addClassroom.addActionListener(viewController);
        listClassrooms.addActionListener(viewController);
        listStudents.addActionListener(viewController);
        listFaculty.addActionListener(viewController);
        addStudent.addActionListener(viewController);
        studentCourses.addActionListener(viewController);
        saveData.addActionListener(viewController);
        readData.addActionListener(viewController);
    }

    @Override
    protected void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Matthew Johnson
        menuBar = new JMenuBar();
        fileMenu = new JMenu();
        saveData = new JMenuItem();
        readData = new JMenuItem();
        editMenu = new JMenu();
        classroomMenu = new JMenu();
        addClassroom = new JMenuItem();
        listClassrooms = new JMenuItem();
        studentMenu = new JMenu();
        addStudent = new JMenuItem();
        listStudents = new JMenuItem();
        studentCourses = new JMenuItem();
        facultyMenu = new JMenu();
        addFaculty = new JMenuItem();
        listFaculty = new JMenuItem();
        closeButton = new JButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(null);
        setName("topLevelFrame");
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== menuBar ========
        {
            menuBar.setMinimumSize(null);
            menuBar.setMaximumSize(null);
            menuBar.setName("menuBar");

            //======== fileMenu ========
            {
                fileMenu.setText("File");
                fileMenu.setName("fileMenu");

                //---- saveData ----
                saveData.setText("Save Data");
                saveData.setName("saveData");
                fileMenu.add(saveData);

                //---- readData ----
                readData.setText("Read Data");
                readData.setName("readData");
                fileMenu.add(readData);
            }
            menuBar.add(fileMenu);

            //======== editMenu ========
            {
                editMenu.setText("Edit");
                editMenu.setName("editMenu");
            }
            menuBar.add(editMenu);

            //======== classroomMenu ========
            {
                classroomMenu.setText("Classroom");
                classroomMenu.setName("classroomMenu");

                //---- addClassroom ----
                addClassroom.setText("Add Classroom");
                addClassroom.setName("addClassroom");
                classroomMenu.add(addClassroom);

                //---- listClassrooms ----
                listClassrooms.setText("List Classrooms");
                listClassrooms.setName("listClassrooms");
                classroomMenu.add(listClassrooms);
            }
            menuBar.add(classroomMenu);

            //======== studentMenu ========
            {
                studentMenu.setText("Student");
                studentMenu.setName("studentMenu");

                //---- addStudent ----
                addStudent.setText("Add Student");
                addStudent.setName("addStudent");
                studentMenu.add(addStudent);

                //---- listStudents ----
                listStudents.setText("List Students");
                listStudents.setName("listStudents");
                studentMenu.add(listStudents);

                //---- studentCourses ----
                studentCourses.setText("Student Courses");
                studentCourses.setName("studentCourses");
                studentMenu.add(studentCourses);
            }
            menuBar.add(studentMenu);

            //======== facultyMenu ========
            {
                facultyMenu.setText("Faculty");
                facultyMenu.setName("facultyMenu");

                //---- addFaculty ----
                addFaculty.setText("Add Faculty");
                addFaculty.setToolTipText("");
                addFaculty.setEnabled(false);
                addFaculty.setName("addFaculty");
                facultyMenu.add(addFaculty);

                //---- listFaculty ----
                listFaculty.setText("List Faculty");
                listFaculty.setName("listFaculty");
                facultyMenu.add(listFaculty);
            }
            menuBar.add(facultyMenu);
        }
        setJMenuBar(menuBar);

        //---- closeButton ----
        closeButton.setText("Close");
        closeButton.setEnabled(false);
        closeButton.setVisible(false);
        closeButton.setName("closeButton");
        contentPane.add(closeButton);
        closeButton.setBounds(135, 200, 120, closeButton.getPreferredSize().height);

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

    @Override
    protected JButton getCloseButton() {
        return closeButton;
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Matthew Johnson
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenuItem saveData;
    private JMenuItem readData;
    private JMenu editMenu;
    private JMenu classroomMenu;
    private JMenuItem addClassroom;
    private JMenuItem listClassrooms;
    private JMenu studentMenu;
    private JMenuItem addStudent;
    private JMenuItem listStudents;
    private JMenuItem studentCourses;
    private JMenu facultyMenu;
    private JMenuItem addFaculty;
    private JMenuItem listFaculty;
    private JButton closeButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
