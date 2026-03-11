package Problem_344__Reverse_String.Java;

public class Solution1 {
    public void reverseString(char[] s) {
        // 將 charArray 轉成 String
        String str = new String(s);

        // 建立一個 StringBuilder，並做就地反轉
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        
        // Loop StringBuilder 中每個字元
        // 一個個賦值回 charArray s[i] 中
        for (int i = 0; i < s.length; i++) {
            s[i] = sb.toString().charAt(i);
        }
    }
}
