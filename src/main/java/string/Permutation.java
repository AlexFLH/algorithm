package string;

import java.util.ArrayList;
import java.util.TreeSet;

public class Permutation {
    public static ArrayList<String> permutation(String temp) {
        ArrayList<String> tmp = new ArrayList<String>();
        if(temp == null || temp.length() == 0) {
            return tmp;
        }
        char[] charArray = temp.toCharArray();
        TreeSet<String> treeSet = new TreeSet<String>();
        permutationCore(charArray, treeSet, 0);
        tmp.addAll(treeSet);
        return tmp;
    }

    public static void permutationCore(char[] charArray, TreeSet<String> treeSet, int loc) {
        if(charArray == null || charArray.length == 0 || loc < 0 || loc > charArray.length - 1) {
            return;
        }
        if(loc == charArray.length - 1) {
            treeSet.add(String.valueOf(charArray));
        } else {
            for (int i = loc;i < charArray.length; i++) {
                swap(charArray, i, loc);
                permutationCore(charArray, treeSet, loc + 1);
                swap(charArray, i, loc);
            }
        }
    }

    public static void swap(char[] charArray, int i, int j) {
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
    }

    public static void main(String[] args) {
        String temp = "abc";
        System.out.println(permutation(temp));
    }
}
