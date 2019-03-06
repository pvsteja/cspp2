import java.util.*;
/**
 * Class for main.
 */
public class Solution{

  public static void main(String[] args){
  		hotelBookings h = new hotelBookings();
		String name;
		int roomnum;
  		Scanner scan = new Scanner(System.in);
		int readLines = Integer.parseInt(scan.nextLine());
		int c=0;
		while (c<readLines) {
			String line = scan.nextLine();
			String temp[]=line.split(" ");
				switch(temp[0])
				{
					case "reserve":
									name = temp[1];
									roomnum = -1;
								    //if we got a good name, try to reserve a room
								    if(!((name==null) || (name.equals(""))))
								        roomnum = h.reserveRoom(name);

								    //give feedback
								    if(roomnum!=-1)
								        System.out.println(name+" "+roomnum);

									break;

					case "reserveN":
									name = temp[1];
									//if we got a bad input, report failure

								    if((name==null) || (name.equals("")))
								        roomnum = -1;
								    else{
								     roomnum = Integer.parseInt(temp[2]);
								    }
								    //give feedback
								    if(h.reserveRoom(name, roomnum))
								        System.out.println(name+" "+roomnum);

								    break;

					case "print":
								//print all the reservations done in the hotelBookings
								h.printReservations();
								 break;
					case "cancel":
								//cancel the rooms for that particular person
								name = temp[1];
								if(!((name==null) || (name.equals("")))){
								        h.cancelReservations(name);
								        System.out.println(name+" now has no reservations.");
								    }else{
								        System.out.println("No input");
   								 }
   								 break;
					case "build":
								//add more number of rooms to the existing rooms
								roomnum = Integer.parseInt(temp[1]);

							    if(h.buildRooms(roomnum))
							        System.out.println("Added "+roomnum+" more rooms");
							    else
							        System.out.println("No rooms are added");
							      break;
				}
				c++;
		}
		System.out.println(c);
	}
}
