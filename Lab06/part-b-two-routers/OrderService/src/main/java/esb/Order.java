package esb;

public class Order {
	public enum OrderType{
		INTERNATIONAL, DOMESTIC;
	}
	private String orderNumber;
	private double amount;
	private OrderType orderType;

	public Order(String orderNumber, double amount, OrderType orderType) {
		super();
		this.orderNumber = orderNumber;
		this.amount = amount;
		this.orderType = orderType;
	}

	public OrderType getOrderType() {
		return orderType;
	}

	public void setOrderType(OrderType orderType) {
		this.orderType = orderType;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public String toString(){
		return "order: nr="+orderNumber+" amount="+amount;
	}

}
