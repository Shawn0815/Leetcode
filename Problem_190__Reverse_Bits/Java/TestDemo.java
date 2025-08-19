package Problem_190__Reverse_Bits.Java;

public class TestDemo {
    // 輸出 32-bit binary string，補前導 0
    public static String toBinary32(int x) {
        return String.format("%32s", Integer.toBinaryString(x)).replace(' ', '0');
    }
    
    public static void main(String[] args) {
        int n = 0b00000000000000000000000000010101;
        long result = Integer.toUnsignedLong(Solution2.reverseBits(n));

        System.out.println("Reserved bit number: " + result + " (" + toBinary32((int) result) + ")");
    }
}
