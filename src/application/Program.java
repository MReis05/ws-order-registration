package application;

import java.util.Locale;
import java.util.Scanner;
import model.entities.OrderRegistry;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		OrderRegistry registy = new OrderRegistry();

		System.out.print("Digite o Id: ");
		int id = sc.nextInt();
		System.out.print("Digite o valor do Pedido: ");
		double orderValue = sc.nextDouble();
		System.out.print("Digite o valor da entrega: ");
		double deliveryValue = sc.nextDouble();
		System.out.print("Por qual canal: ");
		String channel = sc.next().toLowerCase();
		System.out.print("Qual metódo de pagamento: ");
		String paymentMethod = sc.next().toLowerCase();

		if (channel.equals("ifood") && paymentMethod.equals("dinheiro") || paymentMethod.equals("cartão")) {
			System.out.print("O pedido é um valor cortado: ");
			String cutQuestion = sc.next().toLowerCase();
			if (cutQuestion.equals("sim")) {
				System.out.print("Qual será o restante: ");
				double cutPayment = sc.nextDouble();
				registy.addCutOrder(id, orderValue, deliveryValue, channel, paymentMethod, cutPayment);
			} else {
				registy.addOrder(id, orderValue, deliveryValue, channel, paymentMethod);
			}
		} else {
			registy.addOrder(id, orderValue, deliveryValue, channel, paymentMethod);
		}

		sc.close();

	}

}
