package CreationalPatterns;

class DatabaseConnector{
	
	
	//We should not be able to instantiate the class
	//thus we define a private constructor
	//"reflection attack"
	private DatabaseConnector() {}
	
	
	public void connect() {
		System.out.println("Connecting to database..");
	}
	
	public void disconnect() {
		System.out.println("Disconnecting to database..");
	}

	//Singleton instance
	//Eager loading
//	private static DatabaseConnector INSTANCE = new DatabaseConnector();
//	public static DatabaseConnector getInstance() {
//		return INSTANCE;
//	}
	
	//Lazy loading
	private static DatabaseConnector INSTANCE; 
	public static DatabaseConnector getInstance() {
		if(INSTANCE==null)
			//Multi Threading prevention
			synchronized (DatabaseConnector.class) {
				INSTANCE = new DatabaseConnector();
			}
			
		return INSTANCE;
	}
	
	
}

enum Database{
	
	//Acquiring the instance is thread safe
	INSTANCE;
	
	public void connect() {
		System.out.println("Connecting to database..");
	}
	
	public void disconnect() {
		System.out.println("Disconnecting to database..");
	}
}

public class Singleton {
	public static void main(String args[]) {	
		DatabaseConnector.getInstance().connect();
		DatabaseConnector.getInstance().disconnect();
		
		DatabaseConnector obj1 = DatabaseConnector.getInstance();
		DatabaseConnector obj2 = DatabaseConnector.getInstance();
		
		System.out.println(obj1==obj2);
		
		//With enum
		Database.INSTANCE.connect();
		Database.INSTANCE.disconnect();
		
		Database eobj1 = Database.INSTANCE;
		Database eobj2 = Database.INSTANCE;
		
		System.out.println(eobj1==eobj2);
	}
}
