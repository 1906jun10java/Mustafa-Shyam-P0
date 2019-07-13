package project0DAOs;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import project0.Offers;
import project0.beans.Offer;
import project0DAOInterfaces.OfferInterface;

public class OfferDAO implements OfferInterface {
	public static ConnectionFactory cf = ConnectionFactory.getInstance();

	@Override
	public void createOffer(Offer o) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = cf.getConnection();
		String sql = "{ call INSERT INTO OFFER VALUES(?,?,?,?,?)";
		CallableStatement call;
			call = conn.prepareCall(sql);
			call.setInt(1, o.getOfferID());
			call.setString(2, o.getUsername());
			call.setString(5, o.getOfferStatus());
			call.setDouble(4, o.getOffer());
			call.setInt(3, o.getVIN());
			call.execute();
			// TODO Auto-generated catch block
			
		
	}

	public void getOfferList() throws SQLException {

		Connection conn = cf.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM OFFER");// calls the column of the query
		Offer o = null;
		while (rs.next()) {
			o = new Offer(rs.getInt(1), rs.getString(2), rs.getInt(3),rs.getDouble(4),rs.getString(5));
			Offers.makeOffer(o);
		}

	}

}
