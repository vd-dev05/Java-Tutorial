package tutorrial.polymorphism;
// Compile-Time Polymorphism (Overloading)
class MathSum {
    int add(int a,int b) {
        return  a + b;
    }

    double add(double  a, double  b) {
        return  a +b;
    }
}

public class Main {
    public static void main(String[] args) {
        MathSum math = new  MathSum();
        System.out.println(math.add(5, 10));
        System.out.println(math.add(5.5, 10.5)); 
    }
}
