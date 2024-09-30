
import java.util.Scanner;

class Student extends Person {
    private int mark;
    private String grade;

    // Constructor
    public Student(String id, String name, int age) {
        super(id, name, age);
        this.mark = 0; // Default mark
        this.grade = ""; // Default grade
    }

    // Getter for mark and grade
    public int getMark() {
        return mark;
    }

    public String getGrade() {
        return grade;
    }

    // Setter for mark
    public void setMark(int mark) {
        this.mark = mark;
        setGrade(); // Update grade when mark is set
    }

    // Setter for grade based on mark
    private void setGrade() {
        if (mark >= 8) {
            this.grade = "A";
        } else if (mark >= 7) {
            this.grade = "B";
        } else if (mark >= 6) {
            this.grade = "C";
        } else if (mark >= 5) {
            this.grade = "D";
        } else {
            this.grade = "Tạch cmnr";
        }
    }

    // @Override
    public void display() {
        super.display(); // Call display from Person
        System.out.println("Mark: " + mark);
        System.out.println("Grade: " + grade);
    }

    // @Override
    public void input() {
        super.input(); // Call input from Person

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Mark: ");
        this.mark = scanner.nextInt();
        setGrade(); // Set grade based on mark
    }
}
