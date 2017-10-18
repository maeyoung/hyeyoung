package student_info_manage;

public class StudentInfo extends UserInfo{
	private String userNumber;
	private int userID;
	
	public StudentInfo(String userName, int userAge, String uNumber, int uID) {
		super(userName, userAge);
		this.userNumber = uNumber;
		this.userID = uID;
	}

	public void setUserNumber(String uNumber) {
		userNumber = uNumber;
	}
	
	public void setUserID(int uID) {
		userID = uID;
	}
	
	public String getUserNumber() {
		return userNumber;
	}

	public int getUserID() {
		return userID;
	}

	

}
