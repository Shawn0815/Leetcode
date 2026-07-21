package _344_Reverse_String;

import java.util.Arrays;

public class Solution {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] s = new char[] {'n', 'e', 'e', 't'};

        Solution sol = new Solution();
        sol.reverseString(s);

        System.out.println(Arrays.toString(s));
    }
}
