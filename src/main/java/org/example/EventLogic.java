package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

public class EventLogic {
    private Stack<Event> stack = new Stack<>();
    private ArrayList<Event> eventVariations = new ArrayList<>();

    private Shop shop;


    public EventLogic(Shop shop) {
        this.stack = stack;
        this.eventVariations = eventVariations;
        this.shop = shop;
        eventVariations.add(new EventAddToStorage());
        eventVariations.add(new EventMoveToDisplay());
        eventVariations.add(new EventCustomerBoughtProduct());
        eventVariations.add(new EventProductOnDiscount());
    }

    public void addRandomEvent() {
        Random random_method = new Random();

        int index = random_method.nextInt(eventVariations.size());
        stack.add(eventVariations.get(index));
    }

    public void runNextEvent() {
        stack.pop().runRandom(shop);
    }
}
