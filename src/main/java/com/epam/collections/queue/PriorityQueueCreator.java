package com.epam.collections.queue;

import java.util.*;

public class PriorityQueueCreator {
    public static PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        ArrayList<String> firstArr = new ArrayList<>(firstList);
        firstArr.addAll(secondList);
        PriorityQueue<String> result = new PriorityQueue<>(Comparator.reverseOrder());
        result.addAll(firstArr);
        return result;

    }
}
