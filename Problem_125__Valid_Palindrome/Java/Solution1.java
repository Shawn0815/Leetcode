package Problem_125__Valid_Palindrome.Java;

public class Solution1 {
    public boolean isPalindrome(String s) {
        // 將字串轉換成傳小寫字母+數字，並建立其StringBuilder
        String clean_str = cleaString(s);
        StringBuilder clean_sb = new StringBuilder(clean_str);

        // 比較字串本身與反轉後的字串是否相等
        return clean_str.equals(clean_sb.reverse().toString());
    }

    // 轉換字串函數
    public String cleaString(String s) {
        return s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }
}
