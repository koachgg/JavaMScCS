public class ConstructorExample {
    private int value1;
    private int value2;

    public ConstructorExample(int value1) {
        this.value1 = value1;
    }

    public ConstructorExample(int value1, int value2) {
        this(value1); // Calling another constructor within the same class
        this.value2 = value2;
    }

    public void showValues() {
        System.out.println("Value 1: " + value1);
        System.out.println("Value 2: " + value2);
    }

    public static void main(String[] args) {
        ConstructorExample obj = new ConstructorExample(12, 16);
        obj.showValues();
        // Assuming the rest of the program here...
    }
}