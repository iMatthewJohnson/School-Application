package controller.InputViewControllers.PersonInputViewControllers;

import ExceptionClasses.InvalidDataException;
import ExceptionClasses.NoDataException;
import baseclasses.Person;
import controller.InputViewControllers.InputViewController;
import interfaces.IFormData;
import model.DataModel;
import utilities.TextFormatter;
import view.InputFormViews.InputFormView;
import view.InputFormViews.PersonInputFormView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import static baseclasses.Person.PersonalInfoFields.*;

public abstract class PersonInputViewController extends InputViewController {
    protected Map<String, JTextField> personFields = new HashMap<>();
    private Person person;
    private boolean isNewPerson = true;


    PersonInputViewController(DataModel dataModel) {
        super(dataModel);
    }

    //Abstract method used so subclasses can save additional fields to their data model.
    protected abstract void saveAdditionalInfo();

    private void savePersonalInfo() {
        //Get all text fields
        PersonInputFormView personInputView = (PersonInputFormView) getView();
        for (JTextField aTextField : personInputView.getAllTextFields()) {
            personFields.put(aTextField.getName(), aTextField);
        }
        //Set the properties
        setPersonProperty("setFirstName", personFields.get(FIRST_NAME.name()));
        setPersonProperty("setLastName", personFields.get(LAST_NAME.name()));
        setPersonProperty("setAddress1",personFields.get(ADDRESS1.name()));
        setPersonProperty("setAddress2",personFields.get(ADDRESS2.name()));
        setPersonProperty("setCity", personFields.get(CITY.name()));
        setPersonProperty("setState", personFields.get(STATE.name()));
        setPersonProperty("setZipCode", personFields.get(ZIP_CODE.name()));
        setPersonProperty("setSsn1", personFields.get(SSN1.name()));
        setPersonProperty("setSsn2", personFields.get(SSN2.name()));
        setPersonProperty("setSsn3", personFields.get(SSN3.name()));
        setPersonProperty("setDateOfBirth", personFields.get(DATE_OF_BIRTH.name()));
    }

    @Override
    protected void saveForm() {
        checkIfNewPerson();
        savePersonalInfo();
        saveAdditionalInfo();
        savePersonToDataModel();
    }

    protected Person getPerson() {
        return person;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);
        if (event.getActionCommand().equals("New Person")) {
            isNewPerson = true;
            resetForm();
        }
    }

    @Override
    protected void closeWindow() {
        super.closeWindow();
        isNewPerson = true;
    }

    public void setVewTabFocus(int tabFocus) {
        PersonInputFormView personInputFormView = (PersonInputFormView) getView();
        personInputFormView.setVisible(true);
        personInputFormView.setActivePanel(tabFocus);
    }

    //Private method that will attempt to set a property of this.person with the text of the textField passed in.
    //This method takes the full name of the setter method for the property it should set.
    //This class uses Reflection to try and run the appropriate setter.
    private void setPersonProperty(String nameOfSetter, JTextField textField) {
        Method setterMethod;

        try {
            if (textField.getName().equals(DATE_OF_BIRTH.name())) {
                setterMethod = Person.class.getMethod(nameOfSetter, GregorianCalendar.class);
                String dateOfBirthAsString = setTextFromField(textField);
                setterMethod.invoke(person, dateOfBirthAsString.isEmpty() ? null : TextFormatter.converDateAsTextToGregorgianCalendar(dateOfBirthAsString));
            } else {
                setterMethod = Person.class.getMethod(nameOfSetter, String.class);
                setterMethod.invoke(person,setTextFromField(textField));
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            Exception targetException = (Exception) e.getTargetException();
            if (targetException instanceof InvalidDataException || targetException instanceof NoDataException) {
                displayErrorOnField(textField, targetException.getMessage());
            }
        } catch (InvalidDataException e) {
            displayErrorOnField(textField, e.getMessage());
        }
    }

    private void checkIfNewPerson() {
        //Check to see if this is a new person (first time saving data since window has been open)
        if (isNewPerson) {
            person = (Person) getNewDataModelObject();
            isNewPerson = false;
        }
    }

    private void savePersonToDataModel() {
        //Check if there are any errors. If there is, do not save
        if (!hasError) {
            //If this is a NEW person, then save it in Data Model
            //If this is the same person (the screen did not close) then do not create new entry in Data Model
            ArrayList<IFormData> dataModelEntries = getDataModel().getListOfElements();
            IFormData lastEntryInModel = dataModelEntries.size() > 0 ? dataModelEntries.get(dataModelEntries.size() - 1) : null;
            if (lastEntryInModel != getPerson()) {
                getDataModel().getListOfElements().add(getPerson());
                ((InputFormView) getView()).getStatusLabel().setText("New person saved");
            } else {
                ((InputFormView) getView()).getStatusLabel().setText("Person's info updated");
            }
        }
    }
}
