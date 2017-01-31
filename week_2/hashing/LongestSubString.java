import java.util.HashMap;

/**
 * Longest Substring Without Repeat
 *
 * https://www.interviewbit.com/problems/longest-substring-without-repeat/
 */
public class LongestSubString {

  public int lengthOfLongestSubstring(String a) {
    if(a.length() == 1){
      return 1;
    }

    HashMap<Character, Integer> current;

    int maxLength = 0;

    for(int i=0; i < a.length(); i++){
      int len = 1;
      current = new HashMap<>();
      current.put(a.charAt(i), 1);
      for(int j=i+1; j < a.length(); j++){
        if(!current.containsKey(a.charAt(j))){
          len++;
          current.put(a.charAt(j), 1);
        }else{
          if(len > maxLength){
            maxLength = len;
          }
          break;
        }
        if(len > maxLength){
          maxLength = len;
        }
      }
    }

    return maxLength;
  }
}
