package project0.beans;

public class Customer extends User {
	
	private String Firstname;
	private String LastName;
	private String UserName;
	private String PassWord;
	private int OfferID;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Customer(String UserName, String Firstname, String LastName, String PassWord) {
		super();
		this.Firstname = Firstname;
		this.LastName = LastName;
		this.UserName = UserName;
		this.PassWord = PassWord;
	
		
	}
	
	
	public int getOfferID() {
		return OfferID;
	}
	public void setOfferID(int OfferID) {
		this.OfferID = OfferID;
	}



	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassWord() {
		return PassWord;
	}

	public void setPassWord(String passWord) {
		PassWord = passWord;
	}



	@Override
	public String toString() {
		return "Customer [Firstname=" + Firstname + ", LastName=" + LastName + ", UserName=" + UserName + ", PassWord="
				+ PassWord + "]";
	}

	

		
	
	
	

}
