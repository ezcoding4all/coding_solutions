import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Find Duplicate in Array
 *
 * Given a read only array of n + 1 integers between 1 and n, find one number that repeats in linear time using less than O(n) space and traversing the stream sequentially O(1) times.
 *
 * Sample Input: [3 4 1 4 1]
 * Output: Either 4 Or 1 (Both are correct)
 *
 * If there are multiple possible answers ( like in the sample case above ), output any one.
 * If there is no duplicate, output -1
 *
 * [interviewbit]
 * https://www.interviewbit.com/problems/find-duplicate-in-array/
 */
public class DuplicateNumber {
  public static void main(String[] args){
    List<Integer> a = Arrays.asList(3, 4, 1, 4, 1);

    DuplicateNumber dn = new DuplicateNumber();

    int duplicateNumber = dn.repeatedNumber(a);

    System.out.println("Duplicate Number: " + duplicateNumber);
  }

  public int repeatedNumber(final List<Integer> a) {
    // Hash set as unique storage
    HashSet<Integer> dataSet = new HashSet<Integer>();

    // iterate list
    for(int i=0; i < a.size(); i++){
      if(!dataSet.add(a.get(i))){
        return a.get(i);
      }
    }

    return -1; // return default -1
  }
}
