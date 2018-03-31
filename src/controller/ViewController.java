package controller;

import model.DataModel;
import view.FormView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/*
 * This is an abstract base class used to encapsulate the related methods across the various View Controllers
 * */
public abstract class ViewController implements ActionListener {

    private FormView view;
    private DataModel dataModel;
    private boolean isCloseButtonPressed = false;

    public ViewController() {
        super();
        createView();
    }

    public ViewController(DataModel dataModel) {
        this();
        this.dataModel = dataModel;
        updateUI();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String buttonClicked = event.getActionCommand();
        isCloseButtonPressed = buttonClicked.equals("Close");
        updateUI();
    }

    protected abstract void createView();

    protected void updateUI() {
        if (isCloseButtonPressed) {
            isCloseButtonPressed = false;
            closeWindow();
        }
    }

    protected FormView getView() {
        return view;
    }

    protected void setView(FormView view) {
        this.view = view;
    }

    protected DataModel getDataModel() {
        return dataModel;
    }

    protected void closeWindow() {
        getView().dispose();
    }

}
