import java.time.LocalDate;

public class Question {
	int questionID; 
	String content; 
	CategoryQuestion categoryID;; 
	TypeQuestion typeID; 
	Account creatorID; 
	LocalDate createDate;
	public Question(int questionID, String content, CategoryQuestion categoryID, TypeQuestion typeID,
			Account creatorID, LocalDate createDate) {
		super();
		this.questionID = questionID;
		this.content = content;
		this.categoryID = categoryID;
		this.typeID = typeID;
		this.creatorID = creatorID;
		this.createDate = createDate;
	}
	public Question() {
		super();
	}
	 public String toString() {
	        return "Question{" +
	                "id=" + questionID +
	                ", content='" + content + '\'' +
	                ", type=" + typeID +
	                ", creator=" + creatorID +
	                ", createDate=" + createDate +
	                '}';
	    }
}


