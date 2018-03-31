package controller.InputViewControllers;

import controller.ViewController;
import interfaces.IFormData;
import model.DataModel;
import view.InputFormViews.InputFormView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public abstract class InputViewController extends ViewController implements FocusListener {

    //<editor-fold desc="===INSTANCE VARIABLES===">
    protected boolean hasError = false;
    private boolean isSaveButtonPressed = false;
    private boolean isClearButtonPressed = false;
    //</editor-fold>

    protected InputViewController(DataModel dataModel) {
        super(dataModel);
    }


    //<editor-fold desc="===NEW ABSTRACT METHOD DEFINITIONS===">
    protected abstract void saveForm();
    protected abstract IFormData getNewDataModelObject();
    //</editor-fold>


    //====ACTION LISTENER METHODS====
    @Override
    public void actionPerformed(java.awt.event.ActionEvent event) {
        super.actionPerformed(event);
        // Figure out which button was clicked
        String buttonClicked = event.getActionCommand();
        isSaveButtonPressed = buttonClicked.equals("Save");
        isClearButtonPressed = buttonClicked.equals("Clear");
        updateUI();
    }

    //====OVERWRITTEN METHODS FROM SUPER CLASS
    @Override
    protected void updateUI() {
        super.updateUI();
        if (!hasError) { ((InputFormView) getView()).getStatusLabel().setText(""); }
        ((InputFormView) getView()).getStatusLabel().setForeground(hasError ? Color.red : Color.black);
        if (isSaveButtonPressed) {
            isSaveButtonPressed = false;
            saveForm();
        } else if (isClearButtonPressed) {
            isClearButtonPressed = false;
            resetForm();
        }
    }

    @Override
    protected void closeWindow() {
        super.closeWindow();
        resetForm();
    }


    //<editor-fold desc"===FOCUS LISTENER METHODS==="
    @Override
    public void focusGained(FocusEvent event) {
        //If user starts editing fields, dismiss error message
        if (hasError) {
            hasError = false;
            updateUI();
        }
        if (event.getSource() instanceof JTextField) {
            JTextField textField = (JTextField) event.getSource();
            textField.setForeground(Color.black);
            if (textField.getText().equals(textField.getToolTipText())) {
                textField.setText("");
            }
        }
    }

    @Override
    public void focusLost(FocusEvent event) {
        if (event.getSource() instanceof JTextField) {
            JTextField textField = (JTextField) event.getSource();
            if (textField.getText().equals("")) {
                resetField(textField);
            }
        }
    }
    //</editor-fold>


    protected void resetForm() {
        InputFormView inputViewForm = (InputFormView) getView();
        for (JTextField aTextField : inputViewForm.getAllTextFields()) {
            resetField(aTextField);
        }
        hasError = false;
        updateUI();
    }

    protected void resetField(JTextField textField) {
        textField.setText(textField.getToolTipText());
        textField.setForeground(Color.gray);
    }

    /*
     Private method that checks if the textfield still has placeholder text.
     If it does, it treats like it's blank by assigning an empty string
     */
    protected String setTextFromField(JTextField textField) {
        return textField.getText().equals(textField.getToolTipText()) ? "" : textField.getText();
    }

    //Private method that makes a textfield with an error turn red and display an error message in the status label.
    protected void displayErrorOnField(JTextField fieldWithError, String errorMessage) {
        //Set text to color red
        fieldWithError.setForeground(Color.red);
        InputFormView inputFormView = (InputFormView) getView();
        //Check if an error has already occured or if this is the first one.
        //If error: add the new message to the one already there.
        //If new error: create a new error message and mark hasError as true.
        if (hasError) {
            String currentErrorMessage = inputFormView.getStatusLabel().getText();
            inputFormView.getStatusLabel().setText(currentErrorMessage + ", " + errorMessage);
        } else {
            inputFormView.getStatusLabel().setText("ERROR: " + errorMessage);
            hasError = true;
        }
        //Make the tool tip text the same as the text
        //This allows all of the text that is out of bounds of the status label to be shown with the tool tip.
        inputFormView.getStatusLabel().setToolTipText(inputFormView.getStatusLabel().getText());
        updateUI();
    }

}
