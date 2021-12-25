//Abstraction
interface Database{
	public void connect();
	public void disconnect();
}

//Low Level Module
class MysqlDatabase implements Database{
	@Override
	public void connect() {
		System.out.println("Connecting to Mysql Databse");
	}
	@Override
	public void disconnect() {
		System.out.println("Disconnecting from mysql database");
	}
}

//Another Low Level Module
class OracleDatabase implements Database{
	
	@Override
	public void connect() {
		System.out.println("Connecting to Oracle Databse");
	}
	
	@Override
	public void disconnect() {
		System.out.println("Disconnecting from Oracle database");
	}
}


class DatabaseController{
	
	//We program to an interface so we can achieve a loosely coupled architecture
	private Database database;

	public DatabaseController(Database database) {
		this.database = database;
	}
	
	public void connect() {
		database.connect();
	}
	
	public void disconnect() {
		database.disconnect();
	}
	
	
	
}


public class DependencyInjectionSolution {
	public static void main(String args[]) {
		DatabaseController controller =new DatabaseController(new MysqlDatabase());
		controller.connect();
		controller.disconnect();
		
		controller =new DatabaseController(new OracleDatabase());
		controller.connect();
		controller.disconnect();
	}
}
