package Problem_392__Is_Subsequence.Java;

public class Solution1 {
    public boolean isSubsequence(String s, String t) {
        // i, j 指標指向 s 跟 t 要比較的字元
        int i = 0, j = 0;

        // 比較兩個字元是否相等，直到其中一個指標走到底
        while (i < s.length() && j < t.length()) {
            // 若相等，i, j 指標一起往前移動，比較下一個
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }

            // 若不相等，只移動 j 指標，查看跟 i 是否相等
            j++;
        }

        // 最後若 i 指標掃完 s 字串，代表 s 是 subsequence
        return i == s.length() ? true : false;
    }
}
