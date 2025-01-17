package src.order;

import src.model.Order;

public abstract class OrderProcessor implements ValidOrder, ProcessOrder {

    public abstract void validate (Order order);

    public abstract void process (Order order);

    public void processOrder (Order order) {
        validate(order);
        process(order);
    }
}
