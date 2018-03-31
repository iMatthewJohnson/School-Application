/*
 * Created by JFormDesigner on Sat Mar 17 23:47:29 EDT 2018
 */

package view.InputFormViews;

import controller.InputViewControllers.ClassroomInputViewControllers.ClassroomInputViewController;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * @author Matthew Johnson
 */

public class ClassroomInputFormView extends InputFormView {

    public ClassroomInputFormView(ClassroomInputViewController viewController) {
        super(viewController);
    }

    public JTextField getRoomNumberTextfield() {
        return roomNumberTextfield;
    }

    public JComboBox<String> getRoomTypeCombobox() {
        return roomTypeCombobox;
    }

    public JLabel getStatusLabel() {
        return statusLabel;
    }


    protected void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Matthew Johnson
        roomNumberLabel = new JLabel();
        roomTypeLabel = new JLabel();
        roomNumberTextfield = new JTextField();
        roomTypeCombobox = new JComboBox<>();
        saveButton = new JButton();
        clearButton = new JButton();
        closeButton = new JButton();
        statusLabel = new JLabel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- roomNumberLabel ----
        roomNumberLabel.setText("Room Number:");
        contentPane.add(roomNumberLabel);
        roomNumberLabel.setBounds(20, 20, 95, roomNumberLabel.getPreferredSize().height);

        //---- roomTypeLabel ----
        roomTypeLabel.setText("Room Type:");
        contentPane.add(roomTypeLabel);
        roomTypeLabel.setBounds(40, 50, 75, roomTypeLabel.getPreferredSize().height);

        //---- roomNumberTextfield ----
        roomNumberTextfield.setText("Room Number");
        roomNumberTextfield.setForeground(Color.gray);
        roomNumberTextfield.setToolTipText("Room Number");
        contentPane.add(roomNumberTextfield);
        roomNumberTextfield.setBounds(120, 20, 190, roomNumberTextfield.getPreferredSize().height);

        //---- roomTypeCombobox ----
        roomTypeCombobox.setModel(new DefaultComboBoxModel<>(new String[] {
            "--",
            "Lab",
            "Classroom",
            "Lecture Hall"
        }));
        contentPane.add(roomTypeCombobox);
        roomTypeCombobox.setBounds(120, 50, 190, roomTypeCombobox.getPreferredSize().height);

        //---- saveButton ----
        saveButton.setText("Save");
        contentPane.add(saveButton);
        saveButton.setBounds(40, 120, 100, saveButton.getPreferredSize().height);

        //---- clearButton ----
        clearButton.setText("Clear");
        contentPane.add(clearButton);
        clearButton.setBounds(150, 120, 90, clearButton.getPreferredSize().height);

        //---- closeButton ----
        closeButton.setText("Close");
        contentPane.add(closeButton);
        closeButton.setBounds(250, 120, 90, closeButton.getPreferredSize().height);

        //---- statusLabel ----
        statusLabel.setForeground(Color.red);
        statusLabel.setHorizontalAlignment(SwingConstants.CENTER);
        statusLabel.setText(" ");
        contentPane.add(statusLabel);
        statusLabel.setBounds(35, 90, 320, 20);

        contentPane.setPreferredSize(new Dimension(385, 205));
        setSize(385, 205);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    @Override
    protected JButton getCloseButton() {
        return closeButton;
    }


    @Override
    protected JButton getSaveButton() {
        return saveButton;
    }

    @Override
    protected JButton getClearButton() {
        return clearButton;
    }


    @Override
    public ArrayList<JTextField> getAllTextFields() {
        ArrayList<JTextField> allTextFields =  new ArrayList<>();
        allTextFields.add(roomNumberTextfield);
        return allTextFields;
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Matthew Johnson
    private JLabel roomNumberLabel;
    private JLabel roomTypeLabel;
    private JTextField roomNumberTextfield;
    private JComboBox<String> roomTypeCombobox;
    private JButton saveButton;
    private JButton clearButton;
    private JButton closeButton;
    private JLabel statusLabel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
