import java.util.*;
public class Digit_Sum{

    private static int Solution(int[] arr , int n){
        int s = 0;
        for(int el : arr)   s += el;
        while(s > 9){
            s = (s / 10) + (s % 10);
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)    arr[i] = sc.nextInt();
        System.out.println(Solution(arr,n));
    }
}