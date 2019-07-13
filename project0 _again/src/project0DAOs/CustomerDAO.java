package project0DAOs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import project0.beans.Customer;
import project0.functions.CustomerLogin;

public class CustomerDAO {
	
	public static ConnectionFactory cf = ConnectionFactory.getInstance();

	public void createCustomer(Customer c) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = cf.getConnection();
		String sql = "{ call INSERT INTO CUST VALUES(?,?,?,?)";
		PreparedStatement call = conn.prepareCall(sql);
		call.setString(1, c.getUserName());
		call.setString(2, c.getFirstname());
		call.setString(3, c.getLastName());
		call.setString(4, c.getPassWord());
		call.execute();
	}

	public void getCustomerList() throws SQLException {
		
		Connection conn = cf.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM CUST");// calls the colume of the query
		Customer c = null;
		while (rs.next()) {
			c = new Customer(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
			CustomerLogin.addCustomer(c);
		}
		
	}


}
