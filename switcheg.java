public class switcheg{
    public static void main(String[] args) {
        int semester = 3;
        
        switch(semester) {
            case 1:
                System.out.println("First semester");
                break;
            case 2:
                System.out.println("Second semester");
                break;
            case 3:
                System.out.println("Third semester");
                break;
            case 4:
                System.out.println("Fourth semester");
                break;
            default:
                System.out.println("Invalid semester number");
                break;
        }
    }
}
