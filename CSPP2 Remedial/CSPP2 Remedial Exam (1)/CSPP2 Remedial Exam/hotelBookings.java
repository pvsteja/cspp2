public class hotelBookings {
	int size;
	Reservation[] reservations;
	int count=0;

	public hotelBookings(){
		size = 0;
		reservations = new Reservation[6];

	}

	public boolean isEmpty(int roomNum) {
		return true;
	}

	public int reserveRoom(String person) {
		Reservation r = new Reservation(person);
		if(size == 0) {
			reservations[count] = r;
		 	++size;
		 	r.setRoom(count + 1);
			return ++count;
		}
		if (size == reservations.length) {
		 	System.out.println("All rooms are reserved");
	 		return -1;
		}
		else if(reservations[count] == null){
		 	reservations[count] = r;
		 	++size;
			r.setRoom(count + 1);
			return ++count;
		}else {
			count += 1;
			// reserveRoom(person);
			reservations[count] = r;
		 	++size;
		 	r.setRoom(count + 1);
			return ++count;
		}
	}

	public Boolean reserveRoom(String person, int roomNum) {
		Reservation rN = new Reservation(person);
		// for (int i = 0; i < reservations.length; i++) {
			if (reservations[roomNum] == null) {
				reservations[roomNum] = rN;
		 		++size;
		 		rN.setRoom(count + 1);

				return true;
			}
		// }
		return false;
	}

	public void printReservations() {
		for (int i = 0; i < 5; i++) {
			if (reservations[i] != null) {
				System.out.println(reservations[i]);
			}
		}
	}
	public void cancelReservations(String person) {

	}
	public boolean buildRooms(int num) {
		return true;
	}
}