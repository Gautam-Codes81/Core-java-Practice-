import java.util.*;

import javax.annotation.processing.SupportedOptions;

public class cwh_81_Specific_Exeption {
    public static void main(String[] args) {
        int marks[] = new int[3];
        marks[0] = 80;
        marks[1] = 56;
        marks[2] = 30;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array index");
        int ind = sc.nextInt();
        System.out.println("enter the number you want to divide the value with");
        int number = sc.nextInt();

        try {
            System.out.println("the value at array index entered is:" + marks[ind]);
            System.out.println("the Value of array - value/number is " + marks[ind] / number);
        } catch (ArithmeticException e) {
            System.out.println();
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of Boundex exeption");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Some other exeption occured");
            System.out.println(e);
        }

    }
}
