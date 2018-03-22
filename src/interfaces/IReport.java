package interfaces;

/*
 * Interface used for classes that are reportable. Classes that adopt this interface will be able to be used by the
 * ReportViewController to have a report generated on screen.
 */


public interface IReport {
    /*
    Array of Stirngs that denote each reported category (in the order to appear from the left most column fist
    to the right most column last
    */

    String[] getReportCategoryData();
    String[] getReportCategories();
}
