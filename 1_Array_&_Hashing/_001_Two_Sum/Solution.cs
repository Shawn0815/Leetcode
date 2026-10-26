public class Solution {
    public int[] TwoSum(int[] nums, int target)
    {
        Dictionary<int, int> dict = new Dictionary<int, int>();

        for (int i = 0; i < nums.Length; i++)
        {
            int complement = target - nums[i];

            if (dict.ContainsKey(complement))
            {
                return new int[] {dict[complement], i};
            }

            dict[nums[i]] = i;
        }

        return new int[] {};
    }

    public static void Main(string[] args)
    {
        int[] nums = new int[] {2, 7, 11, 15};
        int target = 9;

        Solution sol = new Solution();
        int[] output = sol.TwoSum(nums, target);

        Console.Write("[");
        Console.Write(string.Join(", ", output));
        Console.WriteLine("]");
    }
}