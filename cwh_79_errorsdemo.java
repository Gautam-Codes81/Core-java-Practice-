import javax.sound.sampled.SourceDataLine;

public class cwh_79_errorsdemo {
    // syntax error
    //
    // int a = 0 // no semicolon
    // b= 8; // Error: no data type define

    // logical error
    /*
     * public static void main(String[] args) {
     * System.out.println(2);
     * for (int i = 1; i < 5; i++) {
     * System.out.println(2 * i + 1);
     * }
     * }
     */
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        try {
            int c = a / b;
            System.out.println("the result is" + c);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("End of the program");
    }

}
