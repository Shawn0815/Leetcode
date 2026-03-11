package Problem_875__Koko_Eating_Bananas.Java;

public class Solution3 {
    public int minEatingSpeed(int[] piles, int h) {
        int maxPile = 0;

        // 計算最大堆的數量
        for (int pile: piles) {
            maxPile = Math.max(maxPile, pile);
        }

        // 設 low 為頭，high 為 尾
        int low = 1, high = maxPile;

        // 只要 low 沒有超過 high 就繼續做 Binary Search
        while (low <= high) {
            long totalTime = 0;

            // 找到 middle 作為檢查的 k 值
            int k = (low + high) / 2;

            // 計算此 k 值對應的總時間
            for (int pile: piles) {
                totalTime += (pile + k - 1) / k;
            }

            // 總時間合法，要找第一個合法，high 往左縮
            if (totalTime <= h) {
                high = k - 1;
            }
            // 總時間不合法，要找第一個合法，low 往右縮
            else {
                low = k + 1;
            }
        }

        // 最後 low 在的位置即為第一個合法的位置
        return low;
    }
}
