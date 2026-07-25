package Arrays;

// Move all zeros to the end
public class Q7 {

    public int[] moveZeroAtEnd(int[] arr) {
        int l = arr.length;
        int p1 = 0;
        int temp = 0;
        int[] result = new int[l];

        for(int i=0; i<l; i++){
            if(arr[i]!=0){
                result[p1] = arr[i];
                p1++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,2,0,3,4,0,5};

        Q7 obj = new Q7();
        int[] result = obj.moveZeroAtEnd(arr);

        for(int i : result){
            System.out.print(i+ " ");
        }
    }


}
