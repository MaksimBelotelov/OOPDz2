package org.example.cw1;

public abstract class Actor implements ActorBehavior {
    protected String name;
    protected boolean makeOrder;
    protected boolean takeOrder;

    public boolean isMakeOrder() {
        return makeOrder;
    }
    public boolean isTakeOrder() {
        return takeOrder;
    }

    public abstract String getName();
}
