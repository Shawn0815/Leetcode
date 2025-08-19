package Problem_271__Encode_and_Decode_Strings.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution0 {
    public String encode(List<String> strs) {
        StringBuilder encode = new StringBuilder();

        for (String str : strs) {
            encode.append(str).append("#");
        }

        encode.deleteCharAt(encode.length() - 1); // 刪除最後一個字元

        return encode.toString();
    }

    public List<String> decode(String str) {
        List<String> decode = new ArrayList<>();

        decode = Arrays.asList(str.split("#")); // 將字串拆成字串陣列在轉成List

        return decode;
    }
}
