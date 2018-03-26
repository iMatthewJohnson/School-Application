package controller.ReportViewControllers;

import model.DataModel;
import view.ReportViews.FacultyReportView;

public class FacultyReportViewController extends ReportViewController {

    public FacultyReportViewController(DataModel dataModel) {
        super(dataModel);
        updateUI();
    }


    @Override
    protected void createView() {
        this.setView(new FacultyReportView(this));
    }

}