package BehaviouralPatterns;
//Dealing with unll refereneces
//It's good practice to return an ampty object ratehr than a null
//Do nothing implementations
import java.util.ArrayList;
import java.util.List;

class Database{
	private List<String>names;

	public Database() {
		this.names = new ArrayList<>();
		this.names.add("jake");
		this.names.add("bob");
		this.names.add("alice");
		this.names.add("drey");
	}
	
	public boolean existName(String name) {
		if(this.names.contains(name))
			return true;
		return false;
	}
}

abstract class AbstractCustomer{
	protected String customerName;
	public abstract boolean isNull();
	public abstract String getCustomer();
}

class NullCustomer extends AbstractCustomer{

	@Override
	public boolean isNull() {
		return true;
	}

	@Override
	public String getCustomer() {
		return "No customer with given name";
	}
	
}

class RealCustomer extends AbstractCustomer{
	
	private String customerName;
	
	
	public RealCustomer(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public boolean isNull() {
		return false;
	}

	@Override
	public String getCustomer() {
		return this.customerName;
	}
	
}

class CustomerFactory{
	private Database database;

	public CustomerFactory() {
		this.database = new Database();
	}
	
	public AbstractCustomer getCustomer(String name) {
		if(checkName(name)) {
			return new RealCustomer(name);
		}
		return new NullCustomer();
	}

	private boolean checkName(String name) {
		if(database.existName(name))
			return true;
		return false;
	}
}

public class NullObjectPattern {
	public static void main(String[] args) {
		CustomerFactory customerFactory = new CustomerFactory();
		System.out.println(customerFactory.getCustomer("jada").getCustomer());
		System.out.println(customerFactory.getCustomer("drey").getCustomer());
		
	}
}
