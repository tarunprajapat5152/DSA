public class moveZero {

    public static void moveZero(int arr[]) {
        int n = arr.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }
        for(int i = j; i < arr.length; i++){
            arr[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 3, 0 };
        moveZero(arr);
    }
}
