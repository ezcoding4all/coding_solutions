/**
 * Length of Last Word
 *
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 * If the last word does not exist, return 0.
 *
 * Note: A word is defined as a character sequence consists of non-space characters only.
 *
 * Example:
 * Given s = "Hello World",
 * return 5 as length("World") = 5.
 *
 * Please make sure you try to solve this problem without using library functions. Make sure you only traverse the string once.
 *
 * [interviewbit]
 * https://www.interviewbit.com/problems/length-of-last-word/
 */
public class LengthOfLastWord {
  public static void main(String args[])
  {
    String input = "Hello World  ";

    LengthOfLastWord len = new LengthOfLastWord();

    int length = len.lengthOfLastWord(input);

    System.out.println("Length Of Last Word: "+length);
  }

  public int lengthOfLastWord(final String a) {
    int length = a.length();
    int i = length - 1;
    int wordLength = 0;
    boolean isCharStart = false;
    while (i >= 0){
      char charAti = a.charAt(i);
      if(charAti == ' ' && !isCharStart){
        i--;
        continue;
      }
      isCharStart = true;
      if(charAti == ' '){ // can check ascii = 32
        break;
      }
      wordLength ++;
      i--;
    }

    return wordLength;
  }
}
