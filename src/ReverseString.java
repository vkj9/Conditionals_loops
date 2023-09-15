import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String to reverse:- ");
        String str = input.next();
        reverseString(str);
    }

    private static void reverseString(String str) {
        int stringlength = str.length();
        String revstr = "";
        for(int i=stringlength-1;i>=0;i--){
            revstr = revstr + str.charAt(i);
        }
        System.out.println("Reversed string is :- "+revstr);
    }

}
