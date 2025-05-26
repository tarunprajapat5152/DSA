import java.util.Arrays;
import java.util.List;

public class SumPairClosestToTarget {
    public List<Integer> sumClosest(int[] arr, int target) {
        // code here
        int left = 0;
        int right = arr.length - 1;
        int arr1[] = new int[2];
        int min = Integer.MAX_VALUE;

        Arrays.sort(arr);

        while (left < right && arr.length != 1) {
            int sum = arr[left] + arr[right];
            int diff = Math.abs(sum - target);
            if (min > diff) {
                min = diff;
                arr1[0] = arr[left];
                arr1[1] = arr[right];
            }
            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return arr.length == 1 ? Arrays.asList() : Arrays.asList(arr1[0], arr1[1]);
    }

    public static void main(String[] args) {
        SumPairClosestToTarget sp = new SumPairClosestToTarget();
        int[] arr = { 10, 30, 20, 5 };
        int target = 25;
        List<Integer> result = sp.sumClosest(arr, target);
        System.out.println("Pair closest to target: " + result);
    }
}
