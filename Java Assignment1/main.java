
import java.sql.Date;
import java.time.LocalDate;

public class main {
	private static final TypeQuestion.TypeName Essay = null;
	private static final TypeQuestion.TypeName Multiple_Choice = null;

	// create data for department
	public static void main(String[] args) {
		Department d1 = new Department(1,"Sale");
		Department d2 = new Department(2,"Marketing");
		Department d3 = new Department(3,"Dev");
		
		// create data for position
		Position p1 = new Position(1,"Dev");
		Position p2 = new Position(2,"Test");
		Position p3 = new Position(3,"Scrum Master");
		Position p4 = new Position(4,"PM");
		
		// create data for Account 
		Account acc1 = new Account() ; 
		acc1.accountID= 1; acc1.email= "1@gmail.com";acc1.userName= "tk1"; acc1.fullName="Nguyen Van 1";
		acc1.departmentID = d1; acc1.positionID=p2; acc1.createDate= LocalDate.of(2021, 07, 20); 
		Account acc2 = new Account() ; 
		acc2.accountID= 2; acc2.email= "2@gmail.com";acc2.userName= "tk2"; acc2.fullName="Nguyen Van 2";
		acc2.departmentID = d3; acc2.positionID=p4; acc2.createDate= LocalDate.of(2020, 1, 9);
		Account acc3 = new Account() ; 
		acc3.accountID= 3; acc3.email= "2@gmail.com";acc3.userName= "tk3"; acc3.fullName="Nguyen Van 3";
		acc3.departmentID = d2; acc3.positionID=p1; acc3.createDate= LocalDate.of(2020, 3, 19);
		
		//create data for Group
		Group group1 = new Group();
        group1.groupID = 1;
        group1.groupName = "Java Fresher";
        group1.createDate = LocalDate.of(2021, 9, 21);

        Group group2 = new Group();
        group2.groupID = 2;
        group2.groupName = "DB Fresher";
        group2.createDate = LocalDate.of(2020, 5, 21);

        Group group3 = new Group();
        group3.groupID = 3;
        group3.groupName = "C++ Fresher";
        group3.createDate = LocalDate.of(2020, 4, 16);
		// create data for GroupAccount
        GroupAccount ga1 = new GroupAccount(); 
        ga1.groupID=group1; 
        ga1.accountID = new Account[2];
        ga1.accountID[0]= acc1;ga1.accountID[1]= acc2; 
        ga1.joinDate= LocalDate.of(2020, 4, 16);
        GroupAccount ga2 = new GroupAccount(); 
        ga2.groupID=group2; 
        ga2.accountID = new Account[3];
        ga2.accountID[0]= acc2;ga2.accountID[2]= acc3; ga2.accountID[1]= acc1;
        ga2.joinDate=  LocalDate.of(2020, 5, 21);
        GroupAccount ga3 = new GroupAccount(); 
        ga3.groupID=group3; 
        ga3.accountID = new Account[1];
        ga3.accountID[0]= acc3;
        ga3.joinDate=  LocalDate.of(2020, 7,12);
        
		// create data for TypeQuestion
		TypeQuestion tq1 = new TypeQuestion(1,Essay);
		TypeQuestion tq2 = new TypeQuestion(2,Multiple_Choice);
		
		
		//create data for CategoryQuestion
		CategoryQuestion cq1 = new CategoryQuestion(1,"Java");
		CategoryQuestion cq2 = new CategoryQuestion(2,".NET");
		CategoryQuestion cq3 = new CategoryQuestion(3,"SQL");
		CategoryQuestion cq4 = new CategoryQuestion(4,"Postman");
		CategoryQuestion cq5 = new CategoryQuestion(5,"Ruby");

		// create data for Question 
		Question q1= new Question(); 
		q1.questionID= 1; q1.content= "Cau hoi so"+q1.categoryID;q1.categoryID =cq1 ;
		q1.typeID=tq1;q1.creatorID = acc2; q1.createDate= LocalDate.of(2020, 5, 21);
		Question q2= new Question(); 
		q2.questionID= 1; q2.content= "Cau hoi so"+q2.categoryID;q2.categoryID =cq2 ;
		q2.typeID=tq2;q1.creatorID = acc1; q2.createDate= LocalDate.of(2020, 5, 21);
		Question q3= new Question(); 
		q3.questionID= 1; q3.content= "Cau hoi so"+q3.categoryID;q3.categoryID =cq3 ;
		q3.typeID=tq1;q3.creatorID = acc3; q3.createDate= LocalDate.of(2020, 5, 21);
		
		
		//create data for Answer
		
		Answer a1 = new Answer(1,"Cau tra loi so 1" ,q2	,true); 
		Answer a2 = new Answer(2,"Cau tra loi so 2" ,q3	,false); 
		Answer a3 = new Answer(3,"Cau tra loi so 3" ,q1	,true); 
		Answer a4 = new Answer(4,"Cau tra loi so 4" ,q2	,true); 
		Answer a5 = new Answer(5,"Cau tra loi so 5" ,q3	,false); 
		Answer a6 = new Answer(6,"Cau tra loi so 6" ,q1	,true); 
		
		
		//create data for Exam 
		Exam e1= new Exam();
		e1.examID=1; e1.code= "ABC123"; e1.title="Test 1"; e1.categoryID= cq1; 
		e1.duration= 180 ; e1.createDate= LocalDate.of(2021,7,12);e1.creatorID = acc2; 
		Exam e2= new Exam();
		e2.examID=2; e2.code= "ABC123"; e2.title="Test 2"; e2.categoryID= cq2; 
		e2.duration= 150 ; e2.createDate= LocalDate.of(2021,7,12);e2.creatorID = acc3; 
		Exam e3= new Exam();
		e3.examID=1; e3.code= "ABCDEF"; e3.title="Test 1"; e3.categoryID= cq4; 
		e3.duration= 180 ; e3.createDate= LocalDate.of(2021,7,12);e3.creatorID = acc1; 
		//create data for ExamQuestion 
		ExamQuestion eq1= new ExamQuestion();
		eq1.examID =1; eq1.questionID= new Question[3];
		eq1.questionID[0] = q1;eq1.questionID[1] = q2;eq1.questionID[2] = q3;
		ExamQuestion eq2= new ExamQuestion();
		eq2.examID =2; eq2.questionID= new Question[2];
		eq2.questionID[0] = q1;eq2.questionID[1] = q3;
		ExamQuestion eq3= new ExamQuestion();
		eq3.examID =3; eq3.questionID= new Question[2];
		eq3.questionID[0] = q1;eq3.questionID[1] = q2;
		
//		//Q1
//		if(acc2.getDepartment() == null) System.out.println("Nhan vien nay khong co phong ban");
//		else System.out.println("Phong ban nhan vien nay la "+ acc2.getDepartment());
//		
//		//Q2 
//		int cnt =0;
//		
//		//Q3 
//		String qu3 = ((acc2.getDepartment() == null)? "Nhan vien nay khong co phong ban" : "Phong ban nhan vien nay la "+ acc2.getDepartment()); 
//		System.out.println(qu3);
//		
//		//Q4
//		String qu4 = ((acc1.positionID.positionName == "Dev")? "Day la Developer" : "Nguoi nay khong phai Developer");
//		System.out.println(qu4);
//		
//		//Q5 
//		
//		//Q6
//		
//		//Q7
//		
//		//Q8 
		
		
		//Q9 
	}
	
}