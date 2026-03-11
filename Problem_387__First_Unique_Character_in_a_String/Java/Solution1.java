package Problem_387__First_Unique_Character_in_a_String.Java;

public class Solution1 {
    public int firstUniqChar(String s) {
        // 外層迴圈：遍歷每個要字元，檢查是否不重複
        for (int i = 0; i < s.length(); i++) {
            // 預設結果為 true
            boolean result = true;

            // 內層迴圈：從這個字元往後檢查是否有重複的元素
            for (int j = 0; j < s.length(); j++) {
                // 不能跟自己比較
                if (i == j) {
                    continue;
                }
                // 如果檢查到重覆，標記為 false，並提前退出，檢查下一個
                if (s.charAt(i) == s.charAt(j)) {
                    result = false;
                    break;
                }
            }

            // 如果檢查完結果為 true，回傳 index
            if (result == true) {
                return i;
            }
        }

        // 全部元素檢查完都沒有 return，代表沒有不重複的，回傳 -1
        return -1;
    }
}
