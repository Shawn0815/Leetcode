package Problem_11__Container_With_Most_Water.Java;

public class Solution2 {

    public int maxArea(int[] height) {
        
        int maxArea = 0;
        int left = 0, right = height.length - 1;

        while (left < right) {

            // 計算當前面積
            int area = (right - left) * Math.min(height[left], height[right]);

            // 更新最大面積
            maxArea = Math.max(maxArea, area);

            // 移動矮邊
            if (height[left] < height[right]) {
                left++;
            }
            else {
                right--;
            }
        }

        return maxArea;
    }
}
