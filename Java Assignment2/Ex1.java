import java.time.LocalDate;

public class Ex1 {
	private static final TypeQuestion.TypeName Essay = null;
	private static final TypeQuestion.TypeName Multiple_Choice = null;

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
			acc3.accountID= 3; acc3.email= "3@gmail.com";acc3.userName= "tk3"; acc3.fullName="Nguyen Van 3";
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
			
			// bailam 
//			Question1(acc2);3333
//			Question3(acc2);
//			Question4(acc1);
//			Question5(ga1);
//			Question6(acc2);
//			Question7(acc1);
//			Question8(new Account[]{acc1, acc2, acc3});
//			Question9(new Department[] {d1,d2,d3}) ;
//			Question10(new Account[]{acc1, acc2, acc3});
//			Question11(new Department[] {d1,d2,d3}) ;
//			Question12(new Department[] {d1,d2,d3}) ;
//			Question13(new Account[]{acc1, acc2, acc3});
//			Question14(new Account[]{acc1, acc2, acc3});
//			Question15();
//			Question16(new Account[]{acc1, acc2, acc3},new Department[] {d1,d2,d3});
//			Question17(new Account[]{acc1, acc2, acc3},new Department[] {d1,d2,d3});
	 }
	
	private static void Question17(Account[] accounts, Department[] departments) {
		int i=0; 
		do {
			System.out.println("Thong tin phong ban thu "+(i+1)+" la:");
			System.out.println("Email: "+accounts[i].email);
			System.out.println("Full Name: "+ accounts[i].fullName);
			System.out.println("Phong ban "+ accounts[i].departmentID.departmentName);
			i++;
		}while(i<accounts.length);
		i=0; 
		do {
			System.out.println("Thong tin phong ban thu "+(i+1)+" la:");
			System.out.println("ID: "+ departments[i].departmentID);
			System.out.println("Name: "+ departments[i].departmentName);
			i++;
		}while(i<departments.length);
		
	}

	private static void Question16(Account[] accounts, Department[] departments) {
		int i=0; 
		while(i<accounts.length) {
			System.out.println("Thong tin phong ban thu "+(i+1)+" la:");
			System.out.println("Email: "+accounts[i].email);
			System.out.println("Full Name: "+ accounts[i].fullName);
			System.out.println("Phong ban "+ accounts[i].departmentID.departmentName);
			i++;
		}
		i=0; 
		while(i<departments.length) {
			System.out.println("Thong tin phong ban thu "+(i+1)+" la:");
			System.out.println("ID: "+ departments[i].departmentID);
			System.out.println("Name: "+ departments[i].departmentName);
			i++;
		}
	}

	private static void Question15() {
		for(int i=0; i<=20; ++i) {
			if(i%2 ==1) continue;
			else {
				System.out.println(i);
			}
		}
		
	}

	private static void Question14(Account[] accounts) {
		for(int i=0; i<accounts.length; ++i) {
			if(accounts[i].accountID>=4) continue;
			else {
			System.out.println("Thong tin phong ban thu "+(i+1)+" la:");
			System.out.println("Email: "+accounts[i].email);
			System.out.println("Full Name: "+ accounts[i].fullName);
			System.out.println("Phong ban "+ accounts[i].departmentID.departmentName);
			}
		}
	}

	private static void Question13(Account[] accounts) {
		for(int i=0; i<accounts.length; ++i) {
			if(i==1) continue;
			else {
			System.out.println("Thong tin phong ban thu "+(i+1)+" la:");
			System.out.println("Email: "+accounts[i].email);
			System.out.println("Full Name: "+ accounts[i].fullName);
			System.out.println("Phong ban "+ accounts[i].departmentID.departmentName);
			}
		}		
	}

	private static void Question12(Department[] departments) {
		for(int i=0; i< 2; ++i) {
			System.out.println("Thong tin phong ban thu "+(i+1)+" la:");
			System.out.println("ID: "+ departments[i].departmentID);
			System.out.println("Name: "+ departments[i].departmentName);
		}
	}

	private static void Question11(Department[] departments) {
		for(int i=0; i< departments.length; ++i) {
			System.out.println("Thong tin phong ban thu "+(i+1)+" la:");
			System.out.println("ID: "+ departments[i].departmentID);
			System.out.println("Name: "+ departments[i].departmentName);
		}
	}

	private static void Question10(Account[] accounts) {
		for(int i=0; i<accounts.length; ++i) {
			System.out.println("Thong tin phong ban thu "+(i+1)+" la:");
			System.out.println("Email: "+accounts[i].email);
			System.out.println("Full Name: "+ accounts[i].fullName);
			System.out.println("Phong ban "+ accounts[i].departmentID.departmentName);
		}
		
	}

	private static void Question9(Department[] departments) {
		for(Department department : departments) {
			System.out.println(department.departmentID +"\t"+ department.departmentName);
		}
		
	}

	private static void Question8(Account[] accounts) {
		for(Account account:accounts) {
			System.out.println(account.email+ "\t"+ account.fullName+"\t" + account.departmentID.departmentName);
		}
	}

	private static void Question7(Account acc1) {
		switch(acc1.positionID.positionName){
			case "Dev" :
				System.out.println("Nguoi nay la Developer");
				break;
			default: 
				System.out.println("Nguoi nay khong phai Developer");
				break;
		}
		
	}

	private static void Question6(Account acc2) {
		if(acc2.groups== null)System.out.println("Nhan vien nay chua co group");
		else {
			switch(acc2.groups.length) {
				case 1: 
					System.out.println("Group cua nhan vien nay la Java Fresher, C# Fresher");
					break;
				case 2: 
					System.out.println("Group cua nhan vien nay la Java Fresher, C# Fresher");
					break;
				case 3: 
					System.out.println("Nhan vien nay la nguoi quan trong tham gia nhieu group");
					break;
				default:
					System.out.println("Nhan vien nay la nguoi hong chuyen,tham gia tat ca cac group");
					break;
			}
		}
	}

	private static void Question5(GroupAccount ga1) {
		switch(ga1.accountID.length) {
		case 1 :
			System.out.println("nhom co 1 thanh vien");
			break;
		case 2:
			System.out.println("Nhom co 2 thanh vien");
			break ;
		case 3: 
			System.out.println("Nhom co 3 thanh vien");
			break;
		default:
			System.out.println("Nhom co nhieu thanh vien");
			break ; 
		}
		
	}

	private static void Question4(Account acc1) {
		String res = acc1.positionID.positionName.equals("Dev")? "Day la Developer" : "Nguoi nay khong phai Developer";
		System.out.println(res);
		
	}

	private static void Question3(Account acc2) {
		String res = acc2.departmentID == null ? "Nhan vien nay chua co phong ban" : "Phong cua nhan vien nay la "+ acc2.departmentID.departmentName;
		System.out.println(res);
		
	}

	private static void Question2(Account acc2) {
		if(acc2.groups== null) {System.out.println("Nhan vien nay khong co group");
		}else if(acc2.groups.length==1 || acc2.groups.length==2) {
			System.out.println("Group cua nhan vien nay la 	Java Fresher, C# Fresher");
		}else if(acc2.groups.length ==3) {
			System.out.println("Nhan vien nay la ngoui quan trong, tham gia nhieu group");
		}else {
			System.out.println("Nhan vien nay la nguoi hong chuyen, tham gia tat ca cac group");
		}
		
	}

	public static void Question1(Account account){
		if(account.departmentID== null) System.out.println("Nhan vien nay chua co phong ban");
		else System.out.println("Phong cua nhan vien nay la "+account.departmentID.departmentName);
	}	
}
