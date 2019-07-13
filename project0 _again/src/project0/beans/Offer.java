package project0.beans;
//Offer bean
public class Offer {
	private String username;
	private Double offer;
	private String offerStatus;
	private Integer offerID;
	private Integer VIN;
	
	public Offer() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Offer(Integer offerID, String username, Integer VIN, Double offer, String offerStatus) {
		this.offer = offer;
		this.offerStatus = offerStatus;
		this.offerID = offerID;
		this.username = username;
		this.VIN = VIN;
	}
	public String getUsername() {
		return username;
	}
	
	public Integer getVIN() {
		return VIN;
	}
	
	
	public String getOfferStatus() {
		return offerStatus;
	}
	public void setOfferStatus(String offerStatus) {
		this.offerStatus = offerStatus;
	}
	public Integer getOfferID() {
		return offerID;
	}
	public void setOfferID(Integer offerID) {
		this.offerID = offerID;
	}
	@Override
	public String toString() {
		return "Offer [username=" + username + ", offer=" + offer + ", offerStatus=" + offerStatus + ", offerID="
				+ offerID + ", VIN=" + VIN + "]";
	}
	public Double getOffer() {
		return offer;
	}
	public void setOffer(Double offer) {
		this.offer = offer;
	}
	

}
