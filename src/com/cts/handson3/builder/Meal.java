package com.cts.handson3.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private final List<Item> items;

    public Meal() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        return items.stream()
                .map(item -> item.price())
                .reduce(0.0f, (aFloat, aFloat2) -> aFloat + aFloat2);
    }

    public void showItems() {
        items.stream()
                .forEach(item -> {
                    System.out.print("Item : " + item.name());
                    System.out.print(", Packing : " + item.packing()
                            .pack());
                    System.out.println(", Price : " + item.price());
                });
    }
}
