package project0.beans;

public class Employee extends User {
	private String password;
	private int id;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String password) {
		super();
		this.password = password;
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setName(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [password=" + password + ", id=" + id + "]";
	}
	
	
	
	

}
