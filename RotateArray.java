import java.util.*;
public class RotateArray{

    private static void fun(int[] arr , int k){
        int res = 0;
        List<Integer> l1 = new ArrayList<>();
        for(int el : arr)   l1.add(el);
        k = k % arr.length; 
        while(k > 0){
            int pop = l1.remove(l1.size() - 1);
            l1.add(0,pop);
            k--;
        }
        System.out.println(l1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)    arr[i] = sc.nextInt();
        int k = sc.nextInt();
        fun(arr,k);
    }
}