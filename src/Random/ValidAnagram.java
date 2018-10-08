package Random;

import java.util.*;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {

        // if the lengths of strings arent equal, we know they aren't anagrams
        if (s.length() != t.length()) return false;

        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (!map.containsKey(t.charAt(i)))
                return false;
            else
                map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
        }

        // the values of each char, assuming its an anagram, should be 0
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "aabb";
        String t = "abba";

        System.out.println(isAnagram(s, t));
    }
}
