package Random;

public class strStr {
    // Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

    public static int strStr(String haystack, String needle) {
        int length = needle.length();

        if (haystack.equalsIgnoreCase(needle)) {
            return 0;
        }

        for (int i = 0; i < haystack.length(); i++) {
            if (length + i > haystack.length()) return -1;
            String substring = haystack.substring(i, length + i);
            if (needle.equalsIgnoreCase(substring)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issi";

        System.out.println(strStr(haystack, needle));
    }
}
