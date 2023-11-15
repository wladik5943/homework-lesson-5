public class task2 {
    public static void main(String[] args) {
        String[][] arr = new String[8][8];
        boolean flag = true;
        for (int i = 0; i < arr.length; i++, flag = !flag) {
            for (int j = 0; j < arr[i].length; j++,flag = !flag) {
                if(flag)
                    arr[i][j] = "W";
                else
                    arr[i][j] = "B";
            }
        }
        for (String[] temp: arr) {
            for (String temp1: temp) {
                System.out.print(temp1 + " ");
            }
            System.out.println();
        }
    }
}
