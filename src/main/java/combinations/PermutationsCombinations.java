package combinations;
import java.util.Stack;

public class PermutationsCombinations {
    public static Stack<Integer> stack = new Stack<Integer>();
    public static void main(String[] args) {
        int[] shu = { 1, 2, 3, 4 };
        functionCombination(shu, 4, 0);
        System.out.println("==========================");
        functionPermutations(shu, 4,0);
        System.out.println("==========================");
        functionChoicePermutations(shu, 3, 0 ,0);
        System.out.println("==========================");
    }

    /**
     *
     * @param shu
     * @param target 目标长度
     * @param cur 当前长度
     */
    private static void functionCombination(int[] shu, int target, int cur) {
        if (target == cur) {
            System.out.println(stack);
            return;
        }

        for (int i = 0; i<shu.length; i++) {
            stack.add(shu[i]);
            functionCombination(shu, target, cur + 1);
            stack.pop();
        }
    }

    private static void functionPermutations(int[] shu, int target, int cur){
        if (target == cur) {
            System.out.println(stack);
            return;
        }

        for (int i = 0; i<shu.length; i++) {
            if(!stack.contains(shu[i])){
                stack.add(shu[i]);
                functionPermutations(shu, target, cur + 1);
                stack.pop();
            }
        }
    }

    private static void functionChoicePermutations(int[] shu, int target, int has, int cur){
        if (has == target) {
            System.out.println(stack);
            return;
        }
        for(int i = cur; i < shu.length; i++) {
            if(!stack.contains(shu[i])) {
                stack.add(shu[i]);
                functionChoicePermutations(shu, target, has + 1, i);
                stack.pop();
            }
        }
    }
}
