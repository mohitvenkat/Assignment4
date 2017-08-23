import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prog4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b = sc.nextInt();

        List odd = new ArrayList<>();
        List even = new ArrayList<>();

        for(;a<=b;a++)
        {
            if(a%2==0)
                even.add(a);
            else
                odd.add(a);
        }
        System.out.println("Odd List:"+ odd);
        System.out.println("Even List:"+ even);

    }
}
