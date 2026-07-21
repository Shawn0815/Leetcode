public class Solution {
    public bool hasDuplicate(int[] nums)
    {
        HashSet<int> set = new HashSet<int>();

        foreach (int num in nums)
        {
            if (set.Contains(num))
            {
                return true;
            }

            set.Add(num);
        }

        return false;
    }

    public static void Main(String[] args)
    {
        int[] nums = new int[] {1, 2, 3, 3};
        
        Solution sol = new Solution();
        bool output = sol.hasDuplicate(nums);

        Console.WriteLine(output);
    }
}