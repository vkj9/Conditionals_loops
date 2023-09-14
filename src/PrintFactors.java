import java.util.Scanner;

public class PrintFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number:- ");
        int num = input.nextInt();
        printfactors(num);
    }

    private static void printfactors(int num) {
        int temp =0;
        for(int i=1;i<=9;i++){
            temp =num % i;
            if(temp==0) System.out.print(" "+i);
        }
    }
}
