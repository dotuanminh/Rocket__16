import java.sql.Date;
import java.time.LocalDate;

public class GroupAccount {
	Group groupID ;
	Account[] accountID; 
	LocalDate joinDate;
	public GroupAccount(Group groupID, Account[] accountID, LocalDate joinDate) {
		super();
		this.groupID = groupID;
		this.accountID = accountID;
		this.joinDate = joinDate;
	}
	public GroupAccount() {
		super();
	}
	@Override
	public String toString() {
		return "GroupAccount{" +
				"groupID=" + groupID +
				", accountID=" + accountID +
				", joinDate=" + joinDate +
				'}';
	    }
	
}
