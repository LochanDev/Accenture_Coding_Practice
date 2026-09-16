public class Permutation_String{
     static String ans = "";
     public static void permute(String s){
        if(s.length() == 0){
            System.out.println(ans);
        }
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);

            String res = s.substring(0,i) + s.substring(i+1);

            ans += ch;

            permute(res);

            ans = ans.substring(0,ans.length() - 1);
        }

    }

    public static void main(String[] args) {
        permute("ABC");
    }

}