package Problem_271__Encode_and_Decode_Strings.Java;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String encode(List<String> strs) {
        StringBuilder encode = new StringBuilder();

        for (String str : strs) {
            encode.append(str.length()).append("#").append(str);
        }

        return encode.toString(); // StringBuilder轉成String

    }

    public List<String> decode(String str) {
        List<String> decode = new ArrayList<>();

        // 指標 i：代表數字的開頭
        int i = 0;

        while (i < str.length()) {
            // 指標 j：從 i 開始，一直走直到找到 '#'
            int j = i + 1;

            while (str.charAt(j) != '#') {
                j++;
            }

            // 切出子字串長度：指標 i ~ 指標 j 中的字元
            int len = Integer.valueOf(str.substring(i, j));

            // 切出真正的子字元：指標 j 下一個開始切出長度為len的字元
            decode.add(str.substring(j + 1, j + 1 + len));

            // 移動指標 i 到下一個子字串的頭（數字）
            i = j + 1 + len;
        }

        return decode;
    }
}
