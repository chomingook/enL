package blog.naver.com.dto;

public class Admin {

	private String ADMIN_ID;
	private String ADMIN_PW;
	
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
	
	@Override
	public String toString() {
		return "Admin [ADMIN_ID=" + ADMIN_ID + ", ADMIN_PW=" + ADMIN_PW + "]";
	}
	
	
}
