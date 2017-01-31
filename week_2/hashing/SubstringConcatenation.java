import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Substring Concatenation
 *
 * https://www.interviewbit.com/problems/substring-concatenation/
 */
public class SubstringConcatenation {

  public ArrayList<Integer> findSubstring(String a, final List<String> b) {
    if(b.size() == 0){
      return null;
    }

    int word_length = b.get(0).length();
    int word_total_size = b.get(0).length() * b.size();

    // words map
    HashMap<String, Integer> words = new HashMap<>();
    for (int w=0; w < b.size(); w++){

      if(words.containsKey(b.get(w))){
        words.put(b.get(w), (words.get(b.get(w)) + 1) );
      }else{
        words.put(b.get(w), 1);
      }
    }

    HashMap<String, Integer> tempMap;
    ArrayList<Integer> result = new ArrayList<>();
    int currentIndex;
    for(int i = 0; i <= (a.length() - word_total_size); i++){
      currentIndex = i;
      tempMap = new HashMap<>();

      for(int j = i; j < (i + word_total_size); j = j + word_length){
        String sub_st = a.substring(j, j + word_length);
        if(!words.containsKey(sub_st)){
          break;
        }
        // duplicate check
        if(tempMap.containsKey(sub_st)){
          if(tempMap.get(sub_st).equals(words.get(sub_st))){
            break;
          }
          tempMap.put(sub_st, (tempMap.get(sub_st) + 1));
        }else{
          tempMap.put(sub_st, 1);
        }

        if((j + word_length) == (i + word_total_size)){
          result.add(currentIndex);
        }

      }
    }

    return result;
  }

}
