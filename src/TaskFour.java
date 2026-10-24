import java.util.Scanner;

public class TaskFour {
    public static void printMatrix(int n, int m){
        int num =1;
        for(int i=1; i<=n;i++){
            for(int j=1; j<=m; j++){
                System.out.print(num + " ");
                num++;
            }

        }
        System.out.println();
    }
    public static void main(String[] args) {
        printMatrix(2,3);

    }
}
