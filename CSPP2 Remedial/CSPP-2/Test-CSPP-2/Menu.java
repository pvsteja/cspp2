import java.util.ArrayList;
import java.util.List;
//The menu should provide the user with the option of creating a new ​Card Catalog and
//then of adding, removing individual books, or of printing a list of all books within the ​Card Catalog . ​
class CardCatalog {
	List<Card> cards = new ArrayList<Card>();
	int size;
    CardCatalog(int i) {
    	cards = new ArrayList<Card>();
    }

    void addACard(Card c1) {
    	cards.add(c1);
    }

    int sizeOfCatalog() {
    	return cards.size();
    }
    void removeCard(String ansi_c) {
    	for (int i = 0; i < cards.size(); i++) {
			if (cards.get(i).getName().equals(ansi_c)) {
				cards.remove(cards.get(i));
			}
    	}
    }

    void clear() {
		cards.clear();
    }
}
class Card {
String bookname;
String author;
String technology;
    Card(String bookname, String authorname, String techname) {
        this.bookname=bookname;
        this.author=authorname;
        this.technology=techname;

    }

    String getName() {
		return this.bookname;
    }


}
public class Menu {
	Menu() {

	}
	public static void main(String args[]) {
		//Card Catalog class will take integer as parameter in constructor which hold the maximum number of cards.
		CardCatalog cc = new CardCatalog(2);

		//Card class will be having the information about the book it describes.
		//The constructor should take a three parameters, the title ​of the book,
		//the ​author ​of the book, and the ​subject ​of the book as all strings.
		Card c1 = new Card("Let us c", "Yesh Kanetkar", "C Programming");
		cc.addACard(c1);

		// To String to print the Card Object in the example below.
		// 1. Book Title: Let us c, Author: Yesh Kanetkar
		// Subject: C Programming
		System.out.print(cc);

		// Checks the count of current cards in the catalogue.
		if (cc.sizeOfCatalog() == 1) {
			System.out.println("Test Case 1 Passed");
		} else {
			System.out.println("Test Case 1 Failed"	);
		}

		Card c2 = new Card("Think Java", "Dwolye", "Java Programming");
		cc.addACard(c2);
		// System.out.println(cc.sizeOfCatalog() );
		// As the size of the catalog is full, you need to manage the Card Catalog by
		// growing the catalogue. (Hint: Resize)

		Card c3 = new Card("Ansi c", "Balaguru swamy", "C++ Programming");
		cc.addACard(c3);
		// System.out.println(cc.sizeOfCatalog() );
		// Checks the count of current cards in the catalogue.
		if (cc.sizeOfCatalog() == 3) {
			System.out.println("Test Case 2 Passed");
		} else {
			System.out.println("Test Case 2 Failed");
		}

		Card c4 = new Card("Mobile programming", "Balaguru swamy", "Mobile Programming");
		cc.addACard(c4);
		// Output will be like the following:
		// 1. Book Title: Let us c, Author: Yesh Kanetkar
		// Subject: C Programming
		//
		// 2. Book Title: Think Java, Author: Dwolye
		// Subject: Java Programming
		//
		// 3. Book Title: Ansi c, Author: Balaguru swamy
		// Subject: C++ Programming
		//
		// 4. Book Title: Mobile programming, Author: Balaguru swamy
		// Subject: Mobile Programming
		System.out.print(cc);

		// Checks the count of current cards in the catalogue.
		if (cc.sizeOfCatalog() == 4) {
			System.out.println("Test Case 3 Passed");
		} else {
			System.out.println("Test Case 3 Failed");
		}

		// Print the Card object by using the Title of the Book.
		//Output will be :
		// Book Title: Ansi c, Author: Balaguru swamy, Subject: C++ Programming

		// Remove the Card Object if the Card Object is present in the Catalogue.
		//This method will take Title of the book as the parameter.
		// System.out.println(cc.sizeOfCatalog() );
		cc.removeCard("Ansi c");
		cc.removeCard("Ansi c");


		System.out.println(cc.sizeOfCatalog());

		// Checks the count of current cards in the catalogue.
		if (cc.sizeOfCatalog() == 3) {
			System.out.println("Test Case 4 Passed");
		} else {
			System.out.println("Test Case 4 Failed");
		}

		//Print the current books in the card catalogue in the order as discussed earlier.
		System.out.print(cc);

		cc.addACard(new Card("Algorithms - 1", "Bob Sedgewick", "Java Programming"));
		cc.addACard(new Card("Algorithms - 2", "Bob Sedgewick", "Java Programming"));


		System.out.println(cc.sizeOfCatalog());

		// Checks the count of current cards in the catalogue.
		if (cc.sizeOfCatalog() == 5) {
			System.out.println("Test Case 5 Passed");
		} else {
			System.out.println("Test Case 5 Failed");
		}


		//Print the current books in the card catalogue in the order as discussed earlier.
		System.out.print(cc);

		// Clears all the cards in the card catalogue, which make the catalogue empty.
		cc.clear();
		// Checks the count of current cards in the catalogue.
		if (cc.sizeOfCatalog() == 0) {
			System.out.println("Test Case 6 Passed");
		} else {
			System.out.println("Test Case 6 Failed");
		}
	}
}