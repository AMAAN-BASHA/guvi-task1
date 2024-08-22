import java.util.Scanner;
public class Task2 {
    // program to check the given number is positive or negative
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value needed");
        int n = scanner.nextInt();
        if (n>0)//checks the given number is positive or negative
        {
            System.out.println("Given number is positive.");
        }
        else
        {
            System.out.println("Given number is negative.");
        }
    }
}
