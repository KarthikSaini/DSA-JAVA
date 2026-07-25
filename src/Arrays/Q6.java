package Arrays;

//	Left/right rotate an array by K
public class Q6 {

    public void rotate(int[] arr, int rot){

        int l = arr.length;
        int temp = 0;
        for(int j=0; j < rot % l; j++) {
            for (int i = 0; i < l-1; i++) {
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int rot = 10;

        Q6 obj = new Q6();
        obj.rotate(arr, rot);

        for(int i : arr){
            System.out.print(i+ " ");
        }
    }
}
