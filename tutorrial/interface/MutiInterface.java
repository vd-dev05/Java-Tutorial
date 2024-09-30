
/**
 * MutiInterface
 */

/**
 * MutiInterface
 */
// package '/tutorrial/interface';

/**
 * MutiInterface
 */
interface Printable {
    void print();
}

interface Showable {
    void show();
}

class MutiInterface implements Printable, Showable {
    public void print() {
        System.out.println("Hello");
    }
    
    public void show() {
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
        MutiInterface obj = new MutiInterface();
        obj.print();
        obj.show();
    }
}
