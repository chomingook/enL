package blog.naver.com.dto;

public class Admin {

	private String ADMIN_ID;
	private String ADMIN_PW;
	private int LIB_CODE;
	private int result;
	
	
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public int getLIB_CODE() {
		return LIB_CODE;
	}
	public void setLIB_CODE(int lIB_CODE) {
		LIB_CODE = lIB_CODE;
	}
	public String getADMIN_ID() {
		return ADMIN_ID;
	}
	public void setADMIN_ID(String aDMIN_ID) {
		ADMIN_ID = aDMIN_ID;
	}
	public String getADMIN_PW() {
		return ADMIN_PW;
	}
	public void setADMIN_PW(String aDMIN_PW) {
		ADMIN_PW = aDMIN_PW;
	}
	
	
	
}
