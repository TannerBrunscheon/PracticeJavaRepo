import java.util.Arrays;
import java.util.Scanner;

import static sun.misc.Version.print;

public class largestelements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i<test; i++){
            int size = sc.nextInt();
            int numLarge = sc.nextInt();
            int[] arr = new int[size];
            for(int j =0; j<size; j++){
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            for (int j = size-1; j > (size-numLarge-1);j--){
                System.out.print(arr[j] +" ");
            }

        }

    }
}
