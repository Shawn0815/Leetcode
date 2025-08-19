package Problem_242__Valid_Anagram.Java;

public class Solution3 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // 建立一個長度為 26 的陣列來紀錄 a~z 出現次數差異
        int[] counter = new int[26];

        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++; // 將 s 的字元出現次數 +1
            counter[t.charAt(i) - 'a']--; // 將 t 的字元出現次數 -1
        }

        // 檢查每一個字母出現次數是否都為 0
        for (int val : counter) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }
}
