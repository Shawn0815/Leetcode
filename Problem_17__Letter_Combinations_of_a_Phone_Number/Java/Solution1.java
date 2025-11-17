package Problem_17__Letter_Combinations_of_a_Phone_Number.Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Solution1 {

    // 收集所有合法組合的結果
    private List<String> resultList = new ArrayList<>();

    // 數字到字母的固定映射（不會變）
    private Map<Character, String> digitToChar = Map.of(
        '2', "abc",
        '3', "def",
        '4', "ghi",
        '5', "jkl",
        '6', "mno",
        '7', "pqrs",
        '8', "tuv",
        '9', "wxyz"
    );
    
    public List<String> letterCombinations(String digits) {

        if (digits.isEmpty()) {
            return resultList;
        }

        // 用來存放目前收集到的字母
        StringBuilder curString = new StringBuilder();
        
        // 從 index = 0 開始處理第一個 digit
        backTrack(0, curString, digits);

        return resultList;
    }

    private void backTrack(int index, StringBuilder curString, String digits) {

        // 已處理完所有數字，收集完成，將 path 加入答案
        if (index == digits.length()) {
            resultList.add(curString.toString());
            return;
        }

        // 取得這層數字可能對應的所有字母
        char curDigit = digits.charAt(index);
        String letters = digitToChar.get(curDigit);

        // 針對每個可能的字母做「選擇 → 遞迴 → 撤銷選擇」
        for (char c: letters.toCharArray()) {

            // 選擇：直接將字母加入 path
            curString.append(c);

            // 遞迴：往下個 digit 下去處理（記得更新狀態）
            backTrack(index + 1, curString, digits);

            // 撤銷選擇：將剛剛加入的字母移除，嘗試下個選擇
            curString.deleteCharAt(curString.length() - 1);
        }
    }
}
