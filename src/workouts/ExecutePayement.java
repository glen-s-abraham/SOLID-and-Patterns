package workouts;

public class ExecutePayement {
	public static void main(String[] args) {
		PaymentManager manager = new PaymentManager();
		manager.setPayment(PaymentFactory.getPayement(PaymentType.CREDITCARD));
		manager.pay();
	}
}
