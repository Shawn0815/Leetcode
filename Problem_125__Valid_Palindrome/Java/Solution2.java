package Problem_125__Valid_Palindrome.Java;

public class Solution2 {
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        // 利用雙指標，從最左跟最右依序比較，直到左=右
        while (left < right) {
            // 跳過不是字母或數字的字元（記得檢查左<右）
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            // 如果左字母跟右字母不相等，代表非Palindrome，直接return false
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            // 再依序靠近比較（左向右，右向左）
            left++;
            right--;
        }

        // 都比完還沒return，代表是Palindrome，return true
        return true;
    }
}
