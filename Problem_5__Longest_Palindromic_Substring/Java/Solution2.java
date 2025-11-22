package Problem_5__Longest_Palindromic_Substring.Java;

public class Solution2 {
    
    public String longestPalindrome(String s) {
        
        int resLen = 0; // 最長回文子字串的長度
        int resIdx = 0; // 最長回文子字串的起始 index
        int n = s.length();

        for (int i = 0; i < n; i++) {

            // Case1：奇數長度
            int l = i, r = i;

            // 以 i 為中心，向左右擴展，若符合回文條件，繼續擴展
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {

                int len = r - l + 1;

                // 更新回文長度與起始位置
                if (len > resLen) {

                    resLen = len;
                    resIdx = l;
                }

                l--;
                r++;
            }

            // Case2：偶數長度
            l = i;
            r = i + 1;

            // 以 i 和 i + 1 為中心，向左右擴展
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {

                int len = r - l + 1;

                // 更新回文長度與起始位置
                if (len > resLen) {

                    resLen = len;
                    resIdx = l;
                }

                l--;
                r++;
            }
        }

        // 回傳最長回文子字串
        return s.substring(resIdx, resIdx + resLen);
    }
}
