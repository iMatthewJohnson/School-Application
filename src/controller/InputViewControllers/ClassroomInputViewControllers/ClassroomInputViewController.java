package controller.InputViewControllers.ClassroomInputViewControllers;

import baseclasses.Classroom;
import controller.InputViewControllers.InputViewController;
import interfaces.IFormData;
import model.DataModel;
import view.InputFormViews.ClassroomInputFormView;

import javax.swing.*;

public class ClassroomInputViewController extends InputViewController {

    private ClassroomInputFormView classroomInputFormView;

    public ClassroomInputViewController(DataModel dataModel) {
        super(dataModel);
        classroomInputFormView = (ClassroomInputFormView) super.getView();
    }


    @Override
    protected void createView() {
        this.setView(new ClassroomInputFormView(this));
    }

    @Override
    protected void updateUI() {
        super.updateUI();
    }

    @Override
    protected void saveForm() {
        //Check if view fields are valid
        if (hasValidFormFields()) {

            // Create a new classroom object
            Classroom aClassroom = new Classroom();

            // Retrieve the values from the view
            String room = classroomInputFormView.getRoomNumberTextfield().getText();
            String roomType = this.getFormComboBoxSelectionAsString();

            //Use the Classroom setters to set the values
            aClassroom.setRoomNumber(room);
            aClassroom.setTypeOfRoom(roomType);

            // Add to the new classroom to the list in ClassroomDataModel
            this.getDataModel().getListOfElements().add(aClassroom);

            //Reset Input view after save
            this.resetForm();

            //Confirmation message
            classroomInputFormView.getCommunicationLabel().setText("Room saved: " +
                    aClassroom.getRoomNumber() +
                    " (" +
                    aClassroom.getTypeOfRoom() +
                    ")");
        } else {
            classroomInputFormView.getCommunicationLabel().setText(
                    "Invalid room number and/or room type.");
        }
    }

    @Override
    protected IFormData getNewDataModelObject() {
        return new Classroom();
    }


    protected void resetForm() {
        classroomInputFormView.getRoomNumberTextfield().setText("");
        classroomInputFormView.getRoomTypeCombobox().setSelectedIndex(0);
        this.resetCommunicationLabel();
    }

    private void resetCommunicationLabel() {
        classroomInputFormView.getCommunicationLabel().setText(" ");
    }


    private boolean hasValidFormFields() {
        String roomNumberText = classroomInputFormView.getRoomNumberTextfield().getText();
        String typeOfRoomText = this.getFormComboBoxSelectionAsString();
        //Room number not blank and type of room is not "--"
        return !roomNumberText.isEmpty() && !typeOfRoomText.equals("--");
    }

    private String getFormComboBoxSelectionAsString() {
        // The value must come from the drop down list of room types
        // Step 1 - Retrieve the data model associated with the combo list box
        ComboBoxModel datamodel = classroomInputFormView.getRoomTypeCombobox().getModel();
        // Step 2 - Retrieve the selected item from the data model
        Object selectedItem = datamodel.getSelectedItem();
        // Step 3 - Convert (Cast) the selected item to a string
        return (String) selectedItem;
    }


}
