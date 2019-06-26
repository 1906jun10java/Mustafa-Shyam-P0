package project0;

public class User<T>{
	private T Username;
	private T Password;
	
	public User(T username, T password) {
		super();
		Username = username;
		Password = password;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public T getUsername() {
		return Username;
	}

	public void setUsername(T username) {
		Username = username;
	}

	public T getPassword() {
		return Password;
	}

	public void setPassword(T password) {
		Password = password;
	}

	@Override
	public String toString() {
		return "User [Username=" + Username + ", Password=" + Password + "]";
	}
	
	
	
	
	

}
