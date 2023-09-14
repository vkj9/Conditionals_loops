import java.util.Scanner;

public class PermutationsCombinations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of n:- ");
        int n = input.nextInt();
        System.out.println("Enter value of r:- ");
        int r =input.nextInt();
        permutation(n,r);
        combination(n,r);
    }

    private static void combination(int n, int r) {
        long comb = factorial(n) / factorial(r) *factorial(n-r);
        System.out.println("Combination is:- "+comb);

    }
    private static void permutation(int n, int r) {
        long perm = factorial(n)/factorial(n-r);
        System.out.println("permutation is:- "+perm);
    }

    private static long factorial(int n) {
        long factorial=1;
        long temp;
        if(n==0){
            return 1L;
        }
        else{
            while (n>1){
                temp = (long) n * (n-1);
                factorial=factorial*temp;
                n = n-2;
            }
    }
        return factorial;
    }}
