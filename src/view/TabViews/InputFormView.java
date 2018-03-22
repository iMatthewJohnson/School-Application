package view.TabViews;

import controller.InputViewController;
import view.AbstractBaseClasses.FormView;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public abstract class InputFormView extends FormView {
    protected ArrayList<JTextField> allTextFields;

    InputFormView(InputViewController viewController) {
        super(viewController);
    }

    public ArrayList<JTextField> getAllTextFields() {
        // Lazy instantiation of allTextFields
        if (this.allTextFields == null) {
            this.allTextFields = new ArrayList<>();
            for (JPanel aPanel : this.getFormPanels()) {
                for (Component component : aPanel.getComponents()) {
                    if (component instanceof JTextField) {
                        this.allTextFields.add((JTextField) component);
                    }
                }
            }
        }
        return this.allTextFields;
    }

    //Subclasses need to provide their view panels so the getAllTextFields() method can work for each subclass
    protected abstract JPanel[] getFormPanels();
}


