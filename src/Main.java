import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int temp = 0;
            int total = 0;
            for(int j = 0; j <= n; j++){
                total = (int) (a + Math.pow(2, i)*b);
                temp =+ total;
                System.out.print(total);
            }

        }
    }
}