package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {

        List<Integer> result = new ArrayList<>();

        List<Integer> q = new LinkedList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            q.add(i);
        }

        int step = everyDishNumberToEat - 1;
        int i = 0;
        while (!q.isEmpty()) {
            i = (i + step) % q.size();
            int dish = q.remove(i);
            result.add(dish);
        }

        return result;
    }
}
