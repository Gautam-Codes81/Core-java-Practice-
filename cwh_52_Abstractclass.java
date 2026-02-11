/*abstract class parent2 {
   public parent2() {
       System.out.println("i am a consructor hoon");
   }

   public void sayhello() {
       System.out.println("say helo");
   }

   abstract public void greet();

   abstract public void greet2();
}

class child2 extends parent2 {
   public void greet() {
       System.out.println("good morning");
   }

   public void greet2() {
       System.out.println("good afternoon");
   }
}

public class cwh_52_Abstractclass {

   public static void main(String[] args) {
       // parent2 p = new parent2();

       parent2 p = new child2();
       p.greet();
       p.greet2();
       p.sayhello();

   }
} */

/*abstract class car {
   public abstract void drive();

   public abstract void fly();

   public abstract void playMusic();

   // public abstract void playMusic2();

}

abstract class WagonR extends car {
   public void drive() {
       System.out.println("Driving");
   }

   public void fly() {
       System.out.println("Flying");
   }

   public void playMusic() {
       System.out.println(" playing music");

   }

   public void playMusic2() {
       System.out.println(" playing the gautam music ");
   }

   // public abstract void playMusic2();

}

class updateWagonR extends WagonR {
   public void fly() {
       System.out.println("flying");
   }

   // public void playMusic2() {
   // System.out.println(" playing the gautam music ");
   // }

}

public class cwh_52_Abstractclass {
   public static void main(String[] args) {
       car c = new updateWagonR();
       c.drive();
       c.fly();
       c.playMusic();
       WagonR w = new updateWagonR();
       w.playMusic2();
   }

} */
/*abstract class shape {
    abstract void area();
}

class circle extends shape {
    public void area() {
        int r = 5;
        System.out.println("area of circle finding by gautam kushwaha " + (3.14 * r * r));
    }
}

public class cwh_52_Abstractclass {

    public static void main(String[] args) {
        shape s = new circle();
        s.area();
    }
} */

/*abstract class vehicle {
    vehicle() {
        System.out.println(" i am a constructor");
    }

    abstract void speed();
}

class bike extends vehicle {
    public void speed() {
        System.out.println(" bike speed is 80 km/hr");
    }
}

public class cwh_52_Abstractclass {
    public static void main(String[] args) {
        vehicle v = new bike();
        v.speed();
    }

} */
abstract class Employee {
    abstract void salary();

    public void company() {
        System.out.println(" company TCS");

    }
}

class developer extends Employee {
    public void salary() {
        System.out.println("SALLARY 50000");
    }
}

public class cwh_52_Abstractclass {
    public static void main(String[] args) {
        Employee e = new developer();
        e.salary();
        e.company();
    }

}