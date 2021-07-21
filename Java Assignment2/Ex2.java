import java.time.LocalDate;

public class Ex2 {
	public static void main(String[] args) {
		Question1(); 
		Question2();
		Question3();
		Question4();
		Question5();
		Question6(); 
	}

	private static void Question6() {
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
		Account[] accounts = new Account[] {acc1,acc2,acc3};
		
		System.out.printf("--------------------------------------------------------------------------------\n");
		System.out.printf("Email.............................FullName........................DepartmentName\n");
		for(Account account: accounts) {
		System.out.printf("%-30s%-40s%-20s\n",account.email, account.fullName,account.departmentID.departmentName);
		}
		System.out.printf("--------------------------------------------------------------------------------\n");
		
	}

	private static void Question5() {
		System.out.println(java.time.LocalDateTime.now()); 
		
	}

	private static void Question4() {
		String hoten = "Do Tuan Minh" ; 
		System.out.println(hoten+ " va toi dang doc than \n");
		
	}

	private static void Question3() {
		double x= 5.567098; 
		System.out.printf("%.4f \n", x);
	}

	private static void Question2() {
		int x= 100000000;
		System.out.printf("%,d \n", x);
		
	}

	private static void Question1() {
		int x=5; 
		System.out.printf("%d \n",x);
	}
}
