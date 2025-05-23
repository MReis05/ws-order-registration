package model.entities;

public class Ifood {

	private String channel;
	private Double forIfood;
	private Double tax;
	private Integer serviceTax;
	
	private PaymentMethod payment = new PaymentMethod();

	public Ifood() {
	}

	public Ifood(String channel) {
		super();
		this.channel = channel;
	}

	public String getChannel() {
		return channel;
	}

	public Double getForIfood() {
		return forIfood;
	}

	public void setForIfood(Double forIfood) {
		this.forIfood = forIfood;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public Double getTax() {
		return tax;
	}

	public Integer getServiceTax() {
		return serviceTax;
	}

	public void taxForIfood(double value, String channel) {
		setForIfood(value);
		setChannel(channel);
		serviceTax = serviceTax(value);
		tax = value * 0.1679;
	}

	public void taxForStore(double value, String paymentMethod) {
		payment.setPaymentMethod(paymentMethod, value);
		serviceTax = serviceTax(value);
		tax = value * 0.12;
	}

	public int serviceTax(double value) {
		int taxOfService = 0;
		if (value <= 24.99) {
			taxOfService = 1;
		}
		return taxOfService;
	}

	public void cutPayments(double order, double cutValue, String paymentMethod) {
		payment.setPaymentMethod(paymentMethod, order);
		forIfood = cutValue;
		taxForStore(order + cutValue, paymentMethod);
	}

	public PaymentMethod getPayment() {
		return payment;
	}
}
