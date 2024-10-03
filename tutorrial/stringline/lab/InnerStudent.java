package tutorrial.stringline.lab;

import java.util.ArrayList;

class Student {
 String name;
 int id;
//   Constructor

public Student (String name, int id ) {
    this.name = name ;
    this.id = id;
}

public String getName () {
    return name;
}
public  int getId() {
    return  id;
}
}
public  class InnerStudent {
    public static void main(String[] args) {
        ArrayList<Student> student = new ArrayList<>();

        student.add(new Student("Nguyen van  A", 0));
        student.add(new Student("Nguyen van  B", 1));
        student.add(new Student("Nguyen van  C", 2));
        student.add(new Student("jony", 3));

        System.out.println("Nhung nguoi co ho nguyen la: ");
        
        for (Student student2 : student) {
            if (student2.getName().startsWith("Nguyen") ) {
                System.out.println("Ten " + student2.getName() + ", ID :" + student2.getId());
            }
        }
    }
    
}
