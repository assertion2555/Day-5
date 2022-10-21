import java.util.Scanner;

public class LargestThreeNumber {
    public static void main(String[] args) {
        int a, b, c, Largest;
        //Object of Scanner Class
        Scanner s = new Scanner(System.in);
        //Reading Input from user
        System.out.println("Enter the First Number");
        a = s.nextInt();
        System.out.println("Enter the Second Number");
        b = s.nextInt();
        System.out.println("Enter the Third Number");
        c = s.nextInt();
        Largest = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
        System.out.println("The largest Number is =" + Largest);

    }
}
