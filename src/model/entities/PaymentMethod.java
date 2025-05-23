package model.entities;

public class PaymentMethod {

	private String paymentMethod;
	private Double cash;
	private Double card;
	private Double Pix;

	public PaymentMethod() {
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod, double value) {
		this.paymentMethod = paymentMethod;
		switch (paymentMethod) {
		case "dinheiro":
			setCash(value);
			break;
		case "cartão":
			setCard(value);
			break;
		case "pix":
			setPix(value);
			break;
		}
	}

	public Double getCash() {
		return cash;
	}

	public void setCash(Double cash) {
		this.cash = cash;
	}

	public Double getCard() {
		return card;
	}

	public void setCard(Double card) {
		this.card = card;
	}

	public Double getPix() {
		return Pix;
	}

	public void setPix(Double pix) {
		Pix = pix;
	}

	public Double change(double change) {
		return change - cash;
	}
}
