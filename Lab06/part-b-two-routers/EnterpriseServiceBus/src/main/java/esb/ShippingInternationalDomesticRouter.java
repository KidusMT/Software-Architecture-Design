package esb;

public class ShippingInternationalDomesticRouter {
    public String route(Order order) {
        String destinationChannel = null;
        switch(order.getOrderType()){
            case INTERNATIONAL:
                destinationChannel = "internationalshippingchannel";
                break;
            case DOMESTIC:
                destinationChannel = "domesticshippingchannel";
                break;
        }
        return destinationChannel;
    }
}
