package Problem_66__Plus_One.Java;

public class Solution {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1; // 沒進位，直接加
                return digits; // 直接return
            }
            
            digits[i] = 0; // 要進位，當前位變 0
        }

        // 如果跑完都還在進位（像 999 → 000），就需要開一個多一位的陣列
        int[] result = new int[n + 1];
        result[0] = 1; // 第一位是進位出來的 1，其餘預設是 0

        return result;
    }
}
