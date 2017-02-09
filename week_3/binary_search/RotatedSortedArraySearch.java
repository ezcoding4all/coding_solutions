import java.util.Arrays;
import java.util.List;

/**
 * Rotated Sorted Array Search
 *
 * https://www.interviewbit.com/problems/rotated-sorted-array-search/
 */
public class RotatedSortedArraySearch {

  public static void main(String[] args){

    RotatedSortedArraySearch r = new RotatedSortedArraySearch();

    int ind = r.search(Arrays.asList(4, 5, 6, 7, 2, 2, 2), 2);

    System.out.println(ind);
  }

  public int search(final List<Integer> a, int b) {
    int left = 0;
    int right = a.size() - 1;

    while (left <= right){
      int mid = (left + right)/2;

      int midVal = a.get(mid);
      int leftVal = a.get(left);
      int rightVal = a.get(right);

      if(b == midVal){
        return mid;
      }

      if(leftVal < midVal){
        if(leftVal <= b && b < midVal){
          right=mid-1;
        }else{
          left=mid+1;
        }
      }else if(leftVal > midVal){
        if(midVal < b && b <= rightVal){
          left=mid+1;
        }else{
          right=mid-1;
        }
      }else{
        left++;
      }

    }

    return -1;
  }
}
