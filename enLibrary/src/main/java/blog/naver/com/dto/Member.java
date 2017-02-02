package blog.naver.com.dto;

public class Member {
	private String MEMBER_ID;
	private String MEMBER_PW;
	private String MEMBER_NAME;
	private int MEMBER_BIRTHDAY;
	private String MEMBER_PHONE;
	private String MEMBER_ADDR;
	private String JOIN_DAY;
	private int LIB_CODE;
	private int RENTAL_COUNT;
	private char MEMBER_PAYMENTSTATUS;
	
	public String getMEMBER_ID() {
		return MEMBER_ID;
	}
	public void setMEMBER_ID(String mEMBER_ID) {
		MEMBER_ID = mEMBER_ID;
	}
	public String getMEMBER_PW() {
		return MEMBER_PW;
	}
	public void setMEMBER_PW(String mEMBER_PW) {
		MEMBER_PW = mEMBER_PW;
	}
	public String getMEMBER_NAME() {
		return MEMBER_NAME;
	}
	public void setMEMBER_NAME(String mEMBER_NAME) {
		MEMBER_NAME = mEMBER_NAME;
	}
	public int getMEMBER_BIRTHDAY() {
		return MEMBER_BIRTHDAY;
	}
	public void setMEMBER_BIRTHDAY(int mEMBER_BIRTHDAY) {
		MEMBER_BIRTHDAY = mEMBER_BIRTHDAY;
	}
	public String getMEMBER_PHONE() {
		return MEMBER_PHONE;
	}
	public void setMEMBER_PHONE(String mEMBER_PHONE) {
		MEMBER_PHONE = mEMBER_PHONE;
	}
	public String getMEMBER_ADDR() {
		return MEMBER_ADDR;
	}
	public void setMEMBER_ADDR(String mEMBER_ADDR) {
		MEMBER_ADDR = mEMBER_ADDR;
	}
	public String getJOIN_DAY() {
		return JOIN_DAY;
	}
	public void setJOIN_DAY(String jOIN_DAY) {
		JOIN_DAY = jOIN_DAY;
	}
	public int getLIB_CODE() {
		return LIB_CODE;
	}
	public void setLIB_CODE(int lIB_CODE) {
		LIB_CODE = lIB_CODE;
	}
	public int getRENTAL_COUNT() {
		return RENTAL_COUNT;
	}
	public void setRENTAL_COUNT(int rENTAL_COUNT) {
		RENTAL_COUNT = rENTAL_COUNT;
	}
	public char getMEMBER_PAYMENTSTATUS() {
		return MEMBER_PAYMENTSTATUS;
	}
	public void setMEMBER_PAYMENTSTATUS(char mEMBER_PAYMENTSTATUS) {
		MEMBER_PAYMENTSTATUS = mEMBER_PAYMENTSTATUS;
	}
	
	
	
	
}
