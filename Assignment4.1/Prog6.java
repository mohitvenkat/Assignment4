import java.util.Scanner;

public class Prog6 {
    static int sum;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sum(a,  b);
        sum(a,b,c);

    }

    private static void sum(int a, int b) {
        System.out.println("First Number is: "+ a);
        System.out.println("Second Number is: "+ b);
        sum = a+b;
        System.out.println("Sum of two args is: "+ sum);
    }

    private static void sum(int a, int b,int c) {
        System.out.println("First Number is: "+ a);
        System.out.println("Second Number is: "+ b);
        System.out.println("Third Number is: "+ c);
        sum = a+b+c;
        System.out.println("Sum of three args is: "+ sum);
    }
}
