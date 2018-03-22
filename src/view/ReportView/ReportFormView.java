package view.ReportView;

import controller.ViewController;
import view.FormView;

import javax.swing.*;

public abstract class ReportFormView extends FormView {

    public ReportFormView(ViewController controller) {

        super(controller);
    }


    public abstract JTable getTable();
    public abstract JTextArea getTextArea();

}
