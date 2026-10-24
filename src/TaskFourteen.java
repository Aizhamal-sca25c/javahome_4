import java.util.Scanner;

public class TaskFourteen {
    public static int transformDigits(int n) {
        int result = 0;
        int place = 1;

        while (n > 0) {
            int digit = n % 10;

            if (digit % 2 == 0) {
                digit++;
            } else {
                digit--;
            }

            result += digit * place;
            place *= 10;
            n /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(transformDigits(n));
    }
}
