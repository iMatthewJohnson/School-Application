package baseclasses;
import interfaces.IClassroom;
import interfaces.IReport;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matt
 */

public class Classroom implements IClassroom, IReport {
    private String roomNumber;
    private String typeOfRoom;
    private static final String[] REPORT_CATEGORIES = {"Room Number", "Room Type"};

    public Classroom() {
        this.roomNumber="000";
        this.typeOfRoom="CLASSROOM";
    }
    

    Classroom(String roomNumber, String typeOfRoom) {
        this.roomNumber = roomNumber;
        this.typeOfRoom = typeOfRoom;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {

        this.roomNumber = roomNumber;
    }

    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public void setTypeOfRoom(String typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    @Override
    public String toString() {
        return "Classroom{" + "roomNumber=" + roomNumber + ", typeOfRoom=" + typeOfRoom + '}';
    }


    public String[] getReportCategoryData() {
         String[] reportCatagoriesData = {this.roomNumber, this.typeOfRoom};
         return reportCatagoriesData;
    }

    public String[] getReportCategories() {
        return REPORT_CATEGORIES;
    }
}
