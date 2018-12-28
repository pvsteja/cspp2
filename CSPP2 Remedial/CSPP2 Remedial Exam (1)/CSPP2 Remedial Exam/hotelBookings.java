public class hotelBookings {
	int size;
	Reservation[] reservations;

	public hotelBookings(){
		size = 0;
		reservations = new Reservation[6];
	}

	public int reserveRoom(String person) {
		if (size == reservations.length) {
		 	System.out.println("All rooms are reserved");
	 		return -1;
		} else {
			int roomIndex;
			for (roomIndex = 1; roomIndex < reservations.length; roomIndex++) {
				if (reservations[roomIndex] == null) {
					reservations[roomIndex] = new Reservation(person, roomIndex);
					size++;
					break;
				}
			}
			return roomIndex;
		}

	}

	public Boolean reserveRoom(String person, int roomNum) {
		if (reservations[roomNum] == null) {
			reservations[roomNum] = new Reservation(person, roomNum);
			return true;
		}
		return false;
	}

	public void printReservations() {
		for (int i = 1; i < reservations.length; i++) {
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