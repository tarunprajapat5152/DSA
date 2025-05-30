public class TrappingRainWater {
    public int trap(int[] height) {
        int max = 0;
        int count = 0;
        int n = height.length;
        int left[] = new int[n];
        int right[] = new int[n];

        for(int i = 0; i < n; i++){
            max = Math.max(max, height[i]);
            left[i] = max;
        }

        int max1 = 0;
        for(int j = n-1; j >= 0; j--){
            max1 = Math.max(max1, height[j]);
            right[j] = max1;
        }

        for(int k = 0; k < n; k++){
            if(left[k] < right[k]){
                count += left[k] - height[k];
            } else{
                count += right[k] - height[k];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {3, 1, 2, 4, 0, 1, 3, 2};
        TrappingRainWater obj = new TrappingRainWater();
        int result = obj.trap(arr);
        System.out.println("ans: "+result);
    }
}
