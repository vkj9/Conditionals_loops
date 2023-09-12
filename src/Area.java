import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter radius of circle");
        int r = input.nextInt();
        areaOfCircle(r);
        System.out.println("enter base of triangle");
        int a = input.nextInt();
        System.out.println("enter height of triangle");
        int b = input.nextInt();
        areaOfTriangle(a,b);
        System.out.println("Enter length of rectangle");
        int l = input.nextInt();
        System.out.println("enter breadth of rectangle");
        int br =input.nextInt();
        areaOfRectangle(l,br);
        System.out.println("enter base of parallelogram");
        int bp = input.nextInt();
        System.out.println("enter height of parallelogram");
        int hp = input.nextInt();
        areaOfParallelogram(bp,hp);


    }

    private static void areaOfParallelogram(int bp, int hp) {
        double area = bp*hp;
        System.out.println("Area of parallelogram:- "+area);
    }

    private static void areaOfRectangle(int l, int br) {
        double area = l*br;
        System.out.println("Area of rectangle:- "+area);
    }

    private static void areaOfTriangle(int base, int height) {
        double area = 0.5 * base *height;
        System.out.println("Area of triangle is:- " +area);
    }

    private static void areaOfCircle(int r) {
        double area = Math.PI * r *r;
        System.out.println("Area of circle is :- "+area);
    }



}
