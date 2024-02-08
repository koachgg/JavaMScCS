import java.util.Scanner;
public class ControlFlowDemo {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // If construct: Print season
        System.out.print("Enter the month number (1-12): ");
        int month = scanner.nextInt();
        if (month >= 1 && month <= 12) {
            String season;
            if (month == 12 || month <= 2)
                season = "Winter";
            else if (month <= 5)
                season = "Spring";
            else if (month <= 8)
                season = "Summer";
            else
                season = "Autumn";
            System.out.println("Season: " + season);
        } else {
            System.out.println("Invalid month number!");
        }

        // Conditional operator: Check if a number is even or odd
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        String result = (num % 2 == 0) ? "even" : "odd";
        System.out.println(num + " is " + result);

        // While loop: Print Fibonacci series
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n = scanner.nextInt();
        int a = 0, b = 1, sum;
        int count = 0;
        System.out.print("Fibonacci series: ");
        while (count < n) {
            System.out.print(a + " ");
            sum = a + b;
            a = b;
            b = sum;
            count++;
        }
        System.out.println();

        // For loop: Print odd numbers
        System.out.print("Enter the range (start end) to print odd numbers: ");
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        System.out.print("Odd numbers within the range: ");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        scanner.close();
    }
}