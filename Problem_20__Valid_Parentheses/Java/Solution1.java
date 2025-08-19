package Problem_20__Valid_Parentheses.Java;

public class Solution1 {
    public static boolean isValid(String s) {
        // 只要還有可能的配對括號，就繼續移除
        while (s.contains("()") || s.contains("[]") || s.contains("{}")) {
            // 移除所有成對的括號（注意：String 是 immutable，要接回去）
            s = s.replace("()", "");
            s = s.replace("[]", "");
            s = s.replace("{}", "");
        }

        // 若最後字串為空，代表全部成功配對
        return s.isEmpty();
    }
}
