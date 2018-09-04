import java.util.Scanner;
/**.
 * { item_description }
 */
class Student {
    /**
     * Constructs the object.
     */
    private Student() {
        /**.
         * { item_description }
         */

    }
    /**
     * Constructs the object.
     *
     * @param      name      The name
     * @param      rollno    The rollno
     * @param      subject1  The subject 1
     * @param      subject2  The subject 2
     * @param      subject3  The subject 3
     */
    Student(final String name, final String rollno,
        final Double subject1, final Double subject2, final Double subject3) {
        String n = name;
        String r = rollno;
        Double s1 = subject1;
        Double s2 = subject2;
        Double s3 = subject3;
        final int s = 3;
        System.out.println("average is" + ((s1 + s2 + s3) / s));
    }

}
/**
 * Class for student details.
 */
final class StudentDetails {

    /**
     * Constructs the object.
     */
    private StudentDetails() {

    }
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String rollnum = sc.nextLine();
        Double s1 = sc.nextDouble();
        Double s2 = sc.nextDouble();
        Double s3 = sc.nextDouble();
        Student st = new Student(name, rollnum, s1, s2, s3);
    }
}
