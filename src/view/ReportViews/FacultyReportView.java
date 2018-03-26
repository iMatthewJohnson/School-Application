/*
 * Created by JFormDesigner on Tue Mar 20 17:42:17 EDT 2018
 */

package view.ReportViews;

import controller.ViewController;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 * @author Matthew Johnson
 */
public class FacultyReportView extends ReportFormView {
    public FacultyReportView(ViewController controller) {
        super(controller);
    }

    @Override
    public JTable getTable() {
        return tableOfFaculty;
    }

    @Override
    public JTextArea getTextArea() {
        return textAreaOfFaculty;
    }

    @Override
    protected JButton getCloseButton() {
        return closeButton;
    }

    protected void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Matthew Johnson
        jLabel1 = new JLabel();
        jScrollPane1 = new JScrollPane();
        textAreaOfFaculty = new JTextArea();
        jLabel2 = new JLabel();
        closeButton = new JButton();
        jScrollPane3 = new JScrollPane();
        tableOfFaculty = new JTable();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(null);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- jLabel1 ----
        jLabel1.setText("List Of Faculty At A Glance");
        contentPane.add(jLabel1);
        jLabel1.setBounds(285, 20, 170, jLabel1.getPreferredSize().height);

        //======== jScrollPane1 ========
        {

            //---- textAreaOfFaculty ----
            textAreaOfFaculty.setColumns(20);
            textAreaOfFaculty.setRows(5);
            jScrollPane1.setViewportView(textAreaOfFaculty);
        }
        contentPane.add(jScrollPane1);
        jScrollPane1.setBounds(10, 45, 720, 124);

        //---- jLabel2 ----
        jLabel2.setText("List of Faculty");
        contentPane.add(jLabel2);
        jLabel2.setBounds(320, 190, 90, jLabel2.getPreferredSize().height);

        //---- closeButton ----
        closeButton.setText("Close");
        contentPane.add(closeButton);
        closeButton.setBounds(310, 380, 120, closeButton.getPreferredSize().height);

        //======== jScrollPane3 ========
        {
            jScrollPane3.setBackground(Color.white);
            jScrollPane3.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
            jScrollPane3.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

            //---- tableOfFaculty ----
            tableOfFaculty.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null, "", "", ""},
                    {null, null, null, null, null},
                    {null, null, null, null, null},
                    {null, null, null, null, null},
                    {null, null, null, null, null},
                    {null, null, null, null, null},
                    {null, null, null, null, null},
                },
                new String[] {
                    "Name", "Address", "SSN", "Date Of Birth", "Date of Graduation"
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
            jScrollPane3.setViewportView(tableOfFaculty);
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
    private JTextArea textAreaOfFaculty;
    private JLabel jLabel2;
    private JButton closeButton;
    private JScrollPane jScrollPane3;
    private JTable tableOfFaculty;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
