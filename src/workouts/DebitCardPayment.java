package workouts;

public class DebitCardPayment implements Payment{
	
	private static final Payment INSTANCE = new DebitCardPayment();

	@Override
	public void pay() {
		System.out.println("debit card payement");
	}
	
	public static Payment getInstance() {
		return INSTANCE;
	}
}
