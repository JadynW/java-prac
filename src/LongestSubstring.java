import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class LongestSubstring {

    String substr = "";
    ArrayList<Integer> strLen = new ArrayList<>();

    public LongestSubstring(){}

    public int lengthOfLongestSubstring(String s){
        for (char d: s.toCharArray()){
            if (substr.contains(d+"")){
                strLen.add(substr.length());
                substr = substr.substring(substr.indexOf(d)+1);
            }
            substr += d;
        }
        strLen.add(substr.length());

        return Collections.max(strLen);
    }

}
