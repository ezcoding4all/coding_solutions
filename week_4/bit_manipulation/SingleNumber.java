import java.util.List;

/**
 * Single Number
 *
 * https://www.interviewbit.com/problems/single-number/
 */
public class SingleNumber {

  public int singleNumber(final List<Integer> a) {

    int num = 0;

    for(int i = 0; i < a.size(); i++){
      num = num ^ a.get(i);
    }

    return num;

  }

}
