/*class phone {
   public void greet() {
       System.out.println("good morning");
   }

   public void on() {
       System.out.println("turning on the phone");
   }
}

class Smartphone extends phone {
   public void Swagat() {
       System.out.println("Aapka Swagat hai");

   }

   public void on() {
       System.out.println("turning on the smartphone");
   }

}

public class cwh_49_dynamic_method_dispatch {
   public static void main(String[] args) {
       phone obj = new Smartphone();
       // obj.greet();
       obj.on();
   }

} */

class Shape {
    void Draw() {
        System.out.println("drawing shape");
    }

}

class circle extends Shape {
    void Draw() {
        System.out.println("Drawing circle");
    }
}

class Square extends Shape {
    void Draw() {
        System.out.println("Drawing square");
    }
}

public class cwh_49_dynamic_method_dispatch {

    public static void main(String[] args) {
        Shape obj = new circle();
        obj.Draw();
        Shape obj1 = new Square();
        obj1.Draw();

    }
}
