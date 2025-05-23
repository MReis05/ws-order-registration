package model.entities;

public class Order {

	private Integer idNumber;
	private Double orderValue;
	private Double deliveryValue;

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

}
