package src.payment;

import src.model.Order;

public interface ProcessPayment {
    void process(Order order);
}
