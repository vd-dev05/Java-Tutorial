package tutorrial.interface;

interface Printable {
    void print();
}

interface Showable extends  Printable {
    void show ();
}


public class overloading implements Showable  {
    public void print() {
        System.out.println("hello");
    }

    public  void show () {
        System.out.println("welcome");
    }

    public static void main(String[] args) {
        overloading obj = new overloading();
        obj.print();
        obj.show();
    }

}
