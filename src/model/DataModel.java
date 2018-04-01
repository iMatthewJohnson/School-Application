package model;


import interfaces.IFormData;

import java.io.Serializable;
import java.util.ArrayList;

/*
 * This is an abstract base class used to encapsulate the related methods across the various Data Models
 * */
public class DataModel implements Serializable {
    protected ArrayList<IFormData> listOfElements = new ArrayList<>();

    public ArrayList<IFormData> getListOfElements() {
        return this.listOfElements;
    }
    public void setListOfElements(ArrayList<IFormData> listOfElements) {this.listOfElements = listOfElements;}

}
