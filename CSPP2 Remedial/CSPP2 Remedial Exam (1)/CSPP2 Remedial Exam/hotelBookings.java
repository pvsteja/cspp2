public class hotelBookings {
	int size;
	Reservation[] reservations;
	int count=0;

	public hotelBookings(){
		size = 0;
		reservations = new Reservation[5];

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
		 	reservations[count] = r;
		 	++size;
		 	count++;
			r.setRoom(count);
		}
		return count;
	}

	public Boolean reserveRoom(String person, int roomNum) {
		Reservation r = new Reservation(person,roomNum);
		// for (int i = 0; i < reservations.length; i++) {
			if (reservations[roomNum - 1] == null) {
				reservations[roomNum - 1] = r;
				return true;
			}
		// }
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