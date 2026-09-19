import java.util.*;
public class LastDigit_Equal {
    private static int fun (int n , int d){
        int c = 0;
        for(int x = 1 ; x <= n ; x++){
            if((x * x) % 10 == d){
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(fun(n,d));
    }
}
