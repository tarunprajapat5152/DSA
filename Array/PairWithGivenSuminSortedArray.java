public class PairWithGivenSuminSortedArray {
    int countPairs(int arr[], int target) {
        // Complete the function
        int left = 0;
        int right = arr.length - 1;
        int pair = 0;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {

                int cnt1 = 0, cnt2 = 0;
                int leftVal = arr[left];
                int rightVal = arr[right];

                while (left <= right && arr[left] == leftVal) {
                    left++;
                    cnt1++;
                }
                while (left <= right && arr[right] == rightVal) {
                    right--;
                    cnt2++;
                }

                if (leftVal == rightVal) {
                    pair += (cnt1 * (cnt1 - 1)) / 2;
                } else {
                    pair += cnt1 * cnt2;
                }
            }
        }
        return pair;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int target = 6;
        PairWithGivenSuminSortedArray obj = new PairWithGivenSuminSortedArray();
        int ans = obj.countPairs(arr, target);
        System.out.println("ans is : " + ans);
        System.out.println("Expected output is : 2");
    }
}
