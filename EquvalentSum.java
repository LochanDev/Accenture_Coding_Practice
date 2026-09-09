import java.util.*;
public class EquvalentSum{

    public static long fun(int n){
        String s = String.valueOf(n);
        long res = 0;

        for(int i = 1 ; i <= s.length() ; i++){
            res += Long.parseLong(s.substring(0,i));
        }
        return res;
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer>l1 = new ArrayList<>();

    int n = 112;

    for(int x = 1 ; x < n ; x++){
          if(fun(x) > n){
        l1.add(x);
    }
    }
  

    System.out.println(l1);

}
}