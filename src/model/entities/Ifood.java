package model.entities;

public class Ifood extends Order {

	private Double forIfood;
	private Double tax;
	private Integer serviceTax;

	private PaymentMethod payment = new PaymentMethod();

	public Ifood(Order order) {
		super(order.getIdNumber(), order.getOrderValue(), order.getDeliveryValue());
		taxForIfood(order.getOrderValue());
	}

	public Ifood(Order order, String payment) {
		super(order.getIdNumber(), order.getOrderValue(), order.getDeliveryValue());
		taxForStore(order.getOrderValue(), payment);
	}

	public Ifood(Order order, double cutValue, String payment) {
		super(order.getIdNumber(), order.getOrderValue(), order.getDeliveryValue());
		cutPayments(order.getOrderValue(), cutValue, payment);
	}

	public Double getForIfood() {
		return forIfood;
	}

	public void setForIfood(Double forIfood) {
		this.forIfood = forIfood;
	}

	public Double getTax() {
		return tax;
	}

	public Integer getServiceTax() {
		return serviceTax;
	}

	public void taxForIfood(double value) {
		setForIfood(value);
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

	@Override
	public String toString() {
		return "Ifood [forIfood=" + forIfood + ", tax=" + tax + ", serviceTax=" + serviceTax;
	}
}
