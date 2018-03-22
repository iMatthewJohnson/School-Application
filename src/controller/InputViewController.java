package controller;

import model.DataModel;
import view.TabViews.InputFormView;
import view.TabViews.StudentInputView;

import javax.swing.*;
import javax.swing.text.View;

public abstract class InputViewController extends ViewController {
    private InputFormView inputFormView;
    protected InputViewController(DataModel dataModel) {
        super(dataModel);
        inputFormView = (InputFormView) super.getView();
    }

    public void actionPerformed(java.awt.event.ActionEvent event) {

        // Figure out which button was clicked
        String buttonClicked = event.getActionCommand();

        /*if (buttonClicked.equals("Save")) {

            //Check if view fields are valid
            if (this.hasValidFormFields()) {

                // Create a new classroom object
                Classroom aClassroom = new Classroom();

                // Retrieve the values from the view
                String room = inputFormView.getRoomNumberTextfield().getText();
                String roomType = this.getFormComboBoxSelectionAsString();

                //Use the Classroom setters to set the values
                aClassroom.setRoomNumber(room);
                aClassroom.setTypeOfRoom(roomType);

                // Add to the new classroom to the list in ClassroomDataModel
                this.getDataModel().getListOfElements().add(aClassroom);

                //Reset Input view after save
                this.resetForm();

                //Confirmation message
                inputFormView.getCommunicationLabel().setText("Room saved: " +
                        aClassroom.getRoomNumber() +
                        " (" +
                        aClassroom.getTypeOfRoom() +
                        ")");
            } else {
                inputFormView.getCommunicationLabel().setText(
                        "Invalid room number and/or room type.");
            }*/
       if (buttonClicked.equals("Clear")) {
            // Reset the fields
            this.resetForm();
        } else if (buttonClicked.equals("Close")) {
           this.inputFormView.dispose();
       }
    }

    private void resetForm() {
        for (JTextField aTextField : this.inputFormView.getAllTextFields()) {
            aTextField.setText("");
        }
    }

}
