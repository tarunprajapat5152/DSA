public interface index6 {

    public static int element(int nums[], int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.println(nums[i]);
        }
        return k;        
    }

    public static void main(String[] args) {
        int nums[] = { 2, 2, 3, 3, 4, 5, 6, 7 };
        int val = 3;
        int ans = element(nums, val);
        System.out.println(ans);
    }
}
