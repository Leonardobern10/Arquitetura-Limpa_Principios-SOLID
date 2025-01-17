package src.order;

import src.model.Order;
import src.invoice.Invoice;
import src.invoice.PdfInvoice;
import src.payment.Payment;
import src.payment.PixPayment;
import src.stock.ChangeStock;
import src.stock.ChangeStockImpl;

import java.util.Objects;

public class ManageOrder implements TemplateManageOrder {
    private final OrderProcessor orderProcessor;
    private final Payment payment;
    private final Invoice invoice;
    private final ChangeStock changeStock;
    private final Order order;

    public ManageOrder (OrderProcessor orderProcessor, Payment payment, Invoice invoice,
                        ChangeStock changeStock, Order order) {
        this.orderProcessor = Objects.requireNonNull(orderProcessor);
        this.payment = Objects.requireNonNull(payment);
        this.invoice = Objects.requireNonNull(invoice);
        this.changeStock = Objects.requireNonNull(changeStock);
        this.order = Objects.requireNonNull(order);
    }

    @Override
    public void validateOrder () {
        orderProcessor.validate(order);
    }

    @Override
    public void processOrder () {
        orderProcessor.processOrder(order);
    }

    @Override
    public void processPayment () {
        payment.process(order);
    }

    @Override
    public void printInvoice () {
        invoice.generateInvoice(order);
    }

    @Override
    public void updateStock () {
        changeStock.update(order);
    }

    @Override
    public void concludeOrder () {
        validateOrder();
        processOrder();
        processPayment();
        printInvoice();
        updateStock();
    }


}
