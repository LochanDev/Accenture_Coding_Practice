import java.util.*;

public class Square_Pallindrome {
    private static boolean pal (int n){
        int k = n, res = 0;
        while(n > 0){
            int d = n % 10;
            res = res * 10 + d;
            n /= 10;
        }
        return res == k;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = n;
        while(Math.sqrt(n) != Math.ceil(Math.sqrt(n)) || !pal(n)){
            n++;
        }
        System.out.println(Math.abs(n - p));
    }
}