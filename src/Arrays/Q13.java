package Arrays;

// Rearrange array alternating positive/negative
public class Q13 {

    public int[] rearrangeArray(int[] pos, int[] neg) {

        if(pos.length == 0){
            return neg;
        }

        if(neg.length == 0){
            return pos;
        }

        int l1 = pos.length;
        int l2 = neg.length;
        int pp = 0;
        int pn = 0;
        int[] result = new int[l1+l2];

        for(int i=0; i<result.length; i++){
            if(i%2 == 0){
                if(pp<=l1-1){
                    result[i] = pos[pp];
                    pp++;
                } else {
                    result[i] = neg[pn];
                    pn++;
                }

            } else {
                if(pn<=l2-1){
                    result[i] = neg[pn];
                    pn++;
                } else {
                    result[i] = pos[pp];
                    pp++;
                }

            }
        }

        return result;
    }



    public static void main(String[] args) {
            int[] arr1 = {1,2,3};
            int[] arr2 = { -1,-2,-3};

            Q13 obj = new Q13();
            int[] result =
                    obj.rearrangeArray(arr1,arr2);

            for (int i : result) {
                System.out.print(i + " ");
            }
    }

}
