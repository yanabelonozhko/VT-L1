package task8;

public class Merger {
    public static int[] GetIndex(int[] a, int[] b) {
        int[] indexes = new int[b.length];
        int i = 0;
        for (int j = 0; j < a.length; ++j) {
            for (int k = i; k < b.length; ++k) {
                if (b[k] <= a[j]) {
                    indexes[i] = j;
                    ++i;
                } else {
                    break;
                }
            }
        }
        for (int k = i; k < b.length; ++k) {
            indexes[i] = a.length;
            ++i;
        }
        return indexes;
    }
}
