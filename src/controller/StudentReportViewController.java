package controller;

import model.DataModel;
import view.ReportView.StudentReportView;

public class StudentReportViewController extends ReportViewController {

    protected StudentReportViewController(DataModel dataModel) {
        super(dataModel);
        updateUI();
    }


    @Override
    protected void createView() {
        this.setView(new StudentReportView(this));
    }

}
