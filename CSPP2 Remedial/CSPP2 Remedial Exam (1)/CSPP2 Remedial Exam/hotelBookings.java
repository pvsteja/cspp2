import java.util.Arrays;
public class hotelBookings {
	int size;
	Reservation[] reservations;
	int count=0;
	int[] check;

	public hotelBookings(){
		size = 0;
		reservations = new Reservation[5];
		check = new int[5];

	}
	// public boolean isEmpty(int roomNum) {
	// 	return true;
	// }
	public int reserveRoom(String person) {
		Reservation r = new Reservation(person);
		if(size == 0) {
			reservations[count] = r;
		 	++size;
		 	count++;
		 	r.setRoom(count);

		}
		if (size == reservations.length) {
		 	System.out.println("All rooms are reserved");
	 		return -1;
		}
		else {
		 	for (int j = 0; j < check.length; j++) {
		 		if (count == check[j]) {
		 			reservations[count] = r;

		 		}
		 		else {
		 			reservations[count] = r;
		 		}
		 	}
		 	++size;
		 	count++;
			r.setRoom(count);
		}
		return count;
	}

	public Boolean reserveRoom(String person, int roomNum) {
		Reservation r = new Reservation(person,roomNum);
		int i = 0;
		check[i] = roomNum;
		Arrays.sort(check);

		// for (int i = 0; i < reservations.length; i++) {
			if (reservations[roomNum - 1] == null) {
				reservations[roomNum - 1] = r;
				i++;
				return true;
			}
		// }
			i++;
		return false;
	}

	public void printReservations() {
		for (int i = 0; i < reservations.length; i++) {
			if (reservations[i] != null) {
				System.out.println("");
			}
		}

	}
	public void cancelReservations(String person) {

	}
	public boolean buildRooms(int num) {
		return true;
	}
}