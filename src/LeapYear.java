import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        //Object of Scanner class
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Year");
        int Year = s.nextInt();
        //Logic for the Leap Year
        if ((Year % 400 == 0) || (Year % 4 == 0 && Year % 100 == 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}
