package model.entities;

public class Order {

	private Integer idNumber;
	private Double orderValue;
	private Double deliveryValue;

	private Ifood ifood = new Ifood();
	private PaymentMethod payment = new PaymentMethod();

	public Order(Integer idNumber, Double orderValue, Double deliveryValue) {
		this.idNumber = idNumber;
		this.orderValue = orderValue;
		this.deliveryValue = deliveryValue;
	}

	public Integer getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(Integer idNumber) {
		this.idNumber = idNumber;
	}

	public Double getOrderValue() {
		return orderValue;
	}

	public void setOrderValue(Double orderValue) {
		this.orderValue = orderValue;
	}

	public Double getDeliveryValue() {
		return deliveryValue;
	}

	public void setDeliveryValue(Double deliveryValue) {
		this.deliveryValue = deliveryValue;
	}

	public Ifood getIfood() {
		return ifood;
	}

	public void setIfood(Ifood ifood) {
		this.ifood = ifood;
	}

	public PaymentMethod getPayment() {
		return payment;
	}

	public void setPayment(PaymentMethod payment) {
		this.payment = payment;
	}

}
