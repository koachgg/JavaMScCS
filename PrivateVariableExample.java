public class PrivateVariableExample {
    private int privateVar;

    public PrivateVariableExample(int privateVar) {
        this.privateVar = privateVar;
    }

    public void showPrivateVar() {
        System.out.println("Private variable value: " + privateVar);
    }

    @Override
    protected void finalize() {
        System.out.println("Finalizing object and cleaning up resources...");
    }

    public static void main(String[] args) {
        PrivateVariableExample obj = new PrivateVariableExample(12);
        obj.showPrivateVar();
        // Assuming the rest of the program here...
    }
}