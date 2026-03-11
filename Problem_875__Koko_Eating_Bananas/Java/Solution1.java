package Problem_875__Koko_Eating_Bananas.Java;

public class Solution1 {
    public int minEatingSpeed(int[] piles, int h) {
        int maxPile = 0;

        // 計算最大堆的數量
        for (int pile: piles) {
            maxPile = Math.max(maxPile, pile);
        }

        // 遍歷所有可能的 k 值，從小到大，計算總時間
        // 若總時間第一次 <= h，代表 k 夠大，回傳答案
        for (int k = 1; k <= maxPile; k++) {
            long totalTime = 0;

            for (int pile: piles) {
                totalTime += (pile + k - 1) / k;
            }

            if (totalTime <= h) {
                return k;
            }
        }

        return -1;
    }
}
