import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Anagrams
 *
 * Given an array of strings, return all groups of strings that are anagrams. Represent a group by a list of integers representing the index in the original list. Look at the sample case for clarification.
 *
 * Example :
 * Input : cat dog god tca
 * Output : [[1, 4], [2, 3]]
 *
 * [interviewbit]
 * https://www.interviewbit.com/problems/anagrams/
 */

public class Anagrams {

  public static void main(String[] args){
    Anagrams as = new Anagrams();

    List<String> a = Arrays.asList("cat", "dog", "god", "tca");

    as.anagrams(a);
  }

  public ArrayList<ArrayList<Integer>> anagrams(final List<String> a) {

    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> anagramStrings;

    ArrayList<Integer> hashCode = new ArrayList<Integer>();

    for (int i = 0; i < a.size(); i++){
      int hash = 0;
      for(int j=0; j < a.get(i).length(); j++){
        hash = hash + a.get(i).charAt(j);
      }

      if(!hashCode.contains(hash)){
        hashCode.add(hash);
      }
      int index = hashCode.indexOf(hash);

      if(result.size() >= (index+1) && result.size() != 0){
        anagramStrings = result.get(index);
        anagramStrings.add(i+1);
        result.set(index, anagramStrings);
      }else{
        anagramStrings = new ArrayList<Integer>();
        anagramStrings.add(i+1);
        result.add(index, anagramStrings);
      }
    }

    return result;
  }
}