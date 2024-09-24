class Overridding {
    public static void main(String args[]) {
        Animal a = new Animal();
        a.sound();
        Dog d = new Dog();
        d.sound();
    }
}

class Animal {
    void sound() {
        System.out.println("Moouuu");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("ooowv");
    }
}

