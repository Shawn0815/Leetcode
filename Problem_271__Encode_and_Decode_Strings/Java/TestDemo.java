package Problem_271__Encode_and_Decode_Strings.Java;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestDemo {

    Solution solution = new Solution();
    // Solution0 solution = new Solution0();
    // Solution1 solution = new Solution1();

    @Test
    public void testEncode_01() {

        List<String> strs = new ArrayList<>(List.of("neet", "code", "love", "you"));
        String encode = solution.encode(strs);
        List<String> decode = solution.decode(encode);

        assertEquals(strs, decode);
    }

    @Test
    public void testEncode_02() {

        List<String> strs = new ArrayList<>(List.of("we", "say", ":", "yes"));
        String encode = solution.encode(strs);
        List<String> decode = solution.decode(encode);

        assertEquals(strs, decode);
    }

    @Test
    public void testEncode_03() {

        List<String> strs = new ArrayList<>(List.of("my", "na#me", "is", "Shawn"));
        String encode = solution.encode(strs);
        List<String> decode = solution.decode(encode);

        assertEquals(strs, decode);
    }
}
