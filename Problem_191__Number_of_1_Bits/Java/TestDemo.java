package Problem_191__Number_of_1_Bits.Java;

public class TestDemo {
    public static void main(String[] args) {
        int n = 0b01111111111111111111111111111101;
        System.out.println("Number of one bits is: " + Solution2.hammingWeight(n));
    }
}
