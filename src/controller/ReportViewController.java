package controller;

import interfaces.IReport;
import model.DataModel;
import view.ReportView.ReportFormView;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Vector;

public abstract class ReportViewController extends ViewController {
    

    protected ReportViewController(DataModel dataModel) {
        super(dataModel);
    }

    @Override
    protected void updateUI() {
        ArrayList<IReport> reportArrayList = this.getDataModel().getListOfElements();
        if (!reportArrayList.isEmpty()) {
            populateTextArea(reportArrayList);
            populateTable(reportArrayList);
        }
    }


    protected void populateTextArea(ArrayList<IReport> reportArrayList) {
        ReportFormView reportFormView = (ReportFormView) this.getView();
        // Initialize the string which will hold the data for the text area
        // Start with labels
        String[] reportCategories = reportArrayList.get(0).getReportCategories();
        String allDataAsText = String.join("\t",reportCategories);
        allDataAsText += "\n";

        // Loop through the list and add the classrooms to the text area,
        // Each time adding a cr/lf between items for readibility.
        for (IReport reportableItem : reportArrayList ) {
            for (String reportableData : reportableItem.getReportCategoryData()) {
                allDataAsText += reportableData + "\t";
            }
            allDataAsText += "\n";
        }
        // Once all the data is in the string, set the text of the text area to the string value
        JTextArea textArea =  reportFormView.getTextArea();
        textArea.setText(allDataAsText);

    }

     //Private method that will add all classrooms to the table

    protected void populateTable(ArrayList<IReport> reportArrayList) {

        // A table model like this will hold the data for the JTable (this is the M in MVC)
        DefaultTableModel defaultTableModel = new DefaultTableModel();

        // add columns to table model
        for (String category : this.getDataModel().getListOfElements().get(0).getReportCategories()) {
            defaultTableModel.addColumn(category);
        }

        // Link the data model to the table
        ReportFormView reportFormView = (ReportFormView) this.getView();
        JTable table = reportFormView.getTable();
        table.setModel(defaultTableModel);

        // Add the classrooms in the ArrayList to the table model
        for (IReport reportableItem : this.getDataModel().getListOfElements()) {

            // Create a vector that is one row in the table
            Vector anElementForTable = new Vector();

            for (String reportableData : reportableItem.getReportCategoryData()) {
                anElementForTable.add(reportableData);
            }


            // Add the vector to the  data model that is connected to the JTable
            defaultTableModel.addRow(anElementForTable);

            table.setModel(defaultTableModel);
        }
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        //  Figure out which button was clicked
        String buttonClicked = event.getActionCommand();

        if (buttonClicked.equals("Close")) {
            this.getView().dispose();
        }
    }
}
