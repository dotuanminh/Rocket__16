import java.time.LocalDate;
import java.util.Arrays;

public class Account {
    int accountID;
    String email;
    String userName;
    String fullName;
    Department departmentID;
    Position positionID;
    LocalDate createDate;
	public Group[] groups;
	public Account(int accountID, String email, String userName, String fullName, Department departmentID,
			Position positionID, LocalDate createDate, Group[] groups) {
		this.accountID = accountID;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
		this.departmentID = departmentID;
		this.positionID = positionID;
		this.createDate = createDate;
		this.groups = groups;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Account [accountID=" + accountID + ", email=" + email + ", userName=" + userName + ", fullName="
				+ fullName + ", departmentID=" + departmentID + ", positionID=" + positionID + ", createDate="
				+ createDate + ", groups=" + Arrays.toString(groups) + "]";
	}
	
}