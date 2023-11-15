import java.util.Random;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = random.nextInt(1,10);
        int m = random.nextInt(1,10);
        int [][] arr = new int [n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(10);
            }
        }

        for(int [] temp: arr){
            for(int temp1: temp )
                System.out.print(temp1 + " ");
            System.out.println();
        }

        System.out.println();


        System.out.print("plus = ");
        int plus = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] += plus;
            }
        }

        for(int[] temp: arr) {
            for (int temp1 : temp)
                System.out.print(temp1 + " ");
            System.out.println();
        }

        int sum = 0;
        for(int[] temp: arr)
            for(int temp1: temp)
                sum += temp1;

        System.out.println("sum = " + sum);
    }
}
