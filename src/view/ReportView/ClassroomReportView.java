/*
 * Created by JFormDesigner on Sat Mar 17 22:34:04 EDT 2018
 */

package view.ReportView;

import controller.ClassroomReportViewController;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 * @author Matthew Johnson
 */
@SuppressWarnings("FieldCanBeLocal")
public class ClassroomReportView extends ReportFormView {

    public ClassroomReportView(ClassroomReportViewController viewController) {
        super(viewController);
    }

    protected void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Matthew Johnson
        jLabel1 = new JLabel();
        jScrollPane1 = new JScrollPane();
        textAreaOfClassrooms = new JTextArea();
        jLabel2 = new JLabel();
        closeButton = new JButton();
        jScrollPane3 = new JScrollPane();
        tableOfClassrooms = new JTable();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- jLabel1 ----
        jLabel1.setText("List Of Classrooms At A Glance"); //NOI18N
        contentPane.add(jLabel1);
        jLabel1.setBounds(275, 20, 210, jLabel1.getPreferredSize().height);

        //======== jScrollPane1 ========
        {

            //---- textAreaOfClassrooms ----
            textAreaOfClassrooms.setColumns(20);
            textAreaOfClassrooms.setRows(5);
            jScrollPane1.setViewportView(textAreaOfClassrooms);
        }
        contentPane.add(jScrollPane1);
        jScrollPane1.setBounds(10, 45, 720, 124);

        //---- jLabel2 ----
        jLabel2.setText("Tabular List of Classrooms"); //NOI18N
        contentPane.add(jLabel2);
        jLabel2.setBounds(290, 190, 300, jLabel2.getPreferredSize().height);

        //---- closeButton ----
        closeButton.setText("Close"); //NOI18N
        contentPane.add(closeButton);
        closeButton.setBounds(310, 380, 120, closeButton.getPreferredSize().height);

        //======== jScrollPane3 ========
        {

            //---- tableOfClassrooms ----
            tableOfClassrooms.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null},
                    {null, null},
                    {null, null},
                    {null, null},
                    {null, null},
                    {null, null},
                    {null, null},
                },
                new String[] {
                    "Room Number", "Room Type" //NOI18N
                }
            ) {
                Class<?>[] columnTypes = new Class<?>[] {
                    String.class, String.class
                };
                @Override
                public Class<?> getColumnClass(int columnIndex) {
                    return columnTypes[columnIndex];
                }
            });
            tableOfClassrooms.setColumnSelectionAllowed(true);
            jScrollPane3.setViewportView(tableOfClassrooms);
        }
        contentPane.add(jScrollPane3);
        jScrollPane3.setBounds(10, 220, 720, 138);

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


    @Override
    public JTable getTable() {
        return this.tableOfClassrooms;
    }

    @Override
    public JTextArea getTextArea() {
        return this.textAreaOfClassrooms;
    }

    @Override
    protected void initAdditional() {
        this.closeButton.addActionListener(viewController);
    }


    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Matthew Johnson
    private JLabel jLabel1;
    private JScrollPane jScrollPane1;
    private JTextArea textAreaOfClassrooms;
    private JLabel jLabel2;
    private JButton closeButton;
    private JScrollPane jScrollPane3;
    private JTable tableOfClassrooms;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
