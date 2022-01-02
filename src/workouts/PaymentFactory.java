package workouts;

public class PaymentFactory {
	public static Payment getPayement(PaymentType type) {
		if(type == PaymentType.CREDITCARD)
			return CreditCardPayment.getInstance();
		else if(type == PaymentType.DEBITCARD)
			return DebitCardPayment.getInstance();
		else if(type == PaymentType.NETBANKING)
			return NetBankingPayement.getInstance();
		else if(type == PaymentType.UPI)
			return UpiPayment.getInstance();
		return null;
	}
}
