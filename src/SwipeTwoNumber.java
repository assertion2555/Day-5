public class SwipeTwoNumber {
    public static void main(String[] args) {
        int a = 10, b = 20;
        //Logic use for Swipe the Number
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}
