/*
 * Created by JFormDesigner on Wed Mar 21 10:01:56 EDT 2018
 */

package view.TabViews;

import controller.StudentInputViewController;
import view.InputFormView;

import javax.swing.*;
import java.awt.*;

/**
 * @author Matthew Johnson
 */
public class StudentInputView extends InputFormView {


    public StudentInputView(StudentInputViewController viewController) {
        super(viewController);
    }

    @Override
    protected void initAdditional() {
        saveButton.addActionListener(viewController);
        clearButton.addActionListener(viewController);
        closeButton.addActionListener(viewController);
    }

    protected void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Matthew Johnson
        tabbedPane = new JTabbedPane();
        panelPersonalInfo = new JPanel();
        textFieldFirstName = new JTextField();
        textFieldLastName = new JTextField();
        textFieldAddress1 = new JTextField();
        textFieldState = new JTextField();
        label1 = new JLabel();
        textFieldAddress2 = new JTextField();
        textFieldCity = new JTextField();
        textFieldZip = new JTextField();
        seperator = new JSeparator();
        label2 = new JLabel();
        label3 = new JLabel();
        textFieldSSN1 = new JPasswordField();
        label4 = new JLabel();
        textFieldSSN2 = new JPasswordField();
        lebel5 = new JLabel();
        textFieldSSN3 = new JPasswordField();
        textFieldDOB = new JTextField();
        label6 = new JLabel();
        panelStudentInfo = new JPanel();
        jLabel5 = new JLabel();
        textFieldGradDate = new JTextField();
        gpaLabel = new JLabel();
        panelClasses = new JPanel();
        jLabel7 = new JLabel();
        textFieldCourseId = new JTextField();
        addClassButton = new JButton();
        jScrollPane1 = new JScrollPane();
        listEnrolledClasses = new JList<>();
        jLabel8 = new JLabel();
        removeCourseButton = new JButton();
        jSeparator1 = new JSeparator();
        saveButton = new JButton();
        clearButton = new JButton();
        closeButton = new JButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        setMinimumSize(null);
        setSize(new Dimension(549, 480));
        setResizable(false);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== tabbedPane ========
        {
            tabbedPane.setMaximumSize(new Dimension(430, 386));
            tabbedPane.setMinimumSize(new Dimension(430, 386));

            //======== panelPersonalInfo ========
            {
                panelPersonalInfo.setPreferredSize(null);
                panelPersonalInfo.setMinimumSize(null);
                panelPersonalInfo.setMaximumSize(null);

                // JFormDesigner evaluation mark
                panelPersonalInfo.setBorder(new javax.swing.border.CompoundBorder(
                    new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                        "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER, //NOI18N
                        javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12), //NOI18N
                        java.awt.Color.red), panelPersonalInfo.getBorder())); panelPersonalInfo.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}}); //NOI18N

                panelPersonalInfo.setLayout(null);

                //---- textFieldFirstName ----
                textFieldFirstName.setForeground(Color.gray);
                textFieldFirstName.setText("First Name"); //NOI18N
                textFieldFirstName.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
                panelPersonalInfo.add(textFieldFirstName);
                textFieldFirstName.setBounds(10, 30, 170, 40);

                //---- textFieldLastName ----
                textFieldLastName.setForeground(Color.gray);
                textFieldLastName.setText("Last Name"); //NOI18N
                panelPersonalInfo.add(textFieldLastName);
                textFieldLastName.setBounds(220, 30, 170, 40);

                //---- textFieldAddress1 ----
                textFieldAddress1.setForeground(Color.gray);
                textFieldAddress1.setText("Address1"); //NOI18N
                panelPersonalInfo.add(textFieldAddress1);
                textFieldAddress1.setBounds(10, 80, 170, 40);

                //---- textFieldState ----
                textFieldState.setForeground(Color.gray);
                textFieldState.setHorizontalAlignment(SwingConstants.CENTER);
                textFieldState.setText("State"); //NOI18N
                panelPersonalInfo.add(textFieldState);
                textFieldState.setBounds(220, 130, 50, 40);

                //---- label1 ----
                label1.setText("Contact Info:"); //NOI18N
                panelPersonalInfo.add(label1);
                label1.setBounds(20, 0, 85, 30);

                //---- textFieldAddress2 ----
                textFieldAddress2.setForeground(Color.gray);
                textFieldAddress2.setText("Address2"); //NOI18N
                panelPersonalInfo.add(textFieldAddress2);
                textFieldAddress2.setBounds(220, 80, 170, 40);

                //---- textFieldCity ----
                textFieldCity.setForeground(Color.gray);
                textFieldCity.setText("City/Town"); //NOI18N
                panelPersonalInfo.add(textFieldCity);
                textFieldCity.setBounds(10, 130, 170, 40);

                //---- textFieldZip ----
                textFieldZip.setForeground(Color.gray);
                textFieldZip.setHorizontalAlignment(SwingConstants.CENTER);
                textFieldZip.setText("Zip Code"); //NOI18N
                panelPersonalInfo.add(textFieldZip);
                textFieldZip.setBounds(310, 130, 80, 40);
                panelPersonalInfo.add(seperator);
                seperator.setBounds(10, 180, 385, seperator.getPreferredSize().height);

                //---- label2 ----
                label2.setText("Personal Information"); //NOI18N
                panelPersonalInfo.add(label2);
                label2.setBounds(10, 190, 140, 30);

                //---- label3 ----
                label3.setText("Social Security Number:"); //NOI18N
                panelPersonalInfo.add(label3);
                label3.setBounds(20, 230, 150, 20);

                //---- textFieldSSN1 ----
                textFieldSSN1.setForeground(Color.gray);
                textFieldSSN1.setHorizontalAlignment(SwingConstants.CENTER);
                textFieldSSN1.setText("XXX"); //NOI18N
                panelPersonalInfo.add(textFieldSSN1);
                textFieldSSN1.setBounds(10, 260, 50, 40);

                //---- label4 ----
                label4.setHorizontalAlignment(SwingConstants.CENTER);
                label4.setText("-"); //NOI18N
                panelPersonalInfo.add(label4);
                label4.setBounds(53, 275, 30, 11);

                //---- textFieldSSN2 ----
                textFieldSSN2.setForeground(Color.gray);
                textFieldSSN2.setHorizontalAlignment(SwingConstants.CENTER);
                textFieldSSN2.setText("XX"); //NOI18N
                panelPersonalInfo.add(textFieldSSN2);
                textFieldSSN2.setBounds(76, 260, 40, 40);

                //---- lebel5 ----
                lebel5.setHorizontalAlignment(SwingConstants.CENTER);
                lebel5.setText("-"); //NOI18N
                panelPersonalInfo.add(lebel5);
                lebel5.setBounds(113, 277, 20, 6);

                //---- textFieldSSN3 ----
                textFieldSSN3.setForeground(Color.gray);
                textFieldSSN3.setHorizontalAlignment(SwingConstants.CENTER);
                textFieldSSN3.setText("XXXX"); //NOI18N
                panelPersonalInfo.add(textFieldSSN3);
                textFieldSSN3.setBounds(130, 260, 60, 40);

                //---- textFieldDOB ----
                textFieldDOB.setForeground(Color.gray);
                textFieldDOB.setHorizontalAlignment(SwingConstants.CENTER);
                textFieldDOB.setText("MM/DD/YYYY"); //NOI18N
                panelPersonalInfo.add(textFieldDOB);
                textFieldDOB.setBounds(260, 260, 130, 40);

                //---- label6 ----
                label6.setText("Date of Birth:"); //NOI18N
                panelPersonalInfo.add(label6);
                label6.setBounds(280, 235, 90, 15);

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panelPersonalInfo.getComponentCount(); i++) {
                        Rectangle bounds = panelPersonalInfo.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panelPersonalInfo.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panelPersonalInfo.setMinimumSize(preferredSize);
                    panelPersonalInfo.setPreferredSize(preferredSize);
                }
            }
            tabbedPane.addTab("Personal Info", panelPersonalInfo); //NOI18N

            //======== panelStudentInfo ========
            {
                panelStudentInfo.setLayout(null);

                //---- jLabel5 ----
                jLabel5.setText("Graduation Date:"); //NOI18N
                panelStudentInfo.add(jLabel5);
                jLabel5.setBounds(30, 15, 105, 20);

                //---- textFieldGradDate ----
                textFieldGradDate.setForeground(Color.gray);
                textFieldGradDate.setHorizontalAlignment(SwingConstants.CENTER);
                textFieldGradDate.setText("MM/DD/YYYY"); //NOI18N
                panelStudentInfo.add(textFieldGradDate);
                textFieldGradDate.setBounds(20, 45, 130, 40);

                //---- gpaLabel ----
                gpaLabel.setText("GPA: 0.0"); //NOI18N
                panelStudentInfo.add(gpaLabel);
                gpaLabel.setBounds(new Rectangle(new Point(30, 105), gpaLabel.getPreferredSize()));

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panelStudentInfo.getComponentCount(); i++) {
                        Rectangle bounds = panelStudentInfo.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panelStudentInfo.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panelStudentInfo.setMinimumSize(preferredSize);
                    panelStudentInfo.setPreferredSize(preferredSize);
                }
            }
            tabbedPane.addTab("Student Info", panelStudentInfo); //NOI18N

            //======== panelClasses ========
            {
                panelClasses.setLayout(null);

                //---- jLabel7 ----
                jLabel7.setText("Add Class:"); //NOI18N
                panelClasses.add(jLabel7);
                jLabel7.setBounds(20, 10, 90, jLabel7.getPreferredSize().height);

                //---- textFieldCourseId ----
                textFieldCourseId.setForeground(Color.gray);
                textFieldCourseId.setText("Course ID"); //NOI18N
                panelClasses.add(textFieldCourseId);
                textFieldCourseId.setBounds(20, 52, 130, 25);

                //---- addClassButton ----
                addClassButton.setText("Add Class"); //NOI18N
                panelClasses.add(addClassButton);
                addClassButton.setBounds(170, 48, 97, addClassButton.getPreferredSize().height);

                //======== jScrollPane1 ========
                {
                    jScrollPane1.setViewportView(listEnrolledClasses);
                }
                panelClasses.add(jScrollPane1);
                jScrollPane1.setBounds(15, 130, 370, 110);

                //---- jLabel8 ----
                jLabel8.setText("Enrolled Classes"); //NOI18N
                panelClasses.add(jLabel8);
                jLabel8.setBounds(15, 110, 110, jLabel8.getPreferredSize().height);

                //---- removeCourseButton ----
                removeCourseButton.setText("Remove Course"); //NOI18N
                panelClasses.add(removeCourseButton);
                removeCourseButton.setBounds(255, 250, 135, removeCourseButton.getPreferredSize().height);
                panelClasses.add(jSeparator1);
                jSeparator1.setBounds(20, 90, 370, jSeparator1.getPreferredSize().height);

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panelClasses.getComponentCount(); i++) {
                        Rectangle bounds = panelClasses.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panelClasses.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panelClasses.setMinimumSize(preferredSize);
                    panelClasses.setPreferredSize(preferredSize);
                }
            }
            tabbedPane.addTab("Classes", panelClasses); //NOI18N
        }
        contentPane.add(tabbedPane);
        tabbedPane.setBounds(5, 0, 415, 355);

        //---- saveButton ----
        saveButton.setText("Save"); //NOI18N
        contentPane.add(saveButton);
        saveButton.setBounds(185, 350, 69, 32);

        //---- clearButton ----
        clearButton.setText("Clear"); //NOI18N
        contentPane.add(clearButton);
        clearButton.setBounds(255, 350, 69, 32);

        //---- closeButton ----
        closeButton.setText("Close"); //NOI18N
        contentPane.add(closeButton);
        closeButton.setBounds(325, 350, 69, 32);

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
        setSize(425, 415);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    @Override
    protected JPanel[] getFormPanels() {
        JPanel[] formPanels = {panelPersonalInfo,panelStudentInfo};
        return formPanels;
    }


    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Matthew Johnson
    private JTabbedPane tabbedPane;
    private JPanel panelPersonalInfo;
    private JTextField textFieldFirstName;
    private JTextField textFieldLastName;
    private JTextField textFieldAddress1;
    private JTextField textFieldState;
    private JLabel label1;
    private JTextField textFieldAddress2;
    private JTextField textFieldCity;
    private JTextField textFieldZip;
    private JSeparator seperator;
    private JLabel label2;
    private JLabel label3;
    private JPasswordField textFieldSSN1;
    private JLabel label4;
    private JPasswordField textFieldSSN2;
    private JLabel lebel5;
    private JPasswordField textFieldSSN3;
    private JTextField textFieldDOB;
    private JLabel label6;
    private JPanel panelStudentInfo;
    private JLabel jLabel5;
    private JTextField textFieldGradDate;
    private JLabel gpaLabel;
    private JPanel panelClasses;
    private JLabel jLabel7;
    private JTextField textFieldCourseId;
    private JButton addClassButton;
    private JScrollPane jScrollPane1;
    private JList<String> listEnrolledClasses;
    private JLabel jLabel8;
    private JButton removeCourseButton;
    private JSeparator jSeparator1;
    private JButton saveButton;
    private JButton clearButton;
    private JButton closeButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
