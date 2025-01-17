package src.invoice;

import src.model.Order;

public interface PrintInvoice {
    void generateInvoice(Order order);
}
