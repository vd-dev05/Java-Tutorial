package tutorrial.polymorphism;
// Runtime Polymorphism (Method Overriding):
class Bike {
    void run() {
        System.out.println("running");
    }
}
 
public class Splender extends Bike {
    void run() {
        System.out.println("running safely with 60km");
    }
 
    public static void main(String args[]) {
        Bike b = new Splender();// Upcasting
        b.run();
    }
}