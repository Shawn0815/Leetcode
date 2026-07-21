package Prime_Factor;

import java.util.*;

public class Solution {
    public void primeFactor(int num) {
        int prime = 2;
        List<Integer> list = new ArrayList<>();

        while (prime * prime <= num) {
            if ((num % prime) == 0) {
                list.add(prime);
                num = num / prime;
            }
            else {
                prime++;
            }
        }

        list.add(num);

        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                System.out.print(" x ");
            }

            System.out.print(list.get(i));
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.primeFactor(7);
    }
}
