package project0.functions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Payment {
	private int index;
	private Double downpayment;
	private Double principal;
	private Double interest_rate;
	private Integer num_months;
	private Double payment;
	
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Payment(int index, Double downpayment, Double principal, Double interest_rate, Integer num_months,
			Double payment) {
		super();
		this.index = index;
		this.downpayment = downpayment;
		this.principal = principal;
		this.interest_rate = interest_rate;
		this.num_months = num_months;
		this.payment = payment;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public Double getDownpayment() {
		return downpayment;
	}

	public void setDownpayment(Double downpayment) {
		this.downpayment = downpayment;
	}

	public Double getPrincipal() {
		return principal;
	}

	public void setPrincipal(Double principal) {
		this.principal = principal;
	}

	public Double getInterest_rate() {
		return interest_rate;
	}

	public void setInterest_rate(Double interest_rate) {
		this.interest_rate = interest_rate;
	}

	public Integer getNum_months() {
		return num_months;
	}

	public void setNum_months(Integer num_months) {
		this.num_months = num_months;
	}

	public Double getPayment() {
		return payment;
	}

	public void setPayment(Double payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "Payment [index=" + index + ", downpayment=" + downpayment + ", principal=" + principal
				+ ", interest_rate=" + interest_rate + ", num_months=" + num_months + ", payment=" + payment + "]";
	}

	


}
