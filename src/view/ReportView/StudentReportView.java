/*
 * Created by JFormDesigner on Sun Mar 18 23:07:48 EDT 2018
 */

package view.ReportView;

import controller.ViewController;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 * @author Matthew Johnson
 */
@SuppressWarnings("FieldCanBeLocal")
public class StudentReportView extends ReportFormView {

    public StudentReportView(ViewController controller) {
        super(controller);
    }

    @Override
    public JTable getTable() {
        return tableOfStudents;
    }

    @Override
    public JTextArea getTextArea() {
        return textAreaOfStudents;
    }

    @Override
    protected void initAdditional() {
        this.closeButton.addActionListener(viewController);
    }

    protected void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Matthew Johnson
        jLabel1 = new JLabel();
        jScrollPane1 = new JScrollPane();
        textAreaOfStudents = new JTextArea();
        jLabel2 = new JLabel();
        closeButton = new JButton();
        jScrollPane3 = new JScrollPane();
        tableOfStudents = new JTable();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(null);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- jLabel1 ----
        jLabel1.setText("List Of Students At A Glance"); //NOI18N
        contentPane.add(jLabel1);
        jLabel1.setBounds(280, 20, 185, jLabel1.getPreferredSize().height);

        //======== jScrollPane1 ========
        {

            //---- textAreaOfStudents ----
            textAreaOfStudents.setColumns(20);
            textAreaOfStudents.setRows(5);
            jScrollPane1.setViewportView(textAreaOfStudents);
        }
        contentPane.add(jScrollPane1);
        jScrollPane1.setBounds(10, 45, 720, 124);

        //---- jLabel2 ----
        jLabel2.setText("List of Students"); //NOI18N
        contentPane.add(jLabel2);
        jLabel2.setBounds(310, 190, 105, jLabel2.getPreferredSize().height);

        //---- closeButton ----
        closeButton.setText("Close"); //NOI18N
        contentPane.add(closeButton);
        closeButton.setBounds(310, 380, 120, closeButton.getPreferredSize().height);

        //======== jScrollPane3 ========
        {
            jScrollPane3.setBackground(Color.white);
            jScrollPane3.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
            jScrollPane3.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

            //---- tableOfStudents ----
            tableOfStudents.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null, "", "", ""}, //NOI18N
                    {null, null, null, null, null},
                    {null, null, null, null, null},
                    {null, null, null, null, null},
                    {null, null, null, null, null},
                    {null, null, null, null, null},
                    {null, null, null, null, null},
                },
                new String[] {
                    "Name", "Address", "SSN", "Date Of Birth", "Date of Graduation" //NOI18N
                }
            ) {
                Class<?>[] columnTypes = new Class<?>[] {
                    String.class, String.class, String.class, String.class, String.class
                };
                boolean[] columnEditable = new boolean[] {
                    false, false, false, false, false
                };
                @Override
                public Class<?> getColumnClass(int columnIndex) {
                    return columnTypes[columnIndex];
                }
                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return columnEditable[columnIndex];
                }
            });
            jScrollPane3.setViewportView(tableOfStudents);
        }
        contentPane.add(jScrollPane3);
        jScrollPane3.setBounds(10, 220, 715, 135);

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
        setSize(740, 450);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Matthew Johnson
    private JLabel jLabel1;
    private JScrollPane jScrollPane1;
    private JTextArea textAreaOfStudents;
    private JLabel jLabel2;
    private JButton closeButton;
    private JScrollPane jScrollPane3;
    private JTable tableOfStudents;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
