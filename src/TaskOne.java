import java.util.Scanner;

public class TaskOne {
    public static void printStrip(int n, char m){
        for(int i=0; i<=n; i++){
            System.out.print(m);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        printStrip(7,'#');

    }
}
