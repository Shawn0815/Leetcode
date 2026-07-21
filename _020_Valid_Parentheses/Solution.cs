public class Solution {
    public bool IsValid(string s) {
        Stack<char> stack = new Stack<char>();

        foreach (char c in s)
        {
            if (c == '(' || c == '[' || c == '{') {
                stack.Push(c);
            }
            else {
                if (stack.Count != 0) {
                    char top = stack.Pop();

                    if ((top == '(' && c != ')') ||
                        (top == '[' && c != ']') ||
                        (top == '{' && c != '}')) {
                        return false;
                    }
                }
            }
        }

        return stack.Count == 0;
    }

    public static void Main(string[] args) {
        string s = "[]";

        Solution sol = new Solution();
        bool output = sol.IsValid(s);

        Console.WriteLine(output);
    }
}
