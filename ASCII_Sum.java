import java.util.*;
public class ASCII_Sum{

    private static void fun(List<String> arr){
        List<Integer> l1 = new ArrayList<>();
        int s;
        for(String wrd : arr){
             s = 0;
            for(int i = 0 ; i < wrd.length() ; i++){
                char ch = wrd.charAt(i);
                int cd = (int) ch;
                s += cd;
            }
            l1.add(s);
        }
        Map<Integer,String> mp = new HashMap<>();
        int n = arr.size();
        int k = 0;
        while(k < n){
            mp.put(l1.get(k),arr.get(k));
            k++;
        }
        for(Map.Entry<Integer,String> ent : mp.entrySet()){
            System.out.println(ent.getKey()+" : "+ ent.getValue());
        }
        Collections.sort(l1);
        List<String> res = new ArrayList<>();
        for(int el : l1){
            res.add(mp.get(el));
        }
        System.out.println(res);
        // for(int el : l1){
        //     System.out.println(el);
        // }
    }
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>(Arrays.asList("apple","bat","cat","dog"));
        fun(arr);
    }
}