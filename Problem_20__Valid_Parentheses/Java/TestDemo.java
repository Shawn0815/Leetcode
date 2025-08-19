package Problem_20__Valid_Parentheses.Java;

public class TestDemo {
    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "([])";

        System.out.println("s1 is valid parentheses: " + Solution2.isValid(s1)); // A: true
        System.out.println("s2 is valid parentheses: " + Solution2.isValid(s2)); // A: true
        System.out.println("s3 is valid parentheses: " + Solution2.isValid(s3)); // A: false
        System.out.println("s4 is valid parentheses: " + Solution2.isValid(s4)); // A: true
    }
}
