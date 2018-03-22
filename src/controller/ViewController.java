package controller;

import model.DataModel;
import view.AbstractBaseClasses.FormView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/*
 * This is an abstract base class used to encapsulate the related methods across the various View Controllers
 * */
public abstract class ViewController implements ActionListener {

    private FormView view;
    private DataModel dataModel;

    ViewController() {
        createView();
    }

     ViewController (DataModel dataModel) {
        this.dataModel = dataModel;
        createView();
        updateUI();
    }


    public abstract void actionPerformed(ActionEvent event);

    protected abstract void createView();

    protected abstract void updateUI();

    public FormView getView() {
        return view;
    }

    protected void setView(FormView view) {
        this.view = view;
    }

    public DataModel getDataModel() {
        return dataModel;
    }

}
