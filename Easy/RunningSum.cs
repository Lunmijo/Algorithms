public class Solution {
    public int[] RunningSum(int[] nums) {
        int[] result = new int[nums.Length];
            result[0] = nums[0];
            for (var i = 1; i < nums.Length; i++)
            {
                if (i == nums.Length)
                {
                    return result;
                }
                result[i] = nums[i];
                for(var  j = 0; j < i; j++)
                {
                    result[i] += nums[j];
                }
            }
            return result;
    }
}