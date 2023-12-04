package com.epam.collections.queue;

import java.util.*;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public static ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> result = new ArrayDeque<>();

        // 0. each player gives 2 cards to the deque
        result.add(firstQueue.remove());
        result.add(firstQueue.remove());
        result.add(secondQueue.remove());
        result.add(secondQueue.remove());


        while (secondQueue.size() > 0) {
            // 1.1 first player takes the top card from the ArrayDeque and adds this card to the end of his Queue
            firstQueue.add(result.removeLast());

            // 1.2 then puts two cards from the beginning of his Queue<Integer> into the ArrayDeque<Integer>.
            result.add(firstQueue.remove());
            result.add(firstQueue.remove());


            // 2.1 second player takes the top card from the ArrayDeque and adds this card to the end of his Queue
            secondQueue.add(result.removeLast());

            // 2.2 then puts two cards from the beginning of his Queue<Integer> into the ArrayDeque<Integer>
            result.add(secondQueue.remove());
            result.add(secondQueue.remove());

        }

        return result;
    }
}
