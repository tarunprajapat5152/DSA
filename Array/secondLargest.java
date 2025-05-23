public class secondLargest {

    public static int secondLargest(int arr[]) {
        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < arr.length; i++) {
            if (largest <= arr[i]) {
                largest = arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++) {
            if (largest > arr[i] && secondLargest < arr[i]) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int arr[] = {112, 8, 5, 6, 2};
        int ans = secondLargest(arr);
        System.out.println("The second largest element is: " + ans);
    }
}
