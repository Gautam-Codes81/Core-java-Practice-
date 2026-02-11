import java.util.Scanner;
// import java.util.Random;

public class praticeset4 {

    public static void main(String[] args) {
        // Question; 1
        /*
         * byte m1, m2, m3;
         * Scanner sc = new Scanner(System.in);
         * System.out.println("enter your marks in Physics");
         * m1 = sc.nextByte();
         * System.out.println("enter your mark in chemistry ");
         * m2 = sc.nextByte();
         * System.out.println("enter your marks in mathmatics");
         * m3 = sc.nextByte();
         * float avg = (m1 + m2 + m3) / 3.f;
         * System.out.println("your Overall percentage is : + avg");
         * if (avg >= 40 && m2 >= 33 && m3 >= 33) {
         * System.out.println("congratulations, you have been promoted");
         * } else {
         * System.out.println("sorry,you have not promoted! please try again.");
         * }
         */
        // question 2

        /*
         * Scanner sc = new Scanner(System.in);
         * System.out.println("Enter your income in lakhs per annum");
         * float tax = 0;
         * float income = sc.nextFloat();
         * if (income <= 2.5) {
         * tax = tax + 0;
         * } else if (income > 2.5f && income <= 5f) {
         * tax = tax + tax + 0.05f * (income - 2.5f);
         * 
         * } else if (income > 5f && income <= 10.0f) {
         * tax = tax + 0.05f * (5.0f - 2.5f);
         * tax = tax + 0.2f * (income - 5f);
         * 
         * } else if (income > 10.f) {
         * tax = tax + 0.05f * (0.05f - 2.5f);
         * tax = tax + 0.2F * (10.0F - 5F);
         * tax = tax + 0.3f * (income - 10.0f);
         * }
         * System.out.println("the total tax paid by the employe is" + tax);
         * 
         */
        /*
         * Scanner sc = new Scanner(System.in);
         * System.out.print("Enter a 1 to 7 between nuber for print day :");
         * int day = sc.nextInt();
         * // System.out.print("Enter a 1 to 7 between nuber for print day :");
         * switch (day) {
         * case 1 -> System.out.println("monday");
         * case 2 -> System.out.println("tuesday");
         * case 3 -> System.out.println("wednesday");
         * case 4 -> System.out.println("thurday");
         * case 5 -> System.out.println("friday");
         * case 6 -> System.out.println("saturday");
         * case 7 -> System.out.println("sunday");
         * default -> System.out.println("invalid number");
         * 
         * }
         * System.out.println("Thank You ...");
         * 
         */
        System.out.print("helo gautam project");
        Scanner sc = new Scanner(System.in);
        String Website = sc.next();

        if (Website.endsWith(".org")) {
            System.out.println("this is organisation website");
        } else if (Website.endsWith(".com")) {
            System.out.print("this is a commercial website");
        } else if (Website.endsWith(".in")) {
            System.out.println("this is indian website");

        }
    }

}
