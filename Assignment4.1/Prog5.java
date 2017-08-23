import java.util.Scanner;

public class Prog5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input:");
        int mul = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(mul+"*"+i+"="+mul*i);
        }
    }
}
