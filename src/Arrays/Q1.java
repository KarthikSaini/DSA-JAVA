package Arrays;

//Find the largest and smallest element in an array
public class Q1 {

    public void answer(int[] arr){
        int largest = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if (arr[i] > largest){
                largest = arr[i];
            }
            if (arr[i] < small) {
                small = arr[i];
            }
        }

        System.out.println(largest);
        System.out.println(small);
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        Q1 obj = new Q1();
        obj.answer(arr);

    }
}
