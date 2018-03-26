package view.ReportViews;

import controller.ViewController;
import view.FormView;

import javax.swing.*;

public abstract class ReportFormView extends FormView {

    public ReportFormView(ViewController controller) {

        super(controller);
    }

    @Override
    protected void initAdditional() {
        getCloseButton().addActionListener(viewController);
    }

    public abstract JTable getTable();
    public abstract JTextArea getTextArea();

}
