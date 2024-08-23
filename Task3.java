import java.util.Scanner;
public class Task3{
    // program to reverse the given number
    public static void main( String [] args ){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the value needed to be reversed:");
    int n = s.nextInt();
    int r = 0;
    while( n != 0){
        int r1 = n % 10;
        r = r * 10 + r1;
        n /= 10;
    }
    System.out.println("Reversed number:" + r);
    }
}