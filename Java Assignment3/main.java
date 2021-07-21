import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// ex1: 
		// Q1 : 
		float luongAccount1 = (float) 5240.5; 
		float luongAccount2 = (float) 10970.055; 
		
		int luonga1 = (int)(luongAccount1) ;
		int luonga2 = (int)(luongAccount2) ;
		System.out.println(luonga1 + "\n" +luonga2);
		
		// Q2 : 
		int x= 20012;
		// Q3
		System.out.println((x%100));
		// Q4
		System.out.println(thuong(3,2)); 
		
		//Ex2 : 
		//Q1
		Account[] accounts = new Account[5] ;
		for(int i=0; i<accounts.length; ++i) {
			accounts[i]=  new Account(); 
			accounts[i].Email =i+ "@gmail.com";
			accounts[i].FullName="Nguyen Van" +i;
			accounts[i].Username= i+"1234"; 
			accounts[i].CreateDate = LocalDate.of(2021, 07, 19);
		}
		for(Account account: accounts) {
			System.out.println(account.FullName +"\n"+ account.Username+"\n"+ account.Email+"\n"+account.CreateDate);
		}
		
		//Ex3 
		//Q1
		int luong = 5000;
		float luongs= luong;
		System.out.printf("%.2f \n",luongs);
		//Q2
		String q2= "1234567";
		int q2_int =Integer.parseInt(q2);
		System.out.println(q2_int);
		
		
		//Ex4 
		//Q1
//		Scanner scanner= new Scanner(System.in);
////		String q4 = scanner.nextLine(); 
//		int words = 0; 
//	    while(scanner.hasNext())
//        {
//            scanner.next();
//            words++;
//        }
//	    System.out.println(words);
	    
	    // Q2
	    String s1 = "AB" ;
	    String s2= "CD" ; 
	    System.out.println(s1+ s2);
	    
	    // Q3
	    Scanner scanner = new Scanner(System.in) ;
	    String ex4 = "" ;
	    ex4= scanner.nextLine() ; 
	    String a1= ex4.substring(0,1).toUpperCase();
	    System.out.println(a1+ ex4.substring(1));
	    scanner.close();
	}
	public static int thuong(int a, int b) {
 		return a/b;
	}
}
