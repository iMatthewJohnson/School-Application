package view;

import controller.ViewController;

import javax.swing.*;

/*
This is an abstract base class used to encapsulate the related methods across the various Form Views.
 */

public abstract class FormView extends JFrame {

    protected ViewController viewController;

    public FormView(ViewController controller) {
        viewController = controller;
        initComponents();
        initAdditional();
        getCloseButton().addActionListener(viewController);
        setVisible(true);
    }

    //Abstract method added to allow sub classes to initialize additional attributes
    protected abstract void initAdditional();

    //Form Designer impliments this method to create view
    protected abstract void initComponents();

    //All forms need a close button
    protected abstract JButton getCloseButton();
}
