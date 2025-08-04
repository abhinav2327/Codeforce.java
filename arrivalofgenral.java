import java.util.*;
public class Arrivalofgenral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE, maxIndex = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

        int min = Integer.MAX_VALUE, minIndex = 0;
        for(int i = n - 1; i >= 0; i--) {
            if(arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }

        int swaps = maxIndex + (n - 1 - minIndex);
        if(maxIndex > minIndex) swaps--;

        System.out.println(swaps);
    }
}
