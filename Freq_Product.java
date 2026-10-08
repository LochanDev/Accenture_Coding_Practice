import java.util.*;
public class Freq_Product{
    public static void main(String[] args) {
        System.out.println(Solution("ababc"));
    }
    public static int Solution(String s){
        int res = 0;
        Map<Character,Integer> mp = new HashMap<>();
        for(char ch : s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+ 1);
        }
        for(Map.Entry<Character,Integer> ent : mp.entrySet()){
            char k = ent.getKey();
            int v =     ent.getValue();

            int md = (((int) k) * v ) % 5;
            if(md != 0){
                res += md; 
            }
        }
        return res;
    }
}