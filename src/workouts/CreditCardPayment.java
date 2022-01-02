package workouts;

public class CreditCardPayment implements Payment{
	
	private static final Payment INSTANCE = new CreditCardPayment();
	
	@Override
	public void pay() {
		System.out.println("credit card payement");
	}
	
	public static Payment getInstance() {
		return INSTANCE;
	}

}
