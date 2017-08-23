import java.util.Scanner;

public class Prog3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b = sc.nextInt();
        sum(a,  b);

    }

    private static void sum(int a, int b) {
        System.out.println("First Number is: "+ a);
        System.out.println("Second Number is: "+ b);
        int sum = a+b;
        System.out.println("Sum is: "+ sum);
    }
}
