package Problem_344__Reverse_String.Java;

public class Solution3 {
    public void reverseString(char[] s) {
        // left 指向頭、right 指向尾
        int left = 0, right = s.length - 1;

        // 每次將 s[left] 跟 s[right] 交換直到兩者相遇
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}
