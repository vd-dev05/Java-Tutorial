package tutorrial.abstraction;

abstract class Animal {
    public abstract void animalSound();

    public void sleep( ) {
        System.out.println("Zzz");
    }
}

class Pig extends Animal {
    public void  animalSound() {
        System.out.println("the pigs says:  we bo");
    }
}

public class test {
    public static void main(String[] args) {
        Pig myPing = new Pig();
        myPing.animalSound();
        myPing.sleep();
    }
}
