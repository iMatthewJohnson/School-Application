package utilities;

import interfaces.IFormData;
import model.DataModel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FormDataIO {

    private static final String FILE_EXTENSION = ".ser";

    private FormDataIO() {
        //Blank constructor
        //Static class
    }

    /**
     * Creates a serialized object output file containing all classrooms in the
     * classroom data model
     */
    public static void writeSerializedFile(DataModel dataModel, String fileName) {
        try {
            // Create output file
            ObjectOutputStream serializedFile = new ObjectOutputStream(
                    new FileOutputStream(fileName + FILE_EXTENSION));
            // Write out the data
            serializedFile.writeObject(dataModel.getListOfElements());
        } catch (Exception exp) {
            exp.printStackTrace();
        }
    }

    /**
     * Reads a set of classroom objects from a serialized file and returns an
     * array list of classrooms
     */
    public static ArrayList<IFormData> readSerializedFile(String fileName) {

        ArrayList<IFormData> listOfElements = new ArrayList<>();

        try {
            ObjectInputStream serializedFile = new ObjectInputStream(
                    new FileInputStream(fileName + FILE_EXTENSION));
            // Read the serialized object and cast to its original type
            listOfElements = (ArrayList<IFormData>) serializedFile.readObject();
        } catch (Exception exp) {
            exp.printStackTrace();
        } finally {
            return listOfElements;
        }
    }

}
