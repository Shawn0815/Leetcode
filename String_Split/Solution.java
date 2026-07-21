package String_Split;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> stringSplit(String s) {
        int left = 0;

        List<String> result = new ArrayList<>();

        for (int right = 0; right < s.length(); right++) {
            if (s.charAt(right) == ',') {
                String subString = s.substring(left, right);
                result.add(subString);
                left = right + 1;
            }
        }

        // Must add last part
        result.add(s.substring(left));

        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s;

        // Case 1
        s = "apple,banana,cat,dog";
        System.out.println(sol.stringSplit(s));

        // Case 2
        s = "apple,,cat,";
        System.out.println(sol.stringSplit(s));
    }
}
