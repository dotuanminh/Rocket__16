  
import java.time.LocalDate;
import java.util.Random;

public class ex4 {
	public static Random random = new Random();
	public static void main (String[] args) {
		Question1();
		Question2();
		Question3();
		Question4();
		Question5();
		Question6();
		Question7();
		
	}
	private static void Question1() {
		// In ngẫu nhiên ra 1 số nguyên
		int i =  random.nextInt();
		System.out.println(i);
	}

	private static void Question2() {
		// In ngẫu nhiên ra 1 số thực
		float i = random.nextFloat();
		System.out.println(i);
		
	}

	private static void Question3() {
		// Khai báo 1 array bao gồm các tên của các bạn trong lớp, sau đó in ngẫu nhiên 
		//ra tên của 1 bạn
		String[] Hoten = new String[] {"Đỗ Tuấn Minh","Phạm Diệu Linh", "Sushi"};
		int HotenRandom = random.nextInt(Hoten.length);
		System.out.println(Hoten[HotenRandom]);
	}

	private static void Question4() {
		// Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 24-07-1995 tới ngày 20-12-1995
		int minDay = (int) LocalDate.of(1995, 07, 24).toEpochDay();
		int maxDay = (int) LocalDate.of(1995, 12, 20).toEpochDay();
		
		long randomIntDay = minDay + random.nextInt(maxDay-minDay);
		LocalDate randomDay =  LocalDate.ofEpochDay(randomIntDay);
		System.out.println(randomDay);
	}

	private static void Question5() {
		// Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 1 năm trở lại đây
		int Daynow = (int) LocalDate.now().toEpochDay();
		int yearAgo = (int) LocalDate.now().minusYears(1).toEpochDay();
		
		long randomIntDay = yearAgo + random.nextInt(Daynow - yearAgo);
		LocalDate randomDay = LocalDate.ofEpochDay(randomIntDay);
		System.out.println(randomDay);
	}

	private static void Question6() {
		int Daynow = (int) LocalDate.now().toEpochDay();
		long RandomDayAgo = random.nextInt(Daynow);
		LocalDate randomDay = LocalDate.ofEpochDay(RandomDayAgo);
		System.out.println(randomDay);
	}

	private static void Question7() {
		int number = random.nextInt(900)+100;
		System.out.println(number);
	}

}