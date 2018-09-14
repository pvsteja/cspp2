import java.util.Arrays;
import java.util.Scanner;
/**
 * . Class for show.
 */
class Show {
    /**
     * { var_description }
     */
    private String movie;
    /**.
     * { var_description }
     */
    private String datetime;
    /**.
     * { var_description }
     */
    private String[] seats;
    /**.
     * { var_description }
     */
    private String[] bookedseats;
    /**.
     * Constructs the object.
     *
     * @param      movie     The movie
     * @param      datetime  The datetime
     * @param      seats     The seats
     */
    public Show(final String movie, final String datetime, final String[] seats) {
        this.movie = movie;
        this.datetime = datetime;
        this.seats = seats;
    }
    /**.
     * Gets the movie.
     *
     * @return     The movie.
     */
    public String getMovie() {
        return movie;
    }
    /**.
     * Gets the date time.
     *
     * @return     The date time.
     */
    public String getDateTime() {
        return datetime;
    }
    /**.
     * Gets the seats.
     *
     * @return     The seats.
     */
    public String[] getSeats() {
        return seats;
    }
    /**.
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        String s = "";
        s += movie + "," + datetime + ",";
        s += Arrays.toString(seats).replace(", ",",");
        return s;
    }
}

/**.
 * Class for patron.
 */
class Patron {
    /**.
     * { var_description }
     */
    private String name;
    /**.
     * { var_description }
     */
    private String phonenumber;
    /**.
     * { var_description }
     */
    private String[] bookedseats;
    /**.
     * Constructs the object.
     *
     * @param      name         The name
     * @param      phonenumber  The phonenumber
     * @param      bookedseats  The bookedseats
     */
    Patron(final String name, final String phonenumber, final String[] bookedseats) {
        this.name = name;
        this.phonenumber = phonenumber;
        this.bookedseats = bookedseats;
    }
    /**.
     * Gets the name.
     *
     * @return     The name.
     */
    public String getName() {
        return this.name;
    }
    /**.
     * Gets the phone number.
     *
     * @return     The phone number.
     */
    public String getPhoneNumber() {
        return this.phonenumber;
    }
    /**.
     * Gets the booked seats.
     *
     * @return     The booked seats.
     */
    public String[] getBookedSeats() {
        return this.bookedseats;
    }
    /**.
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        String s = "";
        s += name + " " + phonenumber + " " + Arrays.toString(bookedseats);
        return s;
    }
}
/**.
 * Class for book your show.
 */
class BookYourShow {
    /**.
     * { var_description }
     */
    private int showSize;
    /**.
     * { var_description }
     */
    private int patronsize;
    /**.
     * { var_description }
     */
    private Show[] show;
    /**.
     * { var_description }
     */
    private Patron[] patron;
    /**.
     * Constructs the object.
     */
    BookYourShow() {
        this.showSize = 0;
        this.patronsize = 0;
        this.show = new Show[10];
        this.patron = new Patron[10];
    }
    /**.
     * Shows the resize.
     */
    public void showResize() {
        show = Arrays.copyOf(show, show.length * 2);
    }
    /**.
     * { function_description }
     */
    public void patronResize() {
        patron = Arrays.copyOf(patron, patron.length * 2);
    }
    /**.
     * Adds a show.
     *
     * @param      newShow  The new show
     */
    public void addAShow(final Show newShow) {
        if (showSize == show.length) {
            showResize();
        }
        show[showSize++] = newShow;
    }
    /**.
     * Adds a patron.
     *
     * @param      newpatron  The newpatron
     */
    public void addAPatron(final Patron newpatron) {
        if (patronsize == patron.length) {
            patronResize();
        }
        patron[patronsize++] = newpatron;
    }
    /**.
     * Gets a show.
     *
     * @param      movie     The movie
     * @param      datetime  The datetime
     *
     * @return     A show.
     */
    public Show getAShow(final String movie, final String datetime) {
        for (int i = 0; i < showSize; i++) {
            if (show[i].getMovie().equals(movie)
                && show[i].getDateTime().equals(datetime)) {
                return show[i];
            }
        }
        return null;
    }
    /**.
     * { function_description }
     *
     * @param      movie     The movie
     * @param      datetime  The datetime
     * @param      p         { parameter_description }
     */
    public void bookAShow(final String movie, final String datetime,
     Patron p) {
        addAPatron(p);
        Show availableshow = getAShow(movie, datetime);
        if (availableshow != null) {
            String[] seat = availableshow.getSeats();
            String[] bookedseats = p.getBookedSeats();
            for (int i = 0; i < seat.length; i++) {
                for (int  j = 0; j < bookedseats.length; j++) {
                    if (seat[i].equals(bookedseats[j])
                        && !seat[i].equals("N/A")) {
                        seat[i] = "N/A";
                    }
                }

            }
        }else {
            System.out.println("No show");
        }
    }
    /**.
     * Shows all.
     */
    public void showAll() {
        for (int i = 0; i < showSize; i++) {
            System.out.println(show[i]);
        }
    }
    /**.
     * { function_description }
     *
     * @param      movie        The movie
     * @param      phonenumber  The phonenumber
     * @param      datetime     The datetime
     */
    public void printTicket(final String movie, final String phonenumber, final String datetime) {
        System.out.println(Arrays.toString(show));
        Show show = getAShow(movie, datetime);
        System.out.println(Arrays.toString(patron));
        if (show != null) {
            for (int i = 0; i < patronsize; i++) {
                if ((phonenumber).equals(patron[i].getPhoneNumber())) {
                    System.out.println(phonenumber + " " + movie + " " + datetime);
                    return;
                }
            }
            System.out.println("invalid");
        } else {
            System.out.println("invalid");
        }
    }

}
/**.
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
/**.
 * { function_description }
 *
 * @param      args  The arguments
 */
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
                    new Patron(tokens[2], tokens[2 + 1], seats) );
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