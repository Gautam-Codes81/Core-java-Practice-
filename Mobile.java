
/*
 * static void foo() {
 * System.out.println("good morning bro");
 * 
 * }
 * 
 * static void foo(int a) {
 * System.out.println("good morning" + a + "bro");
 * 
 * }
 * 
 * 
 * public static void main(String[] args) {
 * foo();
 * foo(500);
 * } /*
 */

class Mobile {
    void call(long number) {
        System.out.println("calling contact" + number);
    }

    void call(String name) {

        System.out.println("calling contact" + name);

    }

    void call(long number, boolean record) {
        if (record)
            System.out.println("calling" + number + "with recording ON");
        else
            System.out.println("calling" + number);
    }

    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.call(9867543540L);
        m.call("rohit");
        m.call(9867543540L, true);
    }

}
