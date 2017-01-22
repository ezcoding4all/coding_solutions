import java.util.Arrays;
import java.util.List;

/**
 * Max Sum Contiguous Subarray
 *
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 * For example:
 *
 * Given the array [-2,1,-3,4,-1,2,1,-5,4],
 *
 * the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 * For this problem, return the maximum sum.
 *
 * [interviewbit]
 * https://www.interviewbit.com/problems/max-sum-contiguous-subarray/
 *
 */

class MaxSumSubarray {
  public static void main(String[] args) {
    MaxSumSubarray sub = new MaxSumSubarray();

    List<Integer> input = Arrays.asList(-2, 1, -3, 4, -1, 2, 1, -5, 4);

    int sum = sub.maxSubArray(input);

    System.out.print("Sum: "+ sum);

  }

  public int maxSubArray(final List<Integer> a){
    int maxSum = Integer.MIN_VALUE;
    int sum = 0;
    // iterate n times
    for(int i=0; i < a.size(); i++){
      sum = sum + a.get(i);
      if(maxSum < sum){
        maxSum = sum; // if sum is greater then set maxSum to sum
      }
      if(sum < 0){
        sum = 0; // reset sum to 0
      }
    }

    return maxSum;
  }

}