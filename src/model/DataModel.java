package model;


import interfaces.IReport;
import java.util.ArrayList;

/*
 * This is an abstract base class used to encapsulate the related methods across the various Data Models
 * */
public class DataModel {
    protected ArrayList<IReport> listOfElements = new ArrayList<>();

    public ArrayList<IReport> getListOfElements() {
        return this.listOfElements;
    }

}
