package controller.ReportViewControllers;

import controller.ViewController;
import interfaces.IReport;
import model.DataModel;
import view.ReportViews.ReportFormView;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Vector;

public abstract class ReportViewController extends ViewController {


    protected ReportViewController(DataModel dataModel) {
        super(dataModel);
    }

    @Override
    protected void updateUI() {
        super.updateUI();
        ArrayList<IReport> reportArrayList = getDataModel().getListOfElements();
        if (!reportArrayList.isEmpty()) {
            populateTextArea(reportArrayList);
            populateTable(reportArrayList);
        }
    }


    protected void populateTextArea(ArrayList<IReport> reportArrayList) {
        ReportFormView reportFormView = (ReportFormView) getView();
        //Retrieve the report categories from IReport compatible object
        String[] reportCategories = reportArrayList.get(0).getReportCategories();
        String allDataAsText = String.join("\t", reportCategories);
        allDataAsText += "\n";

        // Loop through the list and add the classrooms to the text area,
        // Each time adding a cr/lf between items for readibility.
        for (IReport reportableItem : reportArrayList) {
            for (String reportableData : reportableItem.getReportCategoryData()) {
                allDataAsText += reportableData + "\t";
            }
            allDataAsText += "\n";
        }
        // Once all the data is in the string, set the text of the text area to the string value
        JTextArea textArea = reportFormView.getTextArea();
        textArea.setText(allDataAsText);

    }

    //Private method that will add all classrooms to the table

    protected void populateTable(ArrayList<IReport> reportArrayList) {

        // A table model like this will hold the data for the JTable (this is the M in MVC)
        DefaultTableModel defaultTableModel = new DefaultTableModel();

        // add columns to table model
        for (String category : getDataModel().getListOfElements().get(0).getReportCategories()) {
            defaultTableModel.addColumn(category);
        }

        // Link the data model to the table
        ReportFormView reportFormView = (ReportFormView) getView();
        JTable table = reportFormView.getTable();
        table.setModel(defaultTableModel);

        // Add the classrooms in the ArrayList to the table model
        for (IReport reportableItem : getDataModel().getListOfElements()) {

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

}
