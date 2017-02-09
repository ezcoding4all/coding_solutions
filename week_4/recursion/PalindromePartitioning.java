import java.util.ArrayList;

/**
 * Palindrome Partitioning
 *
 * https://www.interviewbit.com/problems/palindrome-partitioning/
 */
public class PalindromePartitioning {

  public ArrayList<ArrayList<String>> partition(String a) {
    ArrayList<ArrayList<String>> result = new ArrayList<>();

    if (a == null || a.length() == 0) {
      return result;
    }

    ArrayList<String> partition = new ArrayList<>();
    insertPalindrome(a, 0, partition, result);

    return result;
  }

  public void insertPalindrome(String a, int start, ArrayList<String> partition, ArrayList<ArrayList<String>> result) {
    if (start == a.length()) {
      ArrayList<String> temp = new ArrayList<>(partition);
      result.add(temp);
      return;
    }

    for (int i = start + 1; i <= a.length(); i++) {
      String str = a.substring(start, i);
      if (isPalindrome(str)) {
        partition.add(str);
        insertPalindrome(a, i, partition, result);
        partition.remove(partition.size() - 1);
      }
    }
  }

  public boolean isPalindrome(String str) {
    int left = 0;
    int right = str.length() - 1;

    while (left < right) {
      if (str.charAt(left) != str.charAt(right)) {
        return false;
      }
      left++;
      right--;
    }
    return true;
  }
}
