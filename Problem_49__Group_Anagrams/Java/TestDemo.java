package Problem_49__Group_Anagrams.Java;

public class TestDemo {
    public static void main(String[] args) {
        String[] strs1 = new String[] { "act", "pots", "tops", "cat", "stop", "hat" };
        String[] strs2 = new String[] { "a" };
        String[] strs3 = new String[] { "" };

        Solution1 solution = new Solution1();

        System.out.println(solution.groupAnagrams(strs1));
        System.out.println(solution.groupAnagrams(strs2));
        System.out.println(solution.groupAnagrams(strs3));
    }
}
