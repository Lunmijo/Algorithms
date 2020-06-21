public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        for (var i = 0; i < nums.Length; i++)
            {
                if (i == nums.Length)
                {
                    return null;
                }
                for (var j = i + 1; j < nums.Length; j++)
                {
                    if (nums[i] + nums[j] == target)
                    {
                        return new int[] { i, j };
                    }
                }
            }
            return null;
    }
}