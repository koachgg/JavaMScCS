public class area {
    public static double calculateAverage(double... marks) {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }
    public static void main(String[] args) {
        double mark1 = 85.5;
        double mark2 = 78.2;
        double mark3 = 90.0;
        double mark4 = 87.9;
        double mark5 = 91.7;
            
        double average = calculateAverage(mark1, mark2, mark3, mark4, mark5);
        System.out.println("Average mark: " + average);
    }
}
