import array_problems.concatenationOfArrays.ConcatenationOfArrays;
import array_problems.validAnagram.IsAnagram;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*int [] s={1,4,1,2};
        System.out.println(Arrays.toString(ConcatenationOfArrays.getConcatenating(s)));*/

        String s ="ali";
        String t ="ils";
        System.out.println(IsAnagram.isAnagram(s,t));
    }
}