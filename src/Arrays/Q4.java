package Arrays;

//•	Check if array is sorted
public class Q4 {

    public boolean isSortedArray(int[] arr){

        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {};

        Q4 obj = new Q4();
        System.out.println(obj.isSortedArray(arr));

    }
}
