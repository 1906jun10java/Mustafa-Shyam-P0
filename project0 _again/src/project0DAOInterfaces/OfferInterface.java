package project0DAOInterfaces;

import java.sql.SQLException;

import project0.beans.Offer;

public interface OfferInterface {
	
	

	public void createOffer(Offer o) throws SQLException;

}
