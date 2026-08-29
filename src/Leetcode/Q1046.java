package Leetcode;

import java.util.Collections;
import java.util.PriorityQueue;

public class Q1046 {

    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        if(stones.length == 1){
            return stones[0];
        }

        if(stones.length == 2){
            if(stones[0] > stones[1]){
                return stones[0] - stones[1];
            } else if (stones[1] > stones[0]) {
                return stones[1] - stones[0];
            }
            return 0;
        }

        for(int i : stones){
            priorityQueue.add(i);
        }

        while (priorityQueue.size() > 0){
            if(priorityQueue.size() == 1){
                break;
            }
            int x = priorityQueue.poll();
            int y = priorityQueue.poll();

            if(x > y){
                priorityQueue.add(x-y);
            } else if (x < y){
                priorityQueue.add(y - x);
            } else {
                priorityQueue.add(0);
            }
        }

//        int x = priorityQueue.poll();
//        System.out.println(x+"   sout"+priorityQueue.peek());
//        if(x > y){
//            return (x-y);
//        } else if (x < y){
//            return (y - x);
//        }
//

        return priorityQueue.poll();
    }

    public static void main(String[] args) {
//        int[] input = {2,7,4,1,8,1};
//        int[] input = {3,7,2};
        int[] input = {9,3,2,10};
        int result = lastStoneWeight(input);
        System.out.println(result);
    }
}
