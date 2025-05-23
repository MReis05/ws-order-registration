package model.entities;

public class OrderRegistry {
	
	public Order order;
	
	public void addOrder (int id, double orderValue, double deliveryValue, String channel, String paymentMethod) {
	    if (channel.equals("ifood")) {
	    	if(paymentMethod.equals("ifood")) {
	    		order = new Order(id, orderValue, deliveryValue);
	    		order.getIfood().taxForIfood(orderValue, paymentMethod);
	    	}
	    	else if (paymentMethod.equals("dinheiro") || paymentMethod.equals("cartão")) {
	    		order = new Order(id, orderValue, deliveryValue);
	    			order.getIfood().taxForStore(orderValue, paymentMethod);
	    		}
	    }
	    else if (channel.equals("dinheiro") || channel.equals("cartão") || channel.equals("pix")) {
	    	order = new Order(id, orderValue, deliveryValue);
	    	order.getPayment().setPaymentMethod(paymentMethod, orderValue);
	    }
	}
	
	public void addCutOrder (int id, double orderValue, double deliveryValue, String channel, String paymentMethod, double cutPayment) {
		order = new Order(id, orderValue + cutPayment, deliveryValue);
		order.getIfood().cutPayments(orderValue, cutPayment, paymentMethod);
	}
}
