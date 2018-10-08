package Random;

public class AnagramMappings {

    public static int[] anagramMappings(int[] A, int[] B) {
        int[] P = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            int num = A[i]; // num is the number we're looking for in B
            for (int j = 0; j < B.length; j++) {
                if (num == B[j]) { // if we find the num from A, then get the index of it when its in B
                    P[i] = j;
                }
            }
        }
        return P;
    }

    public static void main(String[] args) {
        int[] A = {12, 28, 46, 32, 50};
        int[] B = {50, 12, 32, 46, 28};

        int[] result = anagramMappings(A, B);

        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}
