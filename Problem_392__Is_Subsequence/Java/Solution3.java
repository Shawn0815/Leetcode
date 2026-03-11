package Problem_392__Is_Subsequence.Java;

public class Solution3 {
    Boolean memo[][];

    public boolean isSubsequence(String s, String t) {
        // 加入 memo 機制記錄計算過的答案
        memo = new Boolean[s.length()][t.length()];
        return recursion(s, t, 0, 0);
    }

    private boolean recursion(String s, String t, int i, int j) {
        if (i == s.length()) {
            return true;
        }

        if (j == t.length()) {
            return false;
        }

        // 若以計算過 s[i, ...] 跟 t[j, ...] 是否為子字串
        // 直接回傳答案
        if (memo[i][j] != null) {
            return memo[i][j];
        }

        if (s.charAt(i) == t.charAt(j)) {
            return recursion(s, t, i + 1, j + 1);
        }

        return recursion(s, t, i, j + 1);
    }
}
