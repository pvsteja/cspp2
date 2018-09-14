import java.util.Arrays;
import java.util.Scanner;
class Show {
    private String movie;
    private String datetime;
    private String[] seats;
    private String[] bookedseats;

    public Show(String movie, String datetime, String[] seats) {
        this.movie = movie;
        this.datetime = datetime;
        this.seats = seats;
    }
    public String getMovie() {
        return this.movie;
    }
    public String getDateTime() {
        return this.datetime;
    }
    public String[] getSeats() {
        return this.seats;
    }
    public String toString() {
        String s = "";
        s += movie + "," + datetime;
        s += Arrays.toString(seats);
        return s;
    }
}

class Patron {
    private String name;
    private String phonenumber;
    private String[] seats;
    private String[] bookedseats;

    Patron(String name, String phonenumber, String[] bookedseats) {
        this.name = name;
        this.phonenumber = phonenumber;
        this.bookedseats = bookedseats;
    }
    public String getName() {
        return this.name;
    }
    public String getPhoneNumber() {
        return this.phonenumber;
    }
    public String[] getBookedSeats() {
        return this.bookedseats;
    }
    public String tostring() {
        String s = "";
        return s;
    }
}
class BookYourShow {
    private int showSize;
    private int patronsize;
    private Show[] show;
    private Patron[] patron;
    BookYourShow() {
        this.showSize = 0;
        this.patronsize = 0;
        this.show = new Show[10];
        this.patron = new Patron[10];
    }
    // private int getShowSize() {
    //  show = new Show();
    //  // s[] shows = new Show[10];
    //  show = Arrays.copyOf(show, 2 * size);
    //  return show;
    // }
    // private int getPatronsize() {
    //  patron = new Patron();
    //  // p[] patron = new Patron[10];
    //  patron = Arrays.copyOf(patron, 2 * size);
    //  return patron;
    // }
    public void showResize() {
        show = Arrays.copyOf(show, show.length * 2);
    }
    public void patronResize() {
        patron = Arrays.copyOf(patron, patron.length * 2);
    }
    public void addAShow(final Show newShow) {
        if (showSize == show.length) {
            showResize();
        }
        show[showSize++] = newShow;
    }
    public void addAPatron(final Patron newpatron) {
        if (patronsize > patron.length) {
            patronResize();
        }
        patron[patronsize++] = newpatron;
    }
    public Show getAShow(String movie, String datetime) {
        for (int i = 0; i < showSize; i++) {
            if (show[i].getMovie().equals(movie)
                && show[i].getDateTime().equals(datetime)) {
                return show[i];
            }
        }
        return null;
    }
    public void bookAShow(String datetime, String movie,
     Patron p) {
        addAPatron(p);
        Show availableshow = getAShow(movie, datetime);
        if (availableshow != null) {
            String[] seat = availableshow.getSeats();
            String[] bookedseats = p.getBookedSeats();
            for (int i = 0; i <= seat.length; i++) {
                for (int  j = 0; j <= bookedseats.length; j++) {
                    if (seat[i].equals(bookedseats[j])
                        && !seat[i].equals("N/A")) {
                        seat[i] = "N/A";
                    }
                }

            }

        }else
        System.out.println("No show");
    }
    public void showAll() {
        for (int i = 0; i < showSize; i++) {
            System.out.println(show[i]);
        }
    }
    public void printTicket(String movie, String phonenumber, String datetime) {
        Show show = getAShow(movie, datetime);
        if (getAShow(movie, datetime) != null) {
            for (int i = 0; i <= patronsize; i++) {
                if ((phonenumber).equals(patron[i].getPhoneNumber())) {
                    System.out.println(phonenumber + " " + movie + " " + datetime);
                    return;
                }
            System.out.println("Invalid");
            }
        System.out.println("Invalid");
        }
    }

}
public class Solution {
    private Solution() {

    }
public static void main(final String[] args) {
    BookYourShow bys = new BookYourShow();
    Scanner scan = new Scanner(System.in);
    int testCases = Integer.parseInt(scan.nextLine());
    for (int i = 0; i < testCases; i++) {
        String[] tokens = scan.nextLine().
            replace("[", "").replace("]", "").split(",");
        String[] check = tokens[0].split(" ");
        switch (check[0]) {
            case "add":
                int k = 2;
                String[] seats = new String[tokens.length - 2];
                for (int j = 0; j < seats.length; j++) {
                    seats[j] = tokens[k++];
                }
                bys.addAShow(new Show(check[1], tokens[1], seats));
            break;
            case "book":
                k = 2 + 2;
                seats = new String[tokens.length - 2 - 2];
                for (int j = 0; j < seats.length; j++) {
                    seats[j] = tokens[k++];
                }
                bys.bookAShow(check[1], tokens[1],
                    new Patron(tokens[2], tokens[2 + 1], seats));
            break;

            case "get":
                Show show = bys.getAShow(check[1], tokens[1]);
                if (show != null) {
                   System.out.println(show);
                } else {
                    System.out.println("No show");
                }
            break;

            case "print":
                bys.printTicket(check[1], tokens[1], tokens[2]);
            break;

            case "showAll":
                bys.showAll();
            break;

            default:
            break;
        }
    }
}
}