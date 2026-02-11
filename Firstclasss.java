// This Java program prints a rectangle of asterisks with n rows and m columns.

public class Firstclasss {

    public static void main(String args[]) {
        int n = 4;
        int m = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}