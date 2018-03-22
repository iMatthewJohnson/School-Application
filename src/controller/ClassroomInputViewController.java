package controller;

import baseclasses.Classroom;

import model.DataModel;
import view.ClassroomInputFormView;


import javax.swing.*;

public class ClassroomInputViewController extends InputViewController {

    private ClassroomInputFormView inputFormView;
    ClassroomInputViewController(DataModel dataModel) {
        super(dataModel);
        inputFormView = (ClassroomInputFormView) super.getView();
    }

    public void actionPerformed(java.awt.event.ActionEvent event) {

        //  Figure out which button was clicked
        String buttonClicked = event.getActionCommand();

        if (buttonClicked.equals("Save")) {

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
            }
        } else if (buttonClicked.equals("Clear")) {
            // Reset the fields
            this.resetForm();
        } else if (buttonClicked.equals("Close")) {
            this.inputFormView.dispose();
        }
    }

    @Override
    protected void createView() {
        this.setView(new ClassroomInputFormView(this) );
    }

    @Override
    protected void updateUI() {

    }


    private void resetForm() {
        inputFormView.getRoomNumberTextfield().setText("");
        inputFormView.getRoomTypeCombobox().setSelectedIndex(0);
        this.resetCommunicationLabel();
    }

    private void resetCommunicationLabel() {
        inputFormView.getCommunicationLabel().setText(" ");
    }


    private boolean hasValidFormFields() {
        String roomNumberText = inputFormView.getRoomNumberTextfield().getText();
        String typeOfRoomText = this.getFormComboBoxSelectionAsString();
        //Room number not blank and type of room is not "--"
        return !roomNumberText.isEmpty() && !typeOfRoomText.equals("--");
    }

    private String getFormComboBoxSelectionAsString() {
        // The value must come from the drop down list of room types
        // Step 1 - Retrieve the data model associated with the combo list box
        ComboBoxModel datamodel = inputFormView.getRoomTypeCombobox().getModel();
        // Step 2 - Retrieve the selected item from the data model
        Object selectedItem = datamodel.getSelectedItem();
        // Step 3 - Convert (Cast) the selected item to a string
        return (String) selectedItem;
    }


}
