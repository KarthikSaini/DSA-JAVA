package Arrays;

public class Q11 {

    public int maxProfit(int[] arr){
        if(arr.length == 0){
            return 0;
        }

        int lowest = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] < lowest){
                lowest = arr[i];
            }

            if(arr[i] - lowest > maxProfit){
                maxProfit = arr[i] - lowest;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = {7,6,4,3,1};

        Q11 obj = new Q11();
        int result = obj.maxProfit(arr);
        System.out.println(result);
    }
}
