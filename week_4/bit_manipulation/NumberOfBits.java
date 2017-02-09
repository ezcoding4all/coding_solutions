/**
 * Number Of 1 Bits
 *
 * https://www.interviewbit.com/problems/number-of-1-bits/
 */
public class NumberOfBits {

  public int numSetBits(long a) {
    int count = 0;
    for(int i=1; i<33; i++){

      long bit = (a & (1 << i));

      if(bit != 0){
        count++;
      }
    }
    return count;
  }

}
