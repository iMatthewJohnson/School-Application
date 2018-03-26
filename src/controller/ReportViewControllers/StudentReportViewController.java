package controller.ReportViewControllers;

import model.DataModel;
import view.ReportViews.StudentReportView;

public class StudentReportViewController extends ReportViewController {

    public StudentReportViewController(DataModel dataModel) {
        super(dataModel);
        updateUI();
    }


    @Override
    protected void createView() {
        this.setView(new StudentReportView(this));
    }

}
