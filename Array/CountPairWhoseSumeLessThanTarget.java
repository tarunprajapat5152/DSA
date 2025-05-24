import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountPairWhoseSumeLessThanTarget {
    public int countPairs(List<Integer> nums, int target) {

        int left = 0;
        int right = nums.size() - 1;
        int pairCount = 0;

        Collections.sort(nums); // Ensure the list is sorted
        
        while(left < right){
            int sum = nums.get(left) + nums.get(right);
            if(sum < target){
                pairCount += (right - left); // All pairs with left index can form valid pairs with right index
                left++;
            } else if(sum >= target){
                right--;
            }
        }

        return pairCount;
        
    }

    public static void main(String[] args) {
        CountPairWhoseSumeLessThanTarget obj = new CountPairWhoseSumeLessThanTarget();
        List<Integer> nums = Arrays.asList(-1, 1, 2, 3, 1);
        int target = 2;
        int result = obj.countPairs(nums, target);
        System.out.println("ans is : " + result);
    }
}
