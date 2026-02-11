/*interface Bicycle {
    void applyBrake(int decremet);

    void speedUp(int incriment);
}

interface hornBicycle {
    void blowhornk3g();

    void blowhormhn();
}

class AvonCycle implements Bicycle, hornBicycle {
    public void applyBrake(int decriment) {
        System.out.println("apply break");

    }

    public void speedUp(int incriment) {
        System.out.println("applying Speed");

    }

    public void blowhornk3g() {
        System.out.println("kabi kushi kabhi gam");
    }

    public void blowhormhn() {
        System.out.println("mai ho na po po po ");
    }
}

public class cwh_55_interface {
    public static void main(String[] args) {
        AvonCycle cycleharry = new AvonCycle();
        cycleharry.applyBrake(1);
        cycleharry.speedUp(2);
        cycleharry.blowhormhn();
        cycleharry.blowhornk3g();

    }
} */

interface seneiordeveloper {
    public void salary();

    public void music();

    public void song();

    default void greet() {
        System.out.println(" ritik hum logo ka guru nad sir hai ye sarapari hai gautam default hai");
    }

}

interface ritijavadeveloper {
    void salary2();

    public void music2();

    public void hobby();

    public void fullconsistency();
}

class juniordeveloper implements seneiordeveloper, ritijavadeveloper {
    public void salary() {
        System.out.println(" 5000");

    }

    public void greet() {
        System.out.println(" ritik is namasate");
    }

    public void salary2() {
        System.out.println("1 lekh per month");
    }

    public void music2() {
        System.out.println("saiyara song is very best by ritik gupta ");
    }

    public void hobby() {
        System.out.println("  i like playing cricket in the bbdu");
    }

    public void fullconsistency() {
        System.out.println(" full sonsistency is focus the study and focus the goal and whole");
    }

    public void music() {
        System.out.println(" hum tumhare hai sanam");
    }

    public void song() {
        System.out.println(" hum tumhare pyar mai mar jaunga");
    }
}

public class cwh_55_interface {

    public static void main(String[] args) {
        juniordeveloper gautamJuniordeveloper = new juniordeveloper();
        gautamJuniordeveloper.music();
        gautamJuniordeveloper.salary();
        gautamJuniordeveloper.song();
        gautamJuniordeveloper.salary2();
        gautamJuniordeveloper.music2();
        gautamJuniordeveloper.hobby();
        gautamJuniordeveloper.fullconsistency();
        gautamJuniordeveloper.greet();
    }
}