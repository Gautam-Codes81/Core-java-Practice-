import java.util.*;

public class cwh_80_try_catch {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array index");
        int ind = sc.nextInt();
        System.out.println("enter the number you want to divide the value with");
        int number = sc.nextInt();
        try {
            System.out.println("the value at array index entered is:" + marks[ind]);
            System.out.println("the Value of array - value/number is " + marks[ind] / number);
        } catch (Exception e) {
            System.out.println("Some exception");
        }

    }
}
