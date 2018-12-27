import java.util.ArrayList;
/*
  reservations class, stores the name and room number in the Hotel
*/

public class Reservation{
    //instance variables
    private String name;
    private int roomNumber;

    //constructors, must supply the name, and optionally a room
    public Reservation(String name){
    	this.name = name;

    }
    public Reservation(String name, int roomNumber){
    	this.name = name;
    	this.roomNumber = roomNumber;

    }

    // public getdetails(int roomNum) {

    // }

    //mutators, set the room number or name
    public void setRoom(int newroomNumber){
    	this.roomNumber = newroomNumber;
    }

    public void setPerson(String newperson){
    	this.name = newperson;
    }

    //accessors, return the room number or name
    public int getRoomNumber(){
    	return roomNumber;
    }


}


