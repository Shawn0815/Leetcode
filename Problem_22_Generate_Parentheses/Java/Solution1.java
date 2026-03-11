package Problem_22_Generate_Parentheses.Java;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {

    // 用來儲存結果的List
    private List<String> resultList = new ArrayList<>();
    
    public List<String> generateParenthesis(int n) {
        
        // 儲存目前的括號字串
        StringBuilder curString = new StringBuilder();

        // 遞迴函數：傳入開/閉括號數量、n、目前括號字串
        backTrack(0, 0, n, curString);

        return resultList;
    }

    private void backTrack(int openN, int closeN, int n, StringBuilder curString) {

        // 終止條件：括號數量 = 2n，並收集至結果List
        if (curString.length() == n * 2) {
            resultList.add(curString.toString());
            return;
        }

        // 選擇 1：開括號（合法條件：數量 < n ）
        if (openN < n) {
            curString.append('('); // 加入 path
            backTrack(openN + 1, closeN, n, curString); // 遞迴處理下一個括號選擇
            curString.deleteCharAt(curString.length() - 1); // 撤銷選擇
        }

        // 選擇 2：閉括號（合法條件：數量 < 開括號數量）
        if (closeN < openN) {
            curString.append(')'); // 加入 path
            backTrack(openN, closeN + 1, n, curString); // 遞迴處理下一個括號選擇
            curString.deleteCharAt(curString.length() - 1); // 撤銷選擇
        }
    }
}
