import java.util.*;
public class Sum_Odd_Fib{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n for Fib: ");
        int n = sc.nextInt();
        int c1 = 0 , c2 = 1;
        int s = 0;
       // System.out.print(c1+" ");
       if(n < 1){
        System.out.println(s);
       }
        if(n > 1){ 

            //  System.out.print(c2+" ");
        
        for(int i = 2 ; i < n ; i++){
            int curr = c1 + c2;
            // System.out.print(curr+" ");
            if(curr % 2 != 0){
                s += c1;
            }
            
            c1 = c2;
            c2 = curr;
        }
    }
    System.out.print("SUM: "+c1);
    
    }
}