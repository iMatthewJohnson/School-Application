package view.InputFormViews;

import controller.InputViewControllers.InputViewController;
import view.FormView;

import javax.swing.*;
import java.util.ArrayList;

public abstract class InputFormView extends FormView {
    public  InputFormView(InputViewController viewController) {
        super(viewController);
    }

    @Override
    protected void initAdditional() {
        getSaveButton().addActionListener(viewController);
        getClearButton().addActionListener(viewController);
        for (JTextField aTextField : getAllTextFields()){
            aTextField.addFocusListener((InputViewController) viewController);
        }
    }


    //All InputFormViews must have save and clear buttons
    protected abstract JButton getSaveButton();
    protected abstract JButton getClearButton();
    public abstract JLabel getStatusLabel();
    public abstract ArrayList<JTextField> getAllTextFields();

}


