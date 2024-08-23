import java.util.Scanner;
public class Task1 {
    // program to print 10 to 50
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value needed");
        int n = scanner.nextInt();
        System.out.println("Enter the value needed");
        int m = scanner.nextInt();
        for(int i = n ; i <= m; i++)
        {
            System.out.println(i);
        }
    }
}
