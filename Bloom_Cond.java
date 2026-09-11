import java.util.Arrays;
import java.util.Scanner;

class Bloom_Cond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Create a copy so original values are used for every comparison
        int[] original = arr.clone();

        for (int i = 0; i < n; i++) {

            int s = 0;
            int l = 0;
            int sam = 0;

            // int ref = original[i];

            for (int j = 0; j < n; j++) {

                if (original[j] < original[i]) {
                    s++;
                }
                else if (original[j] > original[i]) {
                    l++;
                }
                else {
                    sam++;
                }
            }

            // Zero the element if it is not balanced
            if (!(s == l && sam <= 2)) {
                arr[i] = 0;
            }
        }

        int sum = 0;

        for (int x : arr) {
            sum += x;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Sum = " + sum);
    }
}