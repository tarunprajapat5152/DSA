import java.util.ArrayList;

public class IndexesofSubarraySum {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int left = 0;
        int right = 0;
        int sum = 0;
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum >= target) {
                right = i;

                while (sum > target && left < right) {
                    sum -= arr[left];
                    left++;
                }

                if (sum == target) {
                    res.add(left + 1);
                    res.add(right + 1);
                    return res; 
                }
            } 
        }
        res.add(-1);
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 7, 5 };
        int target = 12;
        ArrayList<Integer> result = subarraySum(arr, target);
        System.out.println("result : " + result);
    }
}
