package Problem_17__Letter_Combinations_of_a_Phone_Number.Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Solution {

    private List<String> resultList = new ArrayList<>();
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

        resultList.add("");
        
        for (char digit: digits.toCharArray()) {
            
            List<String> tempList = new ArrayList<>();

            for (String curString: resultList) {

                for (char c: digitToChar.get(digit).toCharArray()) {
                    tempList.add(curString + c);
                }
            }

            resultList = tempList;
        }

        return resultList;
    }
}
