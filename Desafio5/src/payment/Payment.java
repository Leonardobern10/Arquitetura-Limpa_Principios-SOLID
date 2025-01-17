package src.payment;

import src.model.Order;

public abstract class Payment implements ProcessPayment {
    public abstract void process (Order order);
}
