import java.util.ArrayList;

/**
 * Combinations
 *
 * https://www.interviewbit.com/problems/combinations/
 */
public class Combinations {

  public ArrayList<ArrayList<Integer>> combine(int n, int k) {
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();

    if(n <= 0 || n < k){
      return result;
    }

    ArrayList<Integer> stack = new ArrayList<>();

    search(n, k, 1, stack, result);

    return result;
  }

  public void search(int n, int k, int start, ArrayList<Integer> stack, ArrayList<ArrayList<Integer>> result) {
    if (stack.size() == k) {
      result.add(new ArrayList<>(stack));
      return;
    }

    for (int i = start; i <= n; i++) {
      stack.add(i);
      search(n, k, i + 1, stack, result);
      stack.remove(stack.size() - 1);
    }
  }
}
