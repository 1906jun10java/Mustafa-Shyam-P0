package project0DAOs;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import project0.beans.Employee;
import project0.functions.EmployeeLogin;

public class EmployeeDao {
	
public static ConnectionFactory cf = ConnectionFactory.getInstance();
	
	public void createEmployee(Employee e) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = cf.getConnection();
		String sql = "{ call INSERT EMP VALUES(?,?)";
		CallableStatement call = conn.prepareCall(sql);
		call.setInt(1, e.getId());
		call.setString(2, e.getPassword());
		call.execute();
	}

	public void populateEmployee() throws SQLException {
		
		
		Connection conn = cf.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM EMP");// calls the column of the query
		Employee e = null;
		while (rs.next()) {
			e = new Employee(rs.getInt(1), rs.getString(2));
			EmployeeLogin.addEmp(e);
		}
	
	}


}
