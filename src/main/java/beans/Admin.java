package beans;

public class Admin {
	private String adminId;
	private String adminName;
	private String adminSex;
	private String passWord;
	
	public Admin() {
		
	}
	public Admin(String adminId, String adminName, String adminSex, String passWord) {
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminSex = adminSex;
		this.passWord = passWord;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getAdminSex() {
		return adminSex;
	}
	public void setAdminSex(String adminSex) {
		this.adminSex = adminSex;
	}
	
}
