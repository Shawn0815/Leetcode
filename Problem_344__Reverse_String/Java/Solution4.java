package Problem_344__Reverse_String.Java;

public class Solution4 {
    public void reverseString(char[] s) {
        // 初始化：left = 0, right = n - 1
        reverse(s, 0, s.length - 1);
    }

    // 遞回交換 s[left] 跟 s[right]
    private void reverse(char[] s, int left, int right) {
        // 左右指針碰到就結束
        if (left >= right) {
            return;
        }

        // 交換 s[left] 跟 s[right]        
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        // 繼續遞迴交換 s[left + 1] 跟 s[right - 1]        
        reverse(s, left + 1, right - 1);
    }
}
