import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * 2 Sum
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 *
 * Input: [2, 7, 11, 15], target=9
 * Output: index1 = 1, index2 = 2
 *
 * [interviewbit]
 * https://www.interviewbit.com/problems/2-sum/
 */
public class TwoSum {
  public static void main(String[] args){
    TwoSum ts = new TwoSum();

    List<Integer> input = Arrays.asList(4, 7, -4, 2, 2, 2, 3, -5, -3, 9, -4, 9, -7, 7, -1, 9, 9, 4, 1, -4, -2, 3, -3, -5, 4, -7, 7, 9, -4, 4, -8);
    int target = -3;

    System.out.println(ts.twoSum(input, target).toString());
  }

  public ArrayList<Integer> twoSum(final List<Integer> a, int b) {
    HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
    ArrayList<Integer> result = new ArrayList<Integer>();

    for(int i=0; i < a.size(); i++){
      int diff = b - a.get(i);
      if(hashMap.containsKey(diff)){
        // get first index
        result.add(hashMap.get(diff));
        result.add(i + 1);

        return result;
      }else {
        if(!hashMap.containsKey(a.get(i))){
          hashMap.put(a.get(i), i+1);
        }
      }
    }

    return result;
  }
}
