package controller.InputViewControllers.PersonInputViewControllers;

import baseclasses.Person;
import controller.InputViewControllers.InputViewController;
import interfaces.IReport;
import model.DataModel;
import view.InputFormViews.PersonInputFormView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

public abstract class PersonInputViewController extends InputViewController implements FocusListener {
    private Map<String, String> personFields = new HashMap<String, String>();
    private Person person;
    private boolean isNewPerson = true;

    PersonInputViewController(DataModel dataModel) {
        super(dataModel);
    }

    private void savePersonalInfo() {
        if (isNewPerson) {
            person = (Person) getNewDataModelObject();
            isNewPerson = false;
        }
        PersonInputFormView personInputView = (PersonInputFormView) getView();
        for (JTextField aTextField : personInputView.getAllTextFields()) {
            personFields.put(aTextField.getName(), aTextField.getText());
        }
        person.setFirstName(personFields.get(Person.PersonalInfoFields.FIRST_NAME.name()));
        person.setLastName(personFields.get(Person.PersonalInfoFields.LAST_NAME.name()));
        person.setAddress1(personFields.get(Person.PersonalInfoFields.ADDRESS1.name()));
        //If address 2 is the placeholder text, treat it as blank
        if (personFields.get(Person.PersonalInfoFields.ADDRESS2.name()).equals("Address2")) {
            person.setAddress2("");
        } else {
            person.setAddress2(personFields.get(Person.PersonalInfoFields.ADDRESS2.name()));
        }
        person.setCity(personFields.get(Person.PersonalInfoFields.CITY.name()));
        person.setState(personFields.get(Person.PersonalInfoFields.STATE.name()));
        person.setZipCode(personFields.get(Person.PersonalInfoFields.ZIP_CODE.name()));
        person.setSsn1(personFields.get(Person.PersonalInfoFields.SSN1.name()));
        person.setSsn2(personFields.get(Person.PersonalInfoFields.SSN2.name()));
        person.setSsn3(personFields.get(Person.PersonalInfoFields.SSN3.name()));

        //Convert Date of Birth Text Field to a Gregorgian Calendar
        String dateOfBirthAsString = personFields.get(Person.PersonalInfoFields.DATE_OF_BIRTH.name());
        //If text field isn't the placeholder text, Set date of birth.
        if (!dateOfBirthAsString.equals("MM/DD/YYYY")) {
            person.setDateOfBirth(converDateAsTextToGregorgianCalendar(dateOfBirthAsString));
        }
        ArrayList<IReport> dataModelEntries = getDataModel().getListOfElements();
        IReport lastEntryInModel = dataModelEntries.size() > 0 ? dataModelEntries.get(dataModelEntries.size() - 1) : null;
        if (lastEntryInModel != person) {
            getDataModel().getListOfElements().add((IReport) person);
        }

    }

    @Override
    protected void saveForm() {
        savePersonalInfo();
    }

    protected Person getPerson() {
        return person;
    }

    protected Map<String, String> getPersonFields() {
        return personFields;
    }

    protected GregorianCalendar converDateAsTextToGregorgianCalendar(String dateAsString) {
        int month = Integer.valueOf(dateAsString.substring(0, 2)) - 1;
        int day = Integer.valueOf(dateAsString.substring(3, 5));
        int year = Integer.valueOf(dateAsString.substring(6, 10));
        GregorianCalendar dateAsGregorgianCalendar = new GregorianCalendar();
        dateAsGregorgianCalendar.set(year, month, day);
        return dateAsGregorgianCalendar;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);
    }

    @Override
    protected void closeWindow() {
        super.closeWindow();
        isNewPerson = true;
    }

    @Override
    protected void resetForm() {
        PersonInputFormView inputViewForm = (PersonInputFormView) getView();
        for (JTextField aTextField : inputViewForm.getAllTextFields()) {
            resetField(aTextField);
        }
    }

    protected void resetField(JTextField textField) {
        textField.setText(textField.getToolTipText());
        textField.setForeground(Color.gray);
    }


    public void setVewTabFocus(int tabFocus) {
        PersonInputFormView personInputFormView = (PersonInputFormView) getView();
        personInputFormView.setVisible(true);
        personInputFormView.setActivePanel(tabFocus);
    }

    @Override
    public void focusGained(FocusEvent event) {
        if (event.getSource() instanceof JTextField) {
            JTextField textField = (JTextField) event.getSource();
            if (textField.getText().equals(textField.getToolTipText())) {
                textField.setText("");
                textField.setForeground(Color.black);
            }
        }
    }

    @Override
    public void focusLost(FocusEvent event) {
        if (event.getSource() instanceof JTextField) {
            JTextField textField = (JTextField) event.getSource();
            if (textField.getText().equals("")) {
                resetField(textField);
            }
        }
    }
}
