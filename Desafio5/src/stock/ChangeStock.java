package src.stock;

import src.model.Order;

public abstract class ChangeStock implements UpdateStock {
    public abstract void update (Order order);
}
