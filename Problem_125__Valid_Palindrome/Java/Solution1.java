package Problem_125__Valid_Palindrome.Java;

public class Solution1 {
    public static boolean isPalindrome(String s) {
        // 建立一個string builder
        StringBuilder clean_str = new StringBuilder();

        // 依序loop string中的每個char (要先把string轉成char array才能loop)
        for (char c: s.toCharArray()) {
            // 如果是英文或數字，轉換成小寫並append到stringBuilder中
            if (Character.isLetterOrDigit(c)) {
                clean_str.append(Character.toLowerCase(c));
            }
        }

        // 比較clean_str跟他的reverse是否相等
        // string builder無法直接比較，要轉為String類型
        return clean_str.toString().equals(clean_str.reverse().toString());
    }
}
