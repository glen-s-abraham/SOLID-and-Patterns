package workouts;

public class PaymentManager {
	
	Payment payment;

	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
	public void pay() {
		payment.pay();
	}
	
}
