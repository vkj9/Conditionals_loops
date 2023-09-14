import java.util.Scanner;

public class LargestUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temp;
        int largestNumber = 0;
        int num = input.nextInt();
        while(num>0){
            temp = num;
            num= input.nextInt();
            largestNumber = Math.max(num, temp);
        }
        System.out.println("Largest input number:- "+largestNumber);
    }
}
