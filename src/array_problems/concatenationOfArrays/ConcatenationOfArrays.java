package array_problems.concatenationOfArrays;

public class ConcatenationOfArrays {
    public static int[] getConcatenating(int[] nums){
        int[] ans=new int[2*nums.length];
        for(int i=0;i<ans.length;i++){
            ans[i]=nums[i%nums.length];
        }
        return ans;
    }
}
