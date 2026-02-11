// package;606

//import java.util.Scanner;

public class switch_case_control {
    public static void main(String[] args) {
        char var = 'c';

        switch (var) {
            case 'a':
                System.out.println("you are going to become adult");
                break;
            case 'c':
                System.out.println("you are going to join a job");
                break;
            case 'd':
                System.out.println("you are going to get retiered");
                break;
            default:
                System.out.println("enjoy your life");
        }
        System.out.println("thanks for using my java code");

        // question 1
        /*
         * int age;
         * System.out.println("enter your age");
         * Scanner sc = new Scanner(System.in);
         * age = sc.nextInt();
         * if (age > 56) {
         * System.out.println("you are exprienced!");
         * } else if (age > 46) {
         * System.out.println("you are semi-experince!");
         * } else if (age > 36) {
         * System.out.println("you are semi-semi-experience!");
         * } else {
         * System.out.println("you are not experienced");
         * }
         * if (age > 2) {
         * System.out.println("you are not baby");
         * }
         */

        // question 2

        /*
         * int age;
         * System.out.println("enter your age");
         * Scanner sc = new Scanner(System.in);
         * age = sc.nextInt();
         * switch (age) {
         * case 18:
         * System.out.println("you are going to become an adult!");
         * break;
         * case 23:
         * System.out.println("you are going to join a job!");
         * break;
         * case 60:
         * System.out.println("you are going to get retired!");
         * break;
         * default:
         * System.out.println("enjoy your life");
         * 
         * }
         */

    }

}
