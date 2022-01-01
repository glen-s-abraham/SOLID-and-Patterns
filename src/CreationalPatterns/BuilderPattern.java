package CreationalPatterns;
//If we have a large set of variables in a class it's
//difficult to keep track of the constructors aswell as the geters and setters
//"telescoping constructors"-if we want to add another optional parameters we have
//to add sperate constructors
//If we use the builder patters we just need to use one method
//The builder pattern satisifies the immutable property
class Person{
	private String name;
	private String email;
	private String address;
	private Integer age;
	private String university;
	
	
	public Person(Builder builder) {
		this.name = builder.name;
		this.email = builder.email;
		this.address = builder.address;
		this.age = builder.age;
		this.university = builder.university;
	}


	 public static class Builder {
		private final String name;
		private final String email;
		private String address;
		private Integer age;
		private String university;
		
		
		public Builder(String name, String email) {
			this.name = name;
			this.email = email;
		}
		public Builder setAddress(String address) {
			this.address = address;
			return this;
		}
		public Builder setAge(Integer age) {
			this.age = age;
			return this;
		}
		public Builder setUniversity(String university) {
			this.university = university;
			return this;
		}
		public Person build() {
			return new Person(this);
		}
		
		
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", address=" + address + ", age=" + age + ", university="
				+ university + "]";
	}
	 
	
	
}

class Student {
	 
    // these are the compulsory parameters we have to specify
private final String name;
private final String university;
    // optional parameter
private final int age;

public Student(Builder builder){
	this.name = builder.name;
	this.university = builder.university;
	this.age = builder.age;
}

public static class Builder {
	
	private final String name;
	private final String university;
	private int age;
	
	public Builder(String name, String university){
		this.name = name;
		this.university = university;
	}
	
	public Builder setAge(int age){
		this.age = age;
		return this;
	}
	
	public Student build(){
		return new Student(this);
	}
}

@Override
public String toString() {
	return this.name+"-"+this.university+"-"+this.age;
}
}


public class BuilderPattern {
	public static void main(String args[]) {
		Person person = new Person.Builder("Glen","glen@gmail.com").build();
		Student student = new Student.Builder("rakesh", "mgu").setAge(21).build();
		System.out.println(person);
		System.out.println(student);
	}
}

