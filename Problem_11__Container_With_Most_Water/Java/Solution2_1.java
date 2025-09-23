package Problem_11__Container_With_Most_Water.Java;

public class Solution2_1 {

    public int maxArea(int[] height) {
        
        int maxArea = 0;
        int left = 0, right = height.length - 1;

        while (left < right) {

            int area = (right - left) * Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;

                while (left < right && height[left] < height[left - 1]) {
                    left++;
                }
            }
            else {
                right--;

                while (left < right && height[right] < height[right + 1]) {
                    right--;
                }
            }
        }

        return maxArea;
    }
}
