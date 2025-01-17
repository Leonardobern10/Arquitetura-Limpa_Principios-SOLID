package src.invoice;

import src.model.Order;

public abstract class Invoice implements PrintInvoice {
    public abstract void generateInvoice(Order order);
}
