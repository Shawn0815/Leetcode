package Problem_392__Is_Subsequence.Java;

public class Solution2 {
    public boolean isSubsequence(String s, String t) {
        return recursion(s, t, 0, 0);
    }

    // recursion(i, j)：s[i, ...] 是否為 t[j, ...] 的子字串
    private boolean recursion(String s, String t, int i, int j) {
        // s 為空字串，必為任何字串的子字串
        if (i == s.length()) {
            return true;
        }

        // t 為空字串，沒有任何字串為它的子字串
        if (j == t.length()) {
            return false;
        }

        // 若 s[i] = t[j]，往後比較 s[i+1, ...] 跟 t[j+1, ...]
        if (s.charAt(i) == t.charAt(j)) {
            return recursion(s, t, i + 1, j + 1);
        }

        // 反之，i 不移動只移動 j，比較 s[i, ...] 跟 t[j+1, ...]
        return recursion(s, t, i, j + 1);
    }
}
