import java.util.InputMismatchException;
import java.util.Scanner;

class Person implements IPerson {
    protected String id;
    protected String name;
    protected int age;

    // Constructor
    public Person(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Setter
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Implementing methods from IPerson interface
    // @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ID: ");
        this.id = scanner.nextLine();

        System.out.print("Enter Name: ");
        this.name = scanner.nextLine();

        while (true) {
            try {
                System.out.print("Enter Age: ");
                this.age = scanner.nextInt();
                break; 
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer for age.");
                scanner.next(); 
            }
        }
        scanner.nextLine();
    }

    // @Override
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
