import java.util.Scanner;

public class TaskEight {
    public static String decimalToBinary(int n) {
        if (n == 0) {
            return "0";
        }

        String binary = "";

        while (n > 0) {
            binary = (n % 2) + binary;
            n /= 2;
        }

        return binary;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println("Binary = " + decimalToBinary(n));
    }
}
