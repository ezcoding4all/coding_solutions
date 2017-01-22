import java.util.ArrayList;
import java.util.Arrays;

/**
 * Max Non Negative SubArray
 *
 * Find out the maximum sub-array of non negative numbers from an array.
 * The sub-array should be continuous. That is, a sub-array created by choosing the second and fourth element and skipping the third element is invalid.
 *
 * Maximum sub-array is defined in terms of the sum of the elements in the sub-array. Sub-array A is greater than sub-array B if sum(A) > sum(B).
 *
 * Example:
 * A : [1, 2, 5, -7, 2, 3]
 * The two sub-arrays are [1, 2, 5] [2, 3].
 * The answer is [1, 2, 5] as its sum is larger than [2, 3]
 *
 * [interviewbit]
 * https://www.interviewbit.com/problems/max-non-negative-subarray/
 */
public class MaxSumSubArrayNonNegative {

  public static void main(String[] args){
    MaxSumSubArrayNonNegative m = new MaxSumSubArrayNonNegative();


    ArrayList<Integer> a = new ArrayList<Integer>();
    a.addAll(Arrays.asList(1, 2, 5, -7, 2, 3));

    ArrayList<Integer> result = m.maxset(a);
    System.out.println("Max Non-Negative Array: "+result.toString());
  }

  public ArrayList<Integer> maxset(ArrayList<Integer> a) {
    long maxSum = Long.MIN_VALUE;
    long sum = Long.MIN_VALUE;
    int iStart=0, iEnd = 0, iCnt = 0;
    int start=0, end = 0, cnt = 0;
    for(int i=0; i < a.size(); i++){
      // Check current value is not negative
      if(a.get(i) > -1){
        if(sum == Long.MIN_VALUE){
          start = i;
          end = i;
          sum = 0;
        }else{
          end++;
        }
        sum = sum + a.get(i);
      }else{
        sum = Long.MIN_VALUE;
      }

      if(maxSum < sum){
        iStart = start;
        iEnd = end;
        maxSum = sum;
      }else if(maxSum == sum){
        iCnt = iEnd - iStart;
        cnt = end - start;

        if(iCnt < cnt){
          iStart = start;
          iEnd = end;
          maxSum = sum;
        }
      }
    }

    ArrayList<Integer> result = new ArrayList<Integer>();

    if(maxSum > -1){
      while (iStart <= iEnd){
        result.add(a.get(iStart));
        iStart++;
      }
    }

    return result;
  }
}
