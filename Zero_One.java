import java.util.*;

public class Zero_One {
    public static void main(String[] args) {
        int[] input = {1,0,1,1,0,1,1,1,0};

        Map<Character, Integer> mp = new HashMap<>();
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            mp.put(ch, ch - 'A' + 1);
        }

        StringBuilder res = new StringBuilder();
        int c = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] != 0) {
                c++;
            } else {
                // streak ended → append letters for that streak
                if (c > 0) {
                    for (int j = 1; j <= c; j++) {
                        char key = (char) ('A' + j - 1);
                        res.append(key);
                    }
                }
                c = 0;
            }
        }

        // handle case if array ends with a streak
        if (c > 0) {
            for (int j = 1; j <= c; j++) {
                char key = (char) ('A' + j - 1);
                res.append(key);
            }
        }

        System.out.println(res.toString());
    }
}
