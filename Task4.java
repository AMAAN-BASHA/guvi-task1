import java.util.Scanner;
public class Task4{
    // program to get the reversed number
    public static void main( String [] args) {
        System.out.println("Enter the number needed to be reversed : ");
        Scanner sc = new Scanner ( System.in );
        System.out.println("Enter the first number:");
        int a = sc.nextInt();

        System.out.println("Enter the second number:");
        int b = sc.nextInt();

        System.out.println("Enter the third number:");
        int c = sc.nextInt();

        int smallest;

        if (a < b && a < c) {
            smallest = a;
        } else if (b < a && b < c) {
            smallest = b;
        } else {
            smallest = c;
        }

        System.out.println("The smallest number is: " + smallest);
    }
}


