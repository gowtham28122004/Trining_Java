
class AbstractExamp {
    public static void main(String args[]) {
        Vehicle v = new Honda();
        v.run();
    }
}

abstract class Vehicle {
    abstract void run(); // abstract method
}

class Honda extends Vehicle {
    void run() {
        System.out.println("running safely"); // conflic method
    }
}
