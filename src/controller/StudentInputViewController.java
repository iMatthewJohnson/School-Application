package controller;

import model.DataModel;
import view.TabViews.StudentInputView;

import java.awt.event.ActionEvent;

public class StudentInputViewController extends InputViewController  {

    StudentInputViewController(DataModel datamodel){
        super(datamodel);
        updateUI();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);
    }

    @Override
    protected void createView() {
        this.setView(new StudentInputView(this));
    }

    @Override
    protected void updateUI() {

    }
}
