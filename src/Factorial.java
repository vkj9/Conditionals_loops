import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long factorial=1;
        long temp = 0L;
        int num = input.nextInt();
        if(num==0){
            System.out.println("Factorial for input number is 1");
        }
        else{
        while (num>1){
            temp = (long) num * (num-1);
            factorial=factorial*temp;
            num = num-2;
        }
        System.out.println("Factorial for input number is "+factorial);
    }}
}
