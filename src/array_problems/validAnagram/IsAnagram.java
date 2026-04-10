package array_problems.validAnagram;

import java.util.Arrays;

public class IsAnagram {
    public static boolean isAnagram(String s, String t){
        if(s.length() !=t.length()){
            return false;
        }

        char[] sSort= s.toCharArray();
        char[] tSort = t.toCharArray();
        Arrays.sort(sSort);
        Arrays.sort(tSort);
        return Arrays.equals(sSort,tSort);
    }
}
