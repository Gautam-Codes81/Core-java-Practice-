/*class Mythread1 extends Thread {
    public void run() {
        int i = 0;
        while (i < 500) {
            System.out.println("thread is running very good");
            i++;

        }
        // System.out.println("thread is running very good");
    }
}

class Mythread2 extends Thread {
    public void run() {
        int i = 0;
        while (i < 500) {
            System.out.println("thread is running very bad");
            i++;
        }
        // System.out.println("thread is not very good");

    }
}

public class cwh_70_multithreading {
    public static void main(String[] args) {
        Mythread1 t1 = new Mythread1();
        Mythread2 t2 = new Mythread2();
        t1.start();
        t2.start();
    }
} */

// PROBLEM NUMBER 2

/*class Mythread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + "_" + Thread.currentThread().getName());
        }
    }
}

public class cwh_70_multithreading {

    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        t1.start();
    }
} */

// PROBLEM NUMBER 3

//import java.nio.channels.Pipe.SourceChannel;

/*class Mythread2 extends Thread {
    public void run() {
        int i = 0;
        while (i <= 500) {
            System.out.println("Thread running" + Thread.currentThread().getName());
            System.out.println("gautam is creating by threading");

            i++;
        }
        // System.out.println("Thread running" + Thread.currentThread().getName());
    }
}

class MyThread3 extends Thread {
    public void run() {
        int i = 0;
        while (i <= 500) {
            System.out.println("thread is very fast running ");
            System.out.println(" thread is very slow running");
            i++;
        }

        // System.out.println("thread is very fast running ");
        // System.out.println(" thread is very slow running");
    }
}

public class cwh_70_multithreading {

    public static void main(String[] args) {
        Mythread2 t2 = new Mythread2();
        MyThread3 t3 = new MyThread3();
        t2.start();
        t3.start();
    }
} */

class Mythread extends Thread {
    public void run() {
        System.out.println("Thread name" + getName());
    }
}

public class cwh_70_multithreading {

    public static void main(String[] args) {
        Mythread t = new Mythread();
        t.setName("Worker thread  Gautam kushwaha ");
        t.start();
    }
}
