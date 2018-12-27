public class hotelBookings {
	int size;
	Reservation[] reservations;
	int count=0;

	public hotelBookings(){
		size = 0;
		reservations = new Reservation[5];

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
		}
	 	return -1;

	}

	public Boolean reserveRoom(String person, int roomNum) {
		for (int i = 0; i < count; i++) {

		}
		return true;
	}

	public void printReservations() {

	}
	public void cancelReservations(String person) {

	}
	public boolean buildRooms(int num) {
		return true;
	}
}