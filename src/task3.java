import java.util.Random;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m;
        int n;
        System.out.print("n = ");
        n = scanner.nextInt();
        System.out.print("m = ");
        m = scanner.nextInt();
        int[][] arr = new int [n][m];

        int in = 0;
        boolean flag = true;

        for (int i = 0; i < arr.length; i++, flag = !flag) {
            if(flag)
            for (int j = 0; j < arr[i].length; j++, in++) {
                arr[i][j] = in;
            }
            else
                for (int j = arr[i].length - 1; j >= 0; j--, in++) {
                    arr[i][j] = in;
                }
        }

        for (int[] temp: arr) {
            for (int temp1: temp) {
                System.out.print(temp1 + " ");
            }
            System.out.println();
        }








    }
}
