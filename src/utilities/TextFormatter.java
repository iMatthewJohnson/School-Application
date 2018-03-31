package utilities;

import ExceptionClasses.InvalidDataException;

import java.util.GregorianCalendar;

/**
 * <h1>Text Formatter</h1>
 * Utility class that has utility methods for formatting Strings to other formats
 *
 * @author Matt Johnson
 */
public final class TextFormatter {

    //If the date as a string is passed in in the format of MM/DD/YYYY, this will convert it to a Gregorian Calendar
    public static GregorianCalendar converDateAsTextToGregorgianCalendar(String dateAsString) throws InvalidDataException {

        int month = 0;
        int day = 0;
        int year = 0;
        try {
            month = Integer.valueOf(dateAsString.substring(0, 2)) - 1; //month starts at 0 instead of 1, so subtract 1.
            day = Integer.valueOf(dateAsString.substring(3, 5));
            year = Integer.valueOf(dateAsString.substring(6, 10));
        } catch (Exception e) {
            throw new InvalidDataException("Date not in correct format (MM/DD/YYYY, e.g. 01/01/1970)");
        }
        GregorianCalendar dateAsGregorgianCalendar = new GregorianCalendar();
        dateAsGregorgianCalendar.set(year, month, day);
        return dateAsGregorgianCalendar;
    }
}
