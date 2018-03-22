package controller;

import model.DataModel;
import view.ReportView.FacultyReportView;

public class FacultyReportViewController extends ReportViewController {

    protected FacultyReportViewController(DataModel dataModel) {
        super(dataModel);
        updateUI();
    }


    @Override
    protected void createView() {
        this.setView(new FacultyReportView(this));
    }

}