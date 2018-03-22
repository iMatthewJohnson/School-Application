package view;

import controller.ViewController;

import javax.swing.*;

/*
This is an abstract base class used to encapsulate the related methods across the various Form Views.
 */

public abstract class FormView extends JFrame {

    protected ViewController viewController;

    public FormView(ViewController controller) {
        initComponents();
        viewController = controller;
        initAdditional();
        setVisible(true);
    }

    //Abstract method added to allow sub classes to initialize additional attributes
    protected abstract void initAdditional();

    //Abstract method. Subclasses will need to complete as part of creating the view.
    protected abstract void initComponents();
}
