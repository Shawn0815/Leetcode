package Problem_5__Longest_Palindromic_Substring.Java;

public class Solution1 {
    
    public String longestPalindrome(String s) {
        
        int resLen = 0; // 最長回文子字串的長度
        int resIdx = 0; // 最長回文子字串的起始 index
        int n = s.length();

        // Loop 所有子字串判斷是否為回文（i：左邊界、j：右邊界）
        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                // 利用 125.題解法判斷子字串是否為回文
                boolean isValid = isValidPalindrome(s, i, j);
                int len = j - i + 1;

                // 更新最大長度與起始位置
                if (isValid && len > resLen) {
                    resIdx = i;
                    resLen = len;
                }
            }
        }

        // 回傳最長回文子字串
        return s.substring(resIdx, resIdx + resLen);
    }

    // 雙子針法判斷字串是否為回文
    private boolean isValidPalindrome (String s, int l, int r) {

        while (l <= r) {

            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }

            l++;
            r--;
        }

        return true;
    }
}
