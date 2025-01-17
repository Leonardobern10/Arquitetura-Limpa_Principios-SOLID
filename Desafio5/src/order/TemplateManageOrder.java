package src.order;

public interface TemplateManageOrder {
    void validateOrder();
    void processOrder();
    void processPayment();
    void printInvoice();
    void updateStock();
    void concludeOrder();
}
