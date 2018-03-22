package interfaces;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matt
 */
public interface IClassroom {
    
    String getRoomNumber();
    void setRoomNumber(String roomNumber);
    
    String getTypeOfRoom();
    void setTypeOfRoom(String roomType);

    @Override
    String toString();
   
}

