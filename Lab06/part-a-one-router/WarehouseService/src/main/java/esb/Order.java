package esb;

public class Order {
	private String orderNumber;
	private double amount;

	public Order() {
	}

	public Order(String orderNumber, double amount) {
		super();
		this.orderNumber = orderNumber;
		this.amount = amount;
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

	@Override
	public String toString() {
		return "Order{" +
				"orderNumber='" + orderNumber + '\'' +
				", amount=" + amount +
				'}';
	}
}
