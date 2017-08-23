import java.util.Arrays;
import java.util.Collections;

public class Prog8
{
    public static void main(String[] args)
    {

        Integer[] arr = {16, 7, 6, 8, 21, 9, 5, 100};

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Original Array is "+Arrays.toString(arr));
        System.out.printf("Array is descending Order :"+
                Arrays.toString(arr));
    }
}