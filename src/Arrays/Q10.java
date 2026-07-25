package Arrays;

// Two Sum problem
public class Q10 {

    public int[] twoSum(int[] arr, int target) {

        int[] result = new int[2];
        for(int i=0; i<arr.length-1;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 8, 6};
        int target = 14;

        Q10 obj = new Q10();
        int[] result = obj.twoSum(arr, target);
        System.out.println(result[0]+ " " + result[1]);
    }


}
