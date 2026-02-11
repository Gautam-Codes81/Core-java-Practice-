
/*class MythreadRunnable implements Runnable {
    public void run() {
        System.out.println("i am a thread 1 not a thread 1");
    }
}

class MythreadRunnable1 implements Runnable {
    public void run() {
        System.out.println("i am a thread 1 not a thread 2");
    }
}

public class cwh_71_Thread_runnable {
    public static void main(String[] args) {
        MythreadRunnable bullet = new MythreadRunnable();
        Thread gun = new Thread(bullet);
        MythreadRunnable1 bullet2 = new MythreadRunnable1();
        Thread gun2 = new Thread(bullet2);
        gun.start();
        gun2.start();
    }
} */

/*class Mythread implements Runnable {
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "_" + Thread.currentThread().getName());
        }
    }
}

/*
 * class gautamthread implements Runnable {
 * public void run() {
 * System.out.println("THREAD IS VERY FAST ");
 * System.out.println("THREAD IS VERY SLOW WORK  ");
 * System.out.println("THREAD IS BOTH WORK FAST AND SLOW ");
 * System.out.println("THREAD IS VERY FAST3 ");
 * System.out.println("THREAD IS VERY SLOW WORK4 ");
 * System.out.println("THREAD IS BOTH WORK FAST AND SLOW 5 ");
 * 
 * }
 * }
 * 
 * public class cwh_71_Thread_runnable {
 * 
 * public static void main(String[] args) {
 * Mythread t = new Mythread();
 * Thread t1 = new Thread(t);
 * t1.start();
 * gautamthread gk = new gautamthread();
 * Thread gk2 = new Thread(gk);
 * gk2.start();
 * }
 * }
 */

/*class studentthread implements Runnable {
    public void run() {
        System.out.println("students sallary 500000");
        System.out.println("student course name B_tec computer Science");
        System.out.println("student become to full stack software developer");
    }
}

class gautamstudentthread implements Runnable {
    public void run() {
        System.out.println(" gautam is a students gautam wanted to become a software developer");
        System.out.println(" gautam wanted to high sallery to the company");
        System.out.println(" gautam developer ki sallary 500000");

    }
}

public class cwh_71_Thread_runnable {

    public static void main(String[] args) {
        studentthread stu = new studentthread();
        Thread stu1 = new Thread(stu);
        gautamstudentthread gau = new gautamstudentthread();
        Thread gautam = new Thread(gau);
        stu1.start();
        gautam.start();

    }
} */

class gautamthread implements Runnable {
    public void run() {
        int i = 1;
        while (i < 50) {
            System.out.println("this is thread is runable");
            i++;
        }
        System.out.println("my name gautam coder");
    }
}

class gautamthread2 implements Runnable {
    public void run() {
        System.out.println("gautam is runnable thread");
        System.out.println("thread is runnable is very good");
    }
}

public class cwh_71_Thread_runnable {

    public static void main(String[] args) {
        gautamthread gk = new gautamthread();
        Thread g = new Thread(gk);
        gautamthread2 gk2 = new gautamthread2();
        Thread g2 = new Thread(gk2);
        g.start();
        g2.start();
    }
}