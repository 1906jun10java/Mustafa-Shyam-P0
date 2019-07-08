package project0.beans;

public class Offer {
	private Double offer;
	private String offerStatus;
	private Integer offerID;
	
	public Offer(Double offer, String offerStatus, Integer offerID) {
		super();
		this.offer = offer;
		this.offerStatus = offerStatus;
		this.offerID = offerID;
	}
	public Offer() {
		super();
		// TODO Auto-generated constructor stub
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
		return "Offer [offerStatus=" + offerStatus + ", offerID=" + offerID + "]";
	}
	public Double getOffer() {
		return offer;
	}
	public void setOffer(Double offer) {
		this.offer = offer;
	}
	

}
