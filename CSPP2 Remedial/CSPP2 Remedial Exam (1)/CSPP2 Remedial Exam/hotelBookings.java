import java.util.Arrays;
public class hotelBookings {
	int size;
	Reservation[] reservations;

	public hotelBookings(){
		size = 1;
		reservations = new Reservation[6];
	}

	public int reserveRoom(String person) {
		int roomIndex;
		if (size == reservations.length) {
		 	System.out.println("All Rooms are reserved");
	 		return -1;
		}
		for (roomIndex = 1; roomIndex < reservations.length; roomIndex++) {
				if (reservations[roomIndex] == null) {
					reservations[roomIndex] = new Reservation(person, roomIndex);
					size++;
					break;
				}
			}
			return roomIndex;
	}

	public Boolean reserveRoom(String person, int roomNum) {
		if (size == reservations.length) {
		 	System.out.println("All Rooms are reserved");
	 		return false;
		}
		if (reservations[roomNum] != null) {
			System.out.println("Room is already reserved");
		}
		if (reservations[roomNum] == null) {
			reservations[roomNum] = new Reservation(person, roomNum);
			size++;
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
		int roomIndex;
		for (roomIndex = 0; roomIndex < size; roomIndex++) {
			if (reservations[roomIndex].getPerson().equals(person)) {
				reservations[roomIndex] = null;
				size--;
			}
		}
	}
	public boolean buildRooms(int num) {
		Reservation[] temp = new Reservation[size + num];
		System.arraycopy(reservations, 0, temp, 0, reservations.length);
		reservations = temp;
		return true;
	}

}