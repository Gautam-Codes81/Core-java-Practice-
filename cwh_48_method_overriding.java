/* 
class A {
    // public void meth2() {
    // System.out.println(" i am method 2 of class A");
    // }

    public void meth3() {
        System.out.println("ritik is smart boy");
    }
}

class B extends A {
    // public void meth2() {
    // System.out.println("i am method of class B");

    // }

    public void meth3() {
        System.out.println(" gautam is smart boy ");
    }
}

public class cwh_48_method_overriding {

    public static void main(String[] args) {
        A a = new A();
        a.meth3();
        B b = new B();
        b.meth3();
    }

}  */

// problem question 2

/* class Shape {
  void draw() {
      System.out.println("Drawing a shape");
  }
}

class Circle extends Shape {
  void draw() {
      System.out.println("Drawing a circle");

  }
}

class Rectangle extends Shape {
  void draw() {
      System.out.println("Drawing a triangle");
  }
}

public class cwh_48_method_overriding {
  public static void main(String[] args) {
      Shape s = new Shape();
      s.draw();
      Circle c = new Circle();
      c.draw();
      Rectangle r = new Rectangle();
      r.draw();

      /*
       * * Shape s;
       * s = new Circle();
       * s.draw();
       * s = new Rectangle();
       * s.draw();
       */
//  }

//} 
//*/

class Animal {
    void sound() {
        System.out.println("animal is make sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("dog bark");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("cat meows");
    }

}

public class cwh_48_method_overriding {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();
        Dog d = new Dog();
        d.sound();
        Cat c = new Cat();
        c.sound();

    }
}

/*
 * *
 * class Employee {
 * int salary() {
 * return 2000;
 * }
 * }
 * 
 * class Manager extends Employee {
 * int salary() {
 * return 50000;
 * }
 * }
 * 
 * class Developer extends Employee {
 * int salary() {
 * 
 * return 40000;
 * }
 * }
 * 
 * public class cwh_48_method_overriding {
 * 
 * public static void main(String[] args) {
 * Employee e = new Employee();
 * e.salary();
 * Manager m = new Manager();
 * m.salary();
 * Developer d = new Developer();
 * d.salary();
 * }
 * }
 */
