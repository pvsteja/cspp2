import java.util.*;

class Hotel {

	private boolean[] allotedRooms;
	private Reservation[] reservationArray;
	private int size;

	Hotel() {
		allotedRooms = new boolean[5];
		reservationArray = new Reservation[5];
		size = 0;
	}

	public int reserveRoom(String person) {
		if (size == reservationArray.length) {
			System.out.println("All Rooms are reserved");
			return -1;
		}
		int room = -1;
		reservationArray[size] = new Reservation(person);
		for (int i = 0; i < allotedRooms.length; i++) {
			if (allotedRooms[i] == false) {
				allotedRooms[i] = true;
				room = i + 1;
				reservationArray[size].setRoom(i + 1);
				break;
			}
		}
		size++;
		return room;
	}

	public boolean reserveRoom(String person, int roomNum) {
		if (size == reservationArray.length){
			System.out.println("All Rooms are reserved");
			return false;
		}
		if (allotedRooms[roomNum - 1] == true) {
			System.out.println("Room is already reserved");
			return false;
		}
		if (allotedRooms[roomNum - 1] == false) {
			reservationArray[size] = new Reservation(person, roomNum);
			size++;
			allotedRooms[roomNum - 1] = true;
			return true;
		}

		return false;
	}

	public void cancelReservations(String person) {
		for (Reservation r: reservationArray) {
			if (r != null) {
				if (r.getName() == person) {
					r = null;
					allotedRooms[r.getRoom() - 1] = false;
				}
			}
		}
	}

	public void printReservations() {
		for (Reservation r:reservationArray) {
			if (r != null) {
				System.out.println(r);
			}
		}
	}

	public boolean buildRooms(int num) {
		if (num < 0) {
			return false;
		}
		Reservation[] temp = new Reservation[size + num];
		boolean[] aRT = new boolean[size + num];
		for (int i = 0; i < size; i++) {
			temp[i] = reservationArray[i];
			aRT[i] = allotedRooms[i];
		}
		reservationArray = temp;
		allotedRooms = aRT;
		return true;
	}


}
/**
 * Class for main.
 */
public class Solution{

  public static void main(String[] args){
  		Hotel h = new Hotel();
		String name;
		int roomnum;
  		Scanner scan = new Scanner(System.in);
		int readLines = Integer.parseInt(scan.nextLine());
		int c=0;
		while (c<readLines) {
			String line = scan.nextLine();
			String tokens[]=line.split(" ");
				switch(tokens[0])
				{
					case "reserve":
									name = tokens[1];
									roomnum = -1;
								    //if we got a good name, try to reserve a room
								    if(!((name==null) || (name.equals(""))))
								        roomnum = h.reserveRoom(name);

								    //give feedback
								    if(roomnum!=-1)
								        System.out.println(name+" "+roomnum);

									break;

					case "reserveN":
									name = tokens[1];
									//if we got a bad input, report failure

								    if((name==null) || (name.equals("")))
								        roomnum = -1;
								    else{
								     roomnum = Integer.parseInt(tokens[2]);
								    }
								    //give feedback
								    if(h.reserveRoom(name, roomnum))
								        System.out.println(name+" "+roomnum);

								    break;

					case "print":
								//print all the reservations done in the hotel
								h.printReservations();
								 break;
					case "cancel":
								//cancel the rooms for that particular person
								name = tokens[1];
								if(!((name==null) || (name.equals("")))){
								        h.cancelReservations(name);
								        System.out.println(name+" now has no reservations.");
								    }else{
								        System.out.println("No input");
   								 }
   								 break;
					case "build":
								//add more number of rooms to the existing rooms
								roomnum = Integer.parseInt(tokens[1]);

							    if(h.buildRooms(roomnum))
							        System.out.println("Added "+roomnum+" more rooms");
							    else
							        System.out.println("No rooms are added");
							      break;
				}
				c++;
		}
	}
}
