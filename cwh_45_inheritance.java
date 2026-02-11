/* 
class Base {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("i am in base setting x now");
        this.x = x;
    }

    public void printMe() {
        System.out.println("i am a constructor");
    }

}

class Derived extends Base {
    int y;

    public int getY() {
        return y;

    }

    public void setY(int y) {
        this.y = y;
    }

}

public class cwh_45_inheritance {
    public static void main(String[] args) {
        // creating an object of base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        // creating an object of derived class

        Derived d = (new Derived());

        d.setY(43);
        System.out.println(d.getY());

    }

}  */

// question 2

/* 
class Animal {
    void eat() {
        System.out.println("animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class cwh_45_inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}  */

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike is riding");
    }
}

public class cwh_45_inheritance {
    public static void main(String[] args) {
        Bike b = new Bike();
        // b.start(); // Parent method
        b.ride(); // child method
    }
}