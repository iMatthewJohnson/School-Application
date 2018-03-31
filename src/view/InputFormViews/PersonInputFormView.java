package view.InputFormViews;

import controller.InputViewControllers.PersonInputViewControllers.PersonInputViewController;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public abstract class PersonInputFormView extends InputFormView {
    public PersonInputFormView(PersonInputViewController viewController) {
        super(viewController);
    }

    public void setActivePanel(int index) {
        getTabbedPane().setSelectedIndex(index);
    }

    public ArrayList<JTextField> getTextFieldsOfCurrentPane () {
        ArrayList<JTextField> allTextFields = new ArrayList<>();
        JPanel selectedTab = (JPanel) getTabbedPane().getSelectedComponent();
        for (Component component : selectedTab.getComponents()) {
            if (component instanceof JTextField) {
                allTextFields.add((JTextField) component);
            }
        }
        return allTextFields;
    }

    //Returns a list of ALL text fields (across all panels in the tabbed pane)
    public ArrayList<JTextField> getAllTextFields() {
        ArrayList<JTextField> allTextFields = new ArrayList<>();
        for (Component tabbedPaneComponent : getTabbedPane().getComponents()) {
            if (tabbedPaneComponent instanceof JPanel) {
                for (Component panelCompontnet : ((JPanel) tabbedPaneComponent).getComponents()) {
                    if (panelCompontnet instanceof JTextField) {
                        allTextFields.add((JTextField) panelCompontnet);
                    }
                }
            }
        }
        return allTextFields;
    }
    protected abstract JTabbedPane getTabbedPane();
    public abstract JLabel getStatusLabel();
}
