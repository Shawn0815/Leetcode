package Problem_344__Reverse_String.Java;

public class Solution2 {
    public void reverseString(char[] s) {
        int len = s.length;

        // 將第 i 個元素跟第 len - 1 - i 交換
        // 重複以上動作直到 i = len/2（走到 s 的一半）即交換完畢
        for (int i = 0; i < len/2; i++) {
            char temp = s[i];
            s[i] = s[len - i - 1];
            s[len - i - 1] = temp;
        }
    }
}
