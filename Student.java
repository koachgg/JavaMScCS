public class Student {
    String name;
    String fatherName;
    int roll;
        
    public Student(String name, String fatherName, int roll) {
        this.name = name;
        this.fatherName = fatherName;
        this.roll = roll;
    }
    
    public class Main {
        public static void main(String[] args) {
            Student student1 = new Student("Alice", "John Doe", 101); // Predefined student
            Student student2 = student1;
            
            System.out.println("Student 1: Name - " + student1.name + ", Father's Name - " + student1.fatherName + ", Roll - " + student1.roll);
            System.out.println("Student 2: Name - " + student2.name + ", Father's Name - " + student2.fatherName + ", Roll - " + student2.roll);
        }
    }
}
