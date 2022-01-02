package workouts;

public class NetBankingPayement implements Payment{
	
	private static final Payment INSTANCE = new NetBankingPayement();

	@Override
	public void pay() {
		System.out.println("net banking payement");
	}
	
	public static Payment getInstance() {
		return INSTANCE;
	}
}
