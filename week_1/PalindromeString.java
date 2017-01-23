/**
 * Palindrome String
 *
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 *
 * Example:
 * "A man, a plan, a canal: Panama" is a palindrome.
 * "race a car" is not a palindrome.
 *
 * Return 0 / 1 ( 0 for false, 1 for true ) for this problem
 *
 * [interviewbit]
 * https://www.interviewbit.com/problems/palindrome-string/
 */
public class PalindromeString {
  public static void main(String args[])
  {
    String input = "A man, a plan, a canal: Panama";

    PalindromeString p = new PalindromeString();

    int i = p.isPalindrome(input);

    System.out.println("Palindrome String: "+i+"  "+(i==0?"(NO)":"(YES)"));
  }

  public int isPalindrome(String a) {
    int length = a.length();
    int i = 0;
    int j = length -1;
    while (i < j){
      char charAti = Character.toLowerCase(a.charAt(i));
      char charAtj = Character.toLowerCase(a.charAt(j));
      // can also be written as
      // (charAti >= 'a' && charAti <= 'z') || (charAti >= 'A' && charAti <= 'Z') || (charAti >= '0' && charAti <= '9')
      if(!Character.isLetterOrDigit(charAti)){
        i++;
        continue;
      }
      if(!Character.isLetterOrDigit(charAtj)){
        j--;
        continue;
      }

      if(charAti != charAtj){
        return 0;
      }

      i++; j--;
    }

    return 1;
  }
}
