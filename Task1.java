import java.util.Scanner;
public class Task1 {
    // program to print 10 to 50
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the value needed");
        int n = obj.nextInt();
        System.out.println("Enter the value needed");
        int m = obj.nextInt();
        for(int i = n ; i <= m; i++)
        {
            System.out.println(i);
        }
    }
}
