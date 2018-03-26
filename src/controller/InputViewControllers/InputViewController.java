package controller.InputViewControllers;

import controller.ViewController;
import interfaces.IFormData;
import model.DataModel;

public abstract class InputViewController extends ViewController {
    private boolean isSaveButtonPressed = false;
    private boolean isClearButtonPressed = false;

    protected InputViewController(DataModel dataModel) {
        super(dataModel);
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent event) {
        super.actionPerformed(event);
        // Figure out which button was clicked
        String buttonClicked = event.getActionCommand();
        isSaveButtonPressed = buttonClicked.equals("Save");
        isClearButtonPressed = buttonClicked.equals("Clear");
        updateUI();
    }

    @Override
    protected void updateUI() {
        super.updateUI();
        if (isSaveButtonPressed) {
            isSaveButtonPressed = false;
            saveForm();
        } else if (isClearButtonPressed) {
            isClearButtonPressed = false;
            resetForm();
        }
    }

    // Abstract Methods
    protected abstract void saveForm();

    protected abstract IFormData getNewDataModelObject();

    protected abstract void resetForm();


    @Override
    protected void closeWindow() {
        super.closeWindow();
        resetForm();
    }
}
