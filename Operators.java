public class Operators {

    public static void main(String[] args) {
        // Increment and decrement
        int mynum = 10;
        mynum++;
        System.out.println("Increment: " + mynum);

        mynum--;
        System.out.println("Decrement: " + mynum);

        // Comparison
        int a = 10;
        int b = 20;
        System.out.println("Comparison (a < b): " + (a < b));

        // Logical
        boolean x = true;
        boolean y = false;
        System.out.println("Logical AND: " + (x && y));
        System.out.println("Logical OR: " + (x || y));
        System.out.println("Logical NOT: " + (!x));

        // Bitwise
        int p = 10;
        int q = 5;
        System.out.println("Bitwise AND: " + (p & q));
        System.out.println("Bitwise OR: " + (p | q));
        System.out.println("Bitwise XOR: " + (p ^ q));
        System.out.println("Bitwise NOT (complement of q): " + (~q));
        System.out.println("Bitwise left shift (p << 2): " + (p << 2));
        System.out.println("Bitwise right shift (p >> 2): " + (p >> 2));
    }
}
