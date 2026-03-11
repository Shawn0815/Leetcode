package Problem_875__Koko_Eating_Bananas.Java;

public class Solution2 {
    public int minEatingSpeed(int[] piles, int h) {
        int k = 1;

        // 無窮回圈嘗試所有 k 值
        while (true) {
            long totalTime = 0;

            // 計算總時間
            for (int pile: piles) {
                // totalTime += (int) Math.ceil((double) pile/k);
                totalTime += (pile + k - 1) / k;
            }

            // 若總時間 <= h，代表 k 值夠大，達標，回傳答案。
            if (totalTime <= h) {
                return k;
            }

            // 嘗試下一個 k
            k++;
        }
    }
}
