import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        for (int i = 0; i < n ; i++) {
            for (int j = n; j > n - i - 1; j--) {
                System.out.print(j);}
                for (int k = i + 1; k < n; k++) {
                    System.out.print( n - i);}
            System.out.println();
        }
    }
}