package Problem_17__Letter_Combinations_of_a_Phone_Number.Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Solution2 {

    // 用來收集逐層產生的所有組合
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

        // 初始化結果 List 內有一個空字串，作為基底
        resultList.add("");
        
        // 每獨到一個 digit，去擴展所有組合
        for (char digit: digits.toCharArray()) {
            
            // 建立暫存 List 存當前擴展結果
            List<String> tempList = new ArrayList<>();

            // 取得目前結果 List 中的所有 subString
            for (String curString: resultList) {

                // 取得這個 digit 對應的所有字母
                for (char c: digitToChar.get(digit).toCharArray()) {
                    
                    // 一個一個將 subString 加上這個 digit 可能的字母，並放入暫存 List
                    tempList.add(curString + c);
                }
            }

            // 最後直接取代結果 List 避免重複
            resultList = tempList;
        }

        return resultList;
    }
}
