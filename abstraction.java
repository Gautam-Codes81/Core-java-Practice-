

abstract  class Abstraction{
    abstract void start();
    void disp(){
        System.out.println("the car stopper");

    }
}
  class Abstraction2 extends Abstraction{
 void start(){
    System.out.println("the is started");

 }

 void disp(){
    System.out.println("Abstraction implement");
 }
}



/**
 * abstraction
 */
public class abstraction {

    public static void main(String[] args) {
        Abstraction2 obj = new Abstraction2();
        obj.start();
        
        obj.disp();
        
    }
}