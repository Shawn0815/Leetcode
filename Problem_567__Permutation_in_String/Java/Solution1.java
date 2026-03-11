package Problem_567__Permutation_in_String.Java;

import java.util.Arrays;

public class Solution1 {
    public boolean checkInclusion(String s1, String s2) {
        // 如果 s1 大於 s2，s2 不可能包含 s1
        if (s1.length() > s2.length()) {
            return false;
        }
        
        // 對 s1 字串做排序
        String s1Sorted = sortString(s1);

        // Loop s2 每個起點，切出跟 s1 長度相同的子字串
        // 將子字串排序後跟排序後的 s1 做比較，若相等，代表 s2 包含 s1 的排列
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            String s2Sub = s2.substring(i, i + s1.length());
            String s2SubStorted = sortString(s2Sub);

            if (s1Sorted.equals(s2SubStorted)) {
                return true;
            }
        }

        // 否則不包含
        return false;
    }

    // 子函數：負責對 Stirng 做排序
    private String sortString(String s) {
        char[] sArr = s.toCharArray();
        Arrays.sort(sArr);
        return String.valueOf(sArr);
    }
}
