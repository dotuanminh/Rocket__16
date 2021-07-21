import java.util.Arrays;

public class ExamQuestion {
	int examID; 
	Question[] questionID;
	public ExamQuestion(int examID, Question[] questionID) {
		this.examID = examID;
		this.questionID = questionID;
	}
	public ExamQuestion() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ExamQuestion [examID=" + examID + ", questionID=" + Arrays.toString(questionID) + "]";
	}
	
	
}
