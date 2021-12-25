////Low Level Module
//class MysqlDatabase{
//	public void connect() {
//		System.out.println("Connecting to Mysql Databse");
//	}
//	public void disconnect() {
//		System.out.println("Disconnecting from mysql database");
//	}
//}
//
////Another Low Level Module
//class OracleDatabase{
//	public void connect() {
//		System.out.println("Connecting to Oracle Databse");
//	}
//	public void disconnect() {
//		System.out.println("Disconnecting from Oracle database");
//	}
//}
//
////High Level  Module
////to add oracle we need to change this module
//class DatabaseController{
//	//private MysqlDatabase database;
//	private OracleDatabase database;
//
//	public DatabaseController() {
//		//tight binding
//		//this.database = new MysqlDatabase();
//		this.database = new OracleDatabase();
//		database.connect();
//		database.disconnect();
//	}
//	
//	
//	
//}
//
//
//public class DependencyInversionProblem {
//	public static void main(String args[]) {
//		new DatabaseController();
//	}
//}
