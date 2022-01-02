package workouts;

public class UpiPayment implements Payment{

	private static final Payment INSTANCE = new UpiPayment();

	@Override
	public void pay() {
		System.out.println("upi card payement");
	}
	
	public static Payment getInstance() {
		return INSTANCE;
	}
}
