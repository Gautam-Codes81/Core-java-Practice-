interface MyCamera2 {
    void takeSnap();

    void RecordVidio();

    private void greet() {
        System.out.println("good morning");
    }

    default void Record4kVidio() {
        greet();
        System.out.println("Recording in 4k...vidio");
    }
}

interface MycellPhone2 {
    public void gautamsnap();

    public void ritiksnap();
}

class MySmartPhone2 implements MyCamera2, MycellPhone2 {
    public void takeSnap() {
        System.out.println("Taking snap");
    }

    public void RecordVidio() {
        System.out.println("recording vidio");
    }

    @Override
    public void gautamsnap() {
        System.out.println("gautam is snapping");

    }

    public void ritiksnap() {
        System.out.println("again gautam snapping");
    }

}

public class cwh_59_polymorphism_interface {
    public static void main(String[] args) {
        MyCamera2 c = new MySmartPhone2();
        // c.gautamsnap();
        // c.ritiksnap();

        c.takeSnap();
        c.Record4kVidio();
        c.RecordVidio();
    }
}
