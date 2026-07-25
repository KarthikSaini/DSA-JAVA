package Arrays;

//Reverse an array (using two pointers)
public class Q2 {

    public void answer(int[] arr){

        int l = arr.length;
        int temp = 0;

        for(int i=0; i < l / 2; i++){
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }

        for(int i: arr){
            System.out.print(i+" ");
        }
    }

    public void swapUsing2Pointer(int[] arr){
        int right = arr.length-1;
        int left = 0;

        int temp = 0;

        while(left < right){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        for(int i: arr){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {-5,1,2,3,4,5};

        Q2 obj = new Q2();
//        obj.answer(arr);
        obj.swapUsing2Pointer(arr);
    }
}
