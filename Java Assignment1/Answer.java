public class Answer {
    int answerID;
    String content;
    Question question;
    Boolean isCorrect;
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answer(int answerID, String content, Question question, Boolean isCorrect) {
		this.answerID = answerID;
		this.content = content;
		this.question = question;
		this.isCorrect = isCorrect;
	}
	@Override
	public String toString() {
		return "Answer [answerID=" + answerID + ", content=" + content + ", question=" + question + ", isCorrect="
				+ isCorrect + "]";
	}
    
	
}