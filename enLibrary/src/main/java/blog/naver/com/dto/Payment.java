package blog.naver.com.dto;

public class Payment {
	private int paymentcode;
	private int rentalcode;
	private String memberid;
	private String paymentday;
	private int paymentprice;
	public int getPaymentcode() {
		return paymentcode;
	}
	public void setPaymentcode(int paymentcode) {
		this.paymentcode = paymentcode;
	}
	public int getRentalcode() {
		return rentalcode;
	}
	public void setRentalcode(int rentalcode) {
		this.rentalcode = rentalcode;
	}
	public String getMemberid() {
		return memberid;
	}
	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}
	public String getPaymentday() {
		return paymentday;
	}
	public void setPaymentday(String paymentday) {
		this.paymentday = paymentday;
	}
	public int getPaymentprice() {
		return paymentprice;
	}
	public void setPaymentprice(int paymentprice) {
		this.paymentprice = paymentprice;
	}
	@Override
	public String toString() {
		return "Payment [paymentcode=" + paymentcode + ", rentalcode=" + rentalcode + ", memberid=" + memberid
				+ ", paymentday=" + paymentday + ", paymentprice=" + paymentprice + "]";
	}
	
	
	
	
	
}
