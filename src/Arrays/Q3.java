package Arrays;

//•	Find the second largest element
public class Q3 {

    public int secLarEle(int[] arr){
        int secLar = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                secLar = largest;
                largest = arr[i];
            }
            if(arr[i] > secLar & arr[i] < largest){
                secLar = arr[i];
            }
        }

        return secLar;
    }

    public static void main(String[] args) {
        int[] arr = {-5,1,2,3,4,5};

        Q3 obj = new Q3();
        int result = obj.secLarEle(arr);
        System.out.println(result);
    }
}
