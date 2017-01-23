import java.util.ArrayList;
import java.util.Arrays;

/**
 * First Missing Integer
 *
 * Given an unsorted integer array, find the first missing positive integer.
 *
 * Example:
 * Given
 * [1,2,0] return 3,
 * [3,4,-1,1] return 2,
 * [-8, -7, -6] returns 1
 *
 * Your algorithm should run in O(n) time and use constant space.
 *
 * [interviewbit]
 * https://www.interviewbit.com/problems/first-missing-integer/
 */
public class FirstMissingPositiveInteger {
  public static void main(String[] args){
    ArrayList<Integer> a = new ArrayList<Integer>();
    a.addAll(Arrays.asList(3, 4, -1, 1));

    FirstMissingPositiveInteger f = new FirstMissingPositiveInteger();
    int missingNumber =f.firstMissingPositive(a);

    System.out.println("Missing No: "+ missingNumber);
  }

  public int firstMissingPositive(ArrayList<Integer> a){
    int n = a.size(); // size of n

    for(int i = 0; i < n; i++){
      if(a.get(i) > 0 && a.get(i) <= n){
        int val = a.get(i);
        if(val-1 != i && a.get(val-1) != val){
          // swap
          int temp = a.get(val-1);
          a.set(val-1, val);
          a.set(i, temp);
          i--;
        }
      }
    }

    for(int i = 0; i < n; i++){
      if(a.get(i) != i+1) {
        return i + 1;
      }
    }

    return n+1;
  }
}
