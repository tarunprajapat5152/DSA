public class professor {

    public static String professor(int k, int arr[]){

        int temp = 0;

        for (int i : arr) {
            if(i <= 0){
                temp++;
            }
        }

        if(temp >= k){
            return "YES";
        }
        else{
            return "NO";
        }
    }
    public static void main(String[] args) {
        int arr[] = {-1, -2, 0, 4, 5};
        int k = 3;
        String ans = professor(k, arr);
        System.out.println("The answer is: " + ans);
    }
}
