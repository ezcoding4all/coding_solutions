import java.util.ArrayList;

/**
 * Compare two version numbers version1 and version2.
 *
 * If version1 > version2 return 1,
 * If version1 < version2 return -1,
 * otherwise return 0.
 *
 * You may assume that the version strings are non-empty and contain only digits and the . character.
 * The . character does not represent a decimal point and is used to separate number sequences.
 * For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.
 *
 * Here is an example of version numbers ordering:
 *
 * 0.1 < 1.1 < 1.2 < 1.13 < 1.13.4
 *
 * [interviewbit]
 * https://www.interviewbit.com/problems/compare-version-numbers/
 */
public class CompareVersionNumbers {
  public static void main(String[] args){
    String a1 = "1.13";
    String a2 = "1.2";
    CompareVersionNumbers c = new CompareVersionNumbers();

    int result = c.compareVersion(a1, a2);

    System.out.println("Compare Result: " + result);
  }

  public int compareVersion(String a, String b) {

    ArrayList<String> v1 = calc(a);
    ArrayList<String> v2 = calc(b);

    int j=0;
    while(j<v1.size() || j<v2.size()){
      if(j < v1.size() && j < v2.size()){
        if(v1.get(j).equals(v2.get(j))){
          j++;
          continue;
        }
        else if(v1.get(j).length() > v2.get(j).length()){
          return 1;
        }
        else if(v1.get(j).length() < v2.get(j).length()){
          return  -1;
        }
        else if(v1.get(j).length() == v2.get(j).length()){
          int x = 0;
          while (x < v1.get(j).length()){
            if(v1.get(j).charAt(x) > v2.get(j).charAt(x)){
              return 1;
            }else if(v1.get(j).charAt(x) < v2.get(j).charAt(x)){
              return -1;
            }
            x++;
          }

        }
      }else if(j < v1.size()){
        return 1;
      }else if(j < v2.size()){
        return -1;
      }
      j++;
    }

    return 0;
  }

  private ArrayList<String> calc(String a){
    ArrayList<String> v1 = new ArrayList<String>();
    int v1Length = a.length();
    StringBuffer sb = new StringBuffer();
    int start = 0;
    for (int i=0; i < v1Length; i++){
      if(a.charAt(i) != '.'){
        if(start == 0){
          if(a.charAt(i) != '0'){
            sb.append(a.charAt(i));
            start = 1;
          }
        }else{
          sb.append(a.charAt(i));
        }

      }
      if(a.charAt(i) == '.' || i == (v1Length -1)){
        if(sb.length() > 0){
          v1.add(sb.toString());
        }
        sb = new StringBuffer();
        start = 0;
      }
    }

    return v1;
  }
}
