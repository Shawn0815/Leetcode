package Problem_5__Longest_Palindromic_Substring.Java;

public class Solution {
    
    public String longestPalindrome(String s) {
        
        int resLen = 0, resIdx = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {

            // 奇數長度
            int l = i, r = i;

            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {

                int len = r - l + 1;

                if (len > resLen) {

                    resLen = len;
                    resIdx = l;
                }

                l--;
                r++;
            }

            // 偶數長度
            l = i;
            r = i + 1;

            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {

                int len = r - l + 1;

                if (len > resLen) {

                    resLen = len;
                    resIdx = l;
                }

                l--;
                r++;
            }
        }

        return s.substring(resIdx, resIdx + resLen);
    }
}
