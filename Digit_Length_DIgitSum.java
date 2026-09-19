import java.util.Scanner;

public class Digit_Length_DIgitSum {

    private static int fun (int[] arr){
        int res = 0;
        for(int el : arr){
            String s = String.valueOf(el);
            if(s.length() % 2 == 0){
                res += (s.length() * s.length());
            }
            else{
                for(int i = 0 ; i < s.length() ; i++){
                    res += s.charAt(i) - '0';
                } 
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)    arr[i] = sc.nextInt();
        System.out.println(fun(arr));
    }
}
