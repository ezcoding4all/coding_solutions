/**
 * Square Root Of Integer
 *
 * https://www.interviewbit.com/problems/square-root-of-integer/
 */
public class SquareRoot {
  public int sqrt(int a) {
    if(a == 0 || a == 1){
      return a;
    }

    double t;
    double sqrt = a/2;

    do{
      t = sqrt;
      sqrt = (t + (a/t))/2;
    }while ((t -  sqrt) !=0);

    return (int) Math.floor(sqrt);
  }
}
