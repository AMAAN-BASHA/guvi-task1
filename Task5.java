import java.util.Scanner;
public class Task5{
    // program to calculate the final amount as per the discount
    public static void main(String [] args){
        System.out.println("Enter the purchase amount:");
        Scanner s = new Scanner(System.in);
        int purchaseAmount = s.nextInt();
        int discount=0;
        if ( purchaseAmount < 500)
        {
            discount = 0;
        }
        if ( purchaseAmount >= 500 && purchaseAmount <=1000){
            discount = purchaseAmount * 10 / 100;
        }
        if ( purchaseAmount >1000 ){
            discount = purchaseAmount * 20 / 100;
        }
        System.out.println("Final payable amount:" + (purchaseAmount-discount));
    }
}
