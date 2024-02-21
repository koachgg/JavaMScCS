public class OverloadingConstructorExample {
    private int value;

    public OverloadingConstructorExample() {
        this(0); // Calling another constructor within the same class
    }

    public OverloadingConstructorExample(int value) {
        this.value = value;
    }

    public void showValue() {
        System.out.println("Value: " + value);
    }

    public class InnerClass {
        public void display() {
            System.out.println("Inner class display method");
        }
    }

    public static void main(String[] args) {
        OverloadingConstructorExample obj1 = new OverloadingConstructorExample();
        obj1.showValue();

        OverloadingConstructorExample obj2 = new OverloadingConstructorExample(5);
        obj2.showValue();

        OverloadingConstructorExample.InnerClass innerObj = obj2.new InnerClass();
        innerObj.display();
        // Assuming the rest of the program here...
    }
}
