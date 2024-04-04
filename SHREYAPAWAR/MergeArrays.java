import java.util.Arrays;

public class MergeArrays {
    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;

        int i = m - 1;
        int j = n - 1;
        int k = m - 1;

        while (i >= 0 && j >= 0) {
            if (X[i] != 0) {
                X[k--] = X[i--];
            } else {
                if (X[i] == 0 && X[k] != 0) {
                    X[k--] = Y[j--];
                } else {
                    i--;
                }
            }
        }

        while (j >= 0) {
            X[k--] = Y[j--];
        }
        Arrays.sort(X);
    }

    public static void main(String[] args) {
        int[] X = { 0, 2, 0, 3, 0, 5, 6, 0, 0 };
        int[] Y = { 1, 8, 9, 10, 15 };

        mergeArrays(X, Y);

        System.out.println(Arrays.toString(X));
    }
}
