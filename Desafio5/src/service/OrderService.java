package src.service;

import src.model.Order;
import src.order.ManageOrder;

public class OrderService {
    private final ManageOrder manageOrder;
    private Order order;

    OrderService (Order order) {
        this.manageOrder = new ManageOrder(order);
    }

    public void createOrder () {
        manageOrder.concludeOrder();
    }
}
