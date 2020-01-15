package sort;

import java.util.Arrays;

/**
 * @author bjfenglihang
 */
public class MergeSort {
    public static int[] mergeSort(int[] array) {
        int len = array.length;
        if (len < 2) {
            return array;
        }
        int mid = len / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, len);
        return merge(mergeSort(left), mergeSort(right));
    }

    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        for(int index = 0, i = 0, j = 0; index < result.length; index++) {
            if (i >= left.length) {
                result[index] = right[j++];
            } else if (j >= right.length) {
                result[index] = left[i++];
            } else if (left[i] >= right[j]) {
                result[index] = right[j];
                j++;
            } else if (left[i] < right[j]){
                result[index] = left[i];
                i++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {2, 1, 4, 3, 5, 6};
        int[] result = mergeSort(array);
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
