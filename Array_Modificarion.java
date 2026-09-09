import java.util.*;
public class Array_Modificarion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        long s = 0;
        for(int i = 0 ; i < n ; i++ ){
            long x = arr[i] - (i % 7 ) * 3;
            if(arr[i] % 11 == 0){
                 x += arr[i] / 11;
            }
            s += x;
        }
        System.out.println(s);
    }
}