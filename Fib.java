import java.util.*;
public class Fib {
    public static void fun (int n){
        if(n < 1){
            System.out.println(0);
        }
        else{
            int c1 = 0 , c2 = 1, curr;
            System.out.println(c1);
            System.out.println(c2);
            for(int i = 2 ; i < n ; i++){
                curr = c1 + c2;
                System.out.println(curr);
                c1 = c2;
                c2 = curr;
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fun(n);
    }
}
