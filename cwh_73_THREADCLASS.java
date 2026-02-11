
/*class Mythr extends Thread {
    public Mythr(String name) {
        super(name);
    }

    public void run() {
        int i = 34;
        System.out.println("thank you");
    }
}

public class cwh_73_THREADCLASS {
    public static void main(String[] args) {
        Mythr t1 = new Mythr("code with harry");
        Mythr t2 = new Mythr("gautam codder");
        t1.start();
        t2.start();
        System.out.println("the id of thread is " + t1.getId());
        System.out.println("the name of the tread is " + t1.getName());
        System.out.println(" the id of thread 2 is " + t2.getId());
        System.out.println("the name of thread 2 " + t2.getName());
    }
}   */

class Mynewthread extends Thread {
    public Mynewthread(String name) {
        super(name);

    }

    public void run() {
        System.out.println("thanks all my dear friends ");
        System.out.println("thanks all good army boy ");

    }
}

public class cwh_73_THREADCLASS {

    public static void main(String[] args) {
        Mynewthread t = new Mynewthread("gautam software developer");
        Mynewthread t2 = new Mynewthread("siddarth data Science");
        Mynewthread t3 = new Mynewthread("ritik web developer");
        t.start();
        t2.start();
        t3.start();
        System.out.println("the id of the thread is " + t.getId());
        System.out.println(" the name is thread 1 is " + t.getName());
        System.out.println("the id of thread 2 is " + t2.getId());
        System.out.println(" the NAME IS THREAD 2 is " + t2.getName());
        System.out.println(" ritik codder" + t3.getName());
    }
}
