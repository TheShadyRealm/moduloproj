import java.util.*;
public class Modulo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number (integer): ");
        int m = sc.nextInt();
        System.out.print("Method (+ or *): ");
        String str = sc.next();
        System.out.println("-------");
        if(str.equals("+")) {
            for (int[] i : tablePlus(m)) {
                for (int j : i) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        } else if(str.equals("*")){
            for (int[] i : tableMult(m)) {
                for (int j : i) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Input a proper method!");
        }
    }
    public static int[][] tablePlus (int m){
        int[][] arr = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = (j+i) % m;
            }
        }
        return arr;
    }
    public static int[][] tableMult (int m){
        int[][] arr = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = (j*i) % m;
            }
        }
        return arr;
    }
}