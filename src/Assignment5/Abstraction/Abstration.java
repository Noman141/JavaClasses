package Assignment5.Abstraction;

abstract class Abstration {
    abstract void start();

}

class Car extends Abstration{
    void  start(){
        System.out.println("Start with key");
    }

}

class Scooter extends Abstration{
    void start(){
        System.out.println("Start with kick");
    }
}

class Main{
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        Scooter scooter = new Scooter();
        scooter.start();
    }
}
