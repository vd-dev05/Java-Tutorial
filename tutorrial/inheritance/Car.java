package tutorrial.inheritance;

class Vehicle {
    protected String brand = "Ford";
    public void hook () {
        System.out.println("tut tut");
    }

}

public  class  Car extends  Vehicle {
    private String modelName = "Mustang";
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.hook();
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}

