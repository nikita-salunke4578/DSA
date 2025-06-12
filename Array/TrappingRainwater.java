//Given n non-negative integers representing an elevation(height) Map where the width of each bar is 1, compute how much water it can trap after raining.
//height=[4,2,0,6,3,2,5];

package Array;

public class TrappingRainwater {
    public static void main(String[] args) {
        int[] height = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("Trapped Water= " + TrappedWater(height));
    }

    private static int TrappedWater(int[] height) {
        int n = height.length;

        //find left Max Boundary- Array
        int[] leftmax = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }

        //find Right Max Boundary- Array
        int[] rightmax = new int[n];
        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }

        int trappedWater = 0;
        //loop
        for (int i = 0; i < n; i++) {
            //WaterLevel=min(left Max Boundary, Right Max Boundary)
            int WaterLevel = Math.min(leftmax[i], rightmax[i]);

            //Trapped water+=(waterLevel-BarHeight)*width
            trappedWater += ((WaterLevel - height[i]));
        }
        return trappedWater;

    }
}
