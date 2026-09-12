import java.util.Scanner;

public class RunningSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int s = 0 , c = 0;
        for(int i = 1 ; i <= n ; i++){
            s += i;
            if(s % 5 == 0){
                c++;
            }
        }
        System.out.println("Running sum: "+s+"\n"+"Counter: "+c);
    }
}
