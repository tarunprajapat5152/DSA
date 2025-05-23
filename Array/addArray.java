import java.util.ArrayList;
import java.util.Collections;

public class addArray {

    public static ArrayList<Integer> addArray(int arr1[], int arr2[]){
        ArrayList<Integer> arr3 = new ArrayList<>();
        int n = arr1.length;
        int temp = 0;
        for(int i = n-1; i >= 0; i--){
            int sum = arr1[i] + arr2[i]; 

            String str = Integer.toString(sum);
            if(str.length() > 1){
                if (i != 0) {
                    arr3.add(Character.getNumericValue(str.charAt(1)) + temp);
                    temp = Character.getNumericValue(str.charAt(0));
                } else{
                    arr3.add(Integer.parseInt(str) + temp);
                }
            }
            else{
                if(temp != 0){
                    arr3.add(sum + temp);
                    temp = 0;
                }
                else{
                    arr3.add(sum);
                }
            }
        }
        return arr3;
    }

    public static void main(String[] args) {
        int arr1[] = {1, 5, 6};
        int arr2[] = {8, 20, 8};

        ArrayList<Integer> ans = addArray(arr1, arr2);
        Collections.reverse(ans);
        System.out.println("The sum of the two arrays is: " + ans);
    }
}
