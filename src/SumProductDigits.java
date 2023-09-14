import java.util.Scanner;

public class SumProductDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int num = input.nextInt();
        sumProduct(num);
    }

    private static void sumProduct(int num) {
        int product =1;
        int sum =0;
        int temp =0;
        while(num>0){
            temp = num % 10;
            product = product*temp;
            sum=sum+temp;
            num = num/10;
        }
        int result = product - sum;
        System.out.println("Difference of product and sum:- " +result);
    }


}
