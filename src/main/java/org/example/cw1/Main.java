package org.example.cw1;

import org.example.cw1.Actor;
import org.example.cw1.Human;
import org.example.cw1.Market;

public class Main {
    public static void main(String[] args) {
        Actor human = new Human();
        Market starbucks = new Market();

        starbucks.acceptToMarket(human);
        starbucks.takeInQueue(human);
        starbucks.takeOrders();
        starbucks.giveOrders();
        starbucks.releaseFromQueue();
        starbucks.releaseFromMarket(human);
    }
}