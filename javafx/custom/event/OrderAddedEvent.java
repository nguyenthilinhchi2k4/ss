package javafx.custom.event;

import javafx.entity.AddOrders;
import javafx.event.Event;
import javafx.event.EventType;

public class OrderAddedEvent extends Event {
    public static final EventType<OrderAddedEvent> ORDER_ADDED_EVENT_EVENT =
            new EventType<>(Event.ANY, "ORDER_ADDED_EVENT");

    private final AddOrders addOrders;

    public OrderAddedEvent(AddOrders addOrders) {
        super(ORDER_ADDED_EVENT_EVENT);
        this.addOrders = addOrders;
    }

    public AddOrders getAddOrders() {
        return this.addOrders;
    }
}
