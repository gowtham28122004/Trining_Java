class Inherit {
    public static void main(String[] args) {
        Dog d = new Dog("belly");
        d.sound();
        Cat c = new Cat("tom");
        c.sound();
    }
}

class Animal {
    
    String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    public void sound() {
        System.out.println(name+" makes a Sound.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    @Override
    public void sound() {
        super.sound();
        System.out.println("woof");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    @Override
    public void sound() {
        super.sound();
        System.out.println("meew");
    }
}
