class Slot {
	String name;
	Slot(String name) {
		this.name = name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getName() {
		return name;
	}
}
class Parking {
	Slot[] parking;
	int size;
	Parking(int x) {
		parking = new Slot[10];
		this.size = 0;
	}
	int carsCount() {
		return size;
	}
	int getEmptySlots() {
		return (parking.length - size);
	}
	void addToSlot(Slot slot) {
		for (int i = 0; i < parking.length; i++) {
			if (parking[i] == null) {
				parking[i] = slot;
				size++;
				return;
			}
		}
	}
	void removeFromSlot(String name) {
		for (int i = 0; i < size; i++) {
			if (name.equals(parking[i].getName())) {
				parking[i] = null;
				size--;
				for (int j = i; j < size; j++) {
					parking[j] = parking[j + 1];
				}
				return;
			}

		}

	}
	Slot getSlot(String name) {
		for (int i = 0; i < size; i++) {
			if (name.equals(parking[i].getName())) {
				return parking[i];
			}
		}
		return null;
	}
	void clearSlots() {
		parking = new Slot[0];
		size = 0;
	}
	public String toString() {
		String s = "";
		for (int i = 0; i < size; i++) {
			s += parking[i].getName() + "\n";
		}
		return s;
	}
}
public class Solution {
	public static void main(String[] args) {
		Parking parking = new Parking(10);

		if (parking.carsCount() == 0) {
			System.out.println("Testcase 1 passed");
		} else {
			System.out.println("Testcase 1 failed");
		}

		parking.addToSlot(new Slot("Murthy"));


		if (parking.getSlot("Murthy").getName().equals("Murthy")) {
			System.out.println("Testcase 2 passed");
		} else {
			System.out.println("Testcase 2 failed");
		}

		parking.addToSlot(new Slot("Vamshi"));
		System.out.print(parking);
		parking.addToSlot(new Slot("Deepak"));
		parking.addToSlot(new Slot("Rajni"));

		if (parking.getSlot("Deepak") != null) {
			System.out.println("Testcase 3 passed");
		} else {
			System.out.println("Testcase 3 failed");
		}



		if (parking.carsCount() == 4) {
			System.out.println("Testcase 4 passed");
		} else {
			System.out.println("Testcase 4 failed");
		}

		parking.removeFromSlot("Rehana");

		if (parking.carsCount() == 4) {
			System.out.println("Testcase 5 passed");
		} else {
			System.out.println("Testcase 5 failed");
		}

		System.out.print(parking);

		parking.removeFromSlot("Deepak");

		if (parking.carsCount() == 3) {
			System.out.println("Testcase 6 passed");
		} else {
			System.out.println("Testcase 6 failed");
		}

		if (parking.getSlot("Deepak") == null) {
			System.out.println("Testcase 7 passed");
		} else {
			System.out.println("Testcase 7 failed");
		}

		if (parking.getEmptySlots() == 7) {
			System.out.println("Testcase 8 passed");
		} else {
			System.out.println("Testcase 8 failed");
		}

		System.out.print(parking);
		parking.clearSlots();

		if (parking.carsCount() == 0) {
			System.out.println("Testcase 9 passed");
		} else {
			System.out.println("Testcase 9 failed");
		}

		if (parking.getEmptySlots() == 0) {
			System.out.println("Testcase 10 passed");
		} else {
			System.out.println("Testcase 10 failed");
		}

	}
}