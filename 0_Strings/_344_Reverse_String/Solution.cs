public class Solution {
    public void ReverseString(char[] s) {
        int left = 0, right = s.Length - 1;

        while (left < right)
        {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void Main(string[] args) {
        char[] s = new char[] {'n', 'e', 'e', 't'};

        Solution sol = new Solution();
        sol.ReverseString(s);

        Console.WriteLine(string.Join(",", s));
    }
}