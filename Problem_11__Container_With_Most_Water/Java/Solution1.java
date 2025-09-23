package Problem_11__Container_With_Most_Water.Java;

public class Solution1 {

    public int maxArea(int[] height) {
        
        int maxArea = 0;

        // 設定左邊界
        for (int i = 0; i < height.length - 1; i++) {

            // 嘗試每一個右邊界，計算圍起來的面積
            for (int j = i + 1; j < height.length; j++) {

                // 底 = 兩邊界的水平距離；高 = 兩邊界中相對較矮邊界高
                int area = (j - i) * Math.min(height[i], height[j]);

                // 更新最大面積
                maxArea = Math.max(maxArea, area);
            }
        }

        return maxArea;
    }
}
