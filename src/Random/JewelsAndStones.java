package Random;

import java.util.HashMap;
import java.util.Map;

public class JewelsAndStones {

    public static int numJewelsInStones(String J, String S) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < J.length(); i++) {
            if (!map.containsKey(J.charAt(i))) {
                map.put(J.charAt(i), 1);
            } else {
                map.put(J.charAt(i), map.get(J.charAt(i) + 1));
            }
        }

        int jewels = 0;

        for (int j = 0; j < S.length(); j++) {
            Character ch = S.charAt(j);
            if (map.containsKey(ch)) {
                jewels++;
            }
        }
        return jewels;
    }

    public static void main(String[] args) {
        String J = "aA";
        String S = "aAAbbbb";

        System.out.println(numJewelsInStones(J, S));
    }
}
