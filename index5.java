public class index5 {

    public static void mergeSortedArray(int num1[], int[] num2, int m, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (num1[i] < num2[j]) {
                num1[k--] = num2[j--];
            } else {
                num1[k--] = num1[i--];
            }
        }

        while (j >= 0) {
            num1[k--] = num2[j--];
        }

        for (int a = 0; a < num1.length; a++) {
            System.out.println(num1[a]);
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 2, 0 };
        int arr2[] = { 1 };
        int m = 1;
        int n = 1;
        mergeSortedArray(arr1, arr2, m, n);
    }
}
