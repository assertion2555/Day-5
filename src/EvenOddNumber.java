import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        // Obejct of Scanner class
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number");
        int Num = s.nextInt();
        //Use the logic
        if (Num % 2 == 0) {
            System.out.println("Number is Even");

        } else {
            System.out.println("Number is Odd");
        }

    }
}
