public class methodeg {
    public static void main(String[] args) {
        printStudentDetails("Alice", "John Doe", 101, "A", 3, 2024);
    }
    
    public static void printStudentDetails(String name, String fatherName, int roll, String section, int sem, int year) {
        System.out.println("Student Name: " + name);
        System.out.println("Father's Name: " + fatherName);
        System.out.println("Roll Number: " + roll);
        System.out.println("Section: " + section);
        System.out.println("Semester: " + sem);
        System.out.println("Year: " + year);
    }
}
