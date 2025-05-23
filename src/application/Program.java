package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Ifood;
import model.entities.Order;
import model.entities.PV;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		Ifood ifood = null;
		PV pv = null;

		System.out.print("Digite o Id: ");
		int id = sc.nextInt();
		System.out.print("Digite o valor do Pedido: ");
		double orderValue = sc.nextDouble();
		System.out.print("Digite o valor da entrega: ");
		double deliveryValue = sc.nextDouble();
		System.out.print("Por qual canal: ");
		String channel = sc.next().toLowerCase();
		

		if (channel.equals("ifood")) {
			System.out.print("Qual metódo de pagamento: ");
			String paymentMethod = sc.next().toLowerCase();
			if (paymentMethod.equals(channel)) {
				ifood = new Ifood(new Order(id, orderValue, deliveryValue));
			} else if (paymentMethod.equals("dinheiro") || paymentMethod.equals("cartão")) {
				System.out.print("O pedido é um valor cortado: ");
				String cutQuestion = sc.next().toLowerCase();
				if (cutQuestion.equals("sim")) {
					System.out.print("Qual será o restante: ");
					double cutPayment = sc.nextDouble();
					ifood = new Ifood(new Order(id, orderValue, deliveryValue), cutPayment, paymentMethod);
				} else {
					ifood = new Ifood(new Order(id, orderValue, deliveryValue), paymentMethod);
				}
			}

		} else {
			pv = new PV(new Order(id, orderValue, deliveryValue), channel);
		}
		
		if (ifood != null) {
			System.out.println(ifood);
		}
		else if(pv != null) {
			System.out.println(pv);
		}

		sc.close();

	}

}
