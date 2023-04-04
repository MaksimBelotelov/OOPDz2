package org.example.cw1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Market implements QueueBehaviour, MarketBehaviour{
    List<Actor> visitors = new ArrayList<>();
    Queue<Actor> waiters = new LinkedList<>();

    @Override
    public void acceptToMarket(Actor actor) {
        visitors.add(actor);
    }

    @Override
    public void releaseFromMarket(Actor actor) {
        visitors.remove(actor);
    }

    @Override
    public void takeInQueue(Actor actor) {
        waiters.add(actor);
    }

    @Override
    public void takeOrders() {
        if(!waiters.isEmpty())
            waiters.peek().setTakeOrder();
        else
            System.out.println("Queue is empty");
    }

    @Override
    public void giveOrders() {
        waiters.peek().setMakeOrder();
    }

    @Override
    public void releaseFromQueue() {
        waiters.poll();
    }
}
