import java.util.Scanner;

public class SumUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = 0;
        while (num!=0) {
            sum = sum+num;
            num= input.nextInt();
        }
        System.out.println("sum is:- "+sum);
    }
}
