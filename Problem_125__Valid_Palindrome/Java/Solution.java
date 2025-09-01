package Problem_125__Valid_Palindrome.Java;

public class Solution {
    public boolean isPalindrome(String s) {
        // 建立左指標與右指標
        int left = 0, right = s.length() - 1;

        // 一一比較left跟right是否相等
        while (left < right) {

            // 若左指標非字母或數字，跳過
            if (Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue;
            }

            // 若右指標非字母或數字，跳過
            if (Character.isLetterOrDigit(s.charAt(left))) {
                right--;
                continue;
            }

            // 若不相等，直接回傳false
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            // left跟right指標個字往中間移動一格
            left++;
            right--;
        }

        return true;
    }
}
