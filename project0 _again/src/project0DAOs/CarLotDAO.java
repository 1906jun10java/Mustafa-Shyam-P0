package project0DAOs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import project0.beans.Car;
import project0.functions.CarLot;
import project0.functions.CustomerCarLot;
import project0DAOInterfaces.CarLotInterface;

public class CarLotDAO implements CarLotInterface {
	
	
	
	public static ConnectionFactory cf = ConnectionFactory.getInstance();

	@Override
	public void makeCar(Car c) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = cf.getConnection();
		String sql = "{ INSERT INTO CAR VALUES(?,?,?,?,?,?,?)";
		PreparedStatement call = conn.prepareCall(sql);
		call.setInt(1,c.getVIN());
		call.setString(2, c.getMake());
		call.setString(3,c.getModel());
		call.setInt(4,c.getYearManufactured());
		call.setString(5, c.getChassisType());
		call.setDouble(6, c.getCost());
		call.setString(7,c.getColor());
		call.execute();
	}
	public void getCarList() throws SQLException {
		
		
		Connection conn = cf.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM CAR");
		Car car = null; 
		while (rs.next()) {
			car = new Car(rs.getInt(1), rs.getString(2),rs.getString(3), rs.getInt(4),rs.getString(5),rs.getDouble(6),rs.getString(7));
			CarLot.addCar(car);
			CustomerCarLot.addCustomerCar(car);
		}
		
		
	}

}
