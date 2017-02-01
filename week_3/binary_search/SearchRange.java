import java.util.ArrayList;
import java.util.List;

/**
 * Search for a Range
 *
 * https://www.interviewbit.com/problems/search-for-a-range/
 */
public class SearchRange {

  public ArrayList<Integer> searchRange(final List<Integer> a, int b) {

    ArrayList<Integer> range = new ArrayList<>();

    binarySearch(a, 0, a.size() - 1, b, range);

    if(range.size() == 0){
      range.add(-1);
      range.add(-1);
    }

    return range;

  }

  public void binarySearch(final List<Integer> a, int left, int right, int target, ArrayList<Integer> range){

    // check if right is less than left
    if(right < left){
      return;
    }

    // check if left and right is similar to target
    if(a.get(left) == target && a.get(right) == target){
      range.add(left);
      range.add(right);
      return;
    }

    // find mid
    int mid  = left + (right - left)/2;

    if(a.get(mid) < target){
      // traverse right
      binarySearch(a, mid + 1, right, target, range);
    }else if(a.get(mid) > target){
      // traverse left
      binarySearch(a, left, mid-1, target, range);
    }else {
      range.add(mid);
      range.add(mid);

      // duplicate - left
      int back = mid;
      while (back > left && a.get(back) == a.get(back-1)){
        back--;
        range.set(0, back);
      }

      // duplicate forward
      int forward = mid;
      while (forward < right && a.get(forward) == a.get(forward + 1)){
        forward++;
        range.set(1, forward);
      }

      return;
    }



  }
}
