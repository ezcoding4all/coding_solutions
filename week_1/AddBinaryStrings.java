/**
 * Add Binary Strings
 *
 * Given two binary strings, return their sum (also a binary string).
 *
 * Example:
 * a = "100"
 * b = "11"
 * Return a + b = “111”.
 *
 * [interviewbit]
 * https://www.interviewbit.com/problems/add-binary-strings/
 */
public class AddBinaryStrings {
  public static void main(String[] args){
    AddBinaryStrings abs = new AddBinaryStrings();

    String a = "11";
    String b = "001";

    System.out.println("Output: "+ abs.addBinary(a, b));

  }

  public String addBinary(String a, String b){

    StringBuilder sb = new StringBuilder();

    int i = a.length() - 1;
    int j = b.length() - 1;

    int carry = 0;
    while (i >= 0 || j >= 0){
      int val_a = 0;
      int val_b = 0;
      if(i >= 0){
        val_a = a.charAt(i) - '0';
        i--;
      }
      if(j >= 0){
        val_b = b.charAt(j) - '0';
        j--;
      }
      int sum = val_a + val_b + carry;
      if(sum >= 2){
        sb.append(String.valueOf(sum-2));
        carry = 1;
      }else{
        sb.append(String.valueOf(sum));
        carry = 0;
      }
    }
    if(carry == 1){
      sb.append("1");
    }

    return sb.reverse().toString();
  }
}
