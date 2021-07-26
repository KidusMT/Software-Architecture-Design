package esb;

public class ShippingRouter {
    public String route(Order order) {
        String destinationChannel = "normalshippingchannel";
        if (order.getAmount() > 175)
            destinationChannel = "nextdayshippingchannel";
        return destinationChannel;
    }
}
