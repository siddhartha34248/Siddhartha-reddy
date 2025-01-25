import java.util.Arrays;

class Solution4{
    public  int[] twoSum(int[] nums, int target) {
        int[] re=new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                   
                    re[0] = i; 
                
                re[1] = j; 
            }
                }
            }
        
   return  re;
    }
}
public class LTCode005{
    public static void main(String[] args) {
        Solution4 solution4=new Solution4();
        int[] nums={2,7,11,15};
        int target=9;
        int[] result =  solution4.twoSum(nums,target);
       
        System.out.println(Arrays.toString(result));
    }
}