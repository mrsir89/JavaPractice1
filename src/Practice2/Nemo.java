// 		창  뜨 는 프 로 그 램


//package Practice2;
//
//import javax.swing.*;
//
//public class Nemo {
//	public static void main(String[] args) {
//		JFrame frame = new JFrame("Kang's House");
//		JLabel label = new JLabel("Hello World");
//		
//		frame.add(label);
//		frame.pack();					//  없으면 글씨도 안보이게 작
//		frame.setVisible(true);			// 창을 나타낼것인지 여부 
//		frame.setLocation(200, 400);  	// x,y 좌표
//	}
//}



//			에 러 투 성 이 연 습 
//package Practice2;
// 
//public class Nemo{
//	public static void main(String[] args) {
//		// TODO Aute-generated method stub
//		Student a_student = new Student(17,"김동수");
//		Teacher b_teacher = new Teacher("김선생");
//		Student c_student = new Student(18,"이영희");
//		
//		System.out.println(a_student.getName());
//		
//class Student extends Human{
//	private int m_number;
//	
//	public Student(int _num, String _str) {
//		super(_str);
//		m_number = _num;
//	}
//	public int getNumber() {
//		return m_number;
//	}
//}
//
//class Teacher extends Human{
//	
//}
//	}
//}


//////////////////////////////////////////////////////////////////






//  변 신 전

//package Practice2;
//
//import java.util.Scanner;
//
//public class Nemo{
//	public static void main(String[] args) {
//		System.out.println("입력점.. ");
//		Scanner scan = new Scanner(System.in);
//		int input = scan.nextInt();
//		
//		int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
//		
//		System.out.printf("%d 는 %d 까지", input, month[input]);
//		
//	}
//}


//package Practice2;
//
//import java.util.Scanner;
//
//public class Nemo{
//	
//	private static final int[] MAX_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
//	public int maxDays(int input) {
//		return MAX_DAYS[input - 1];
//	}
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		Nemo cal = new Nemo();			// class 이름
//		
//		System.out.print("반 복 횟 수 입 력 : ");
//		int repeat = scan.nextInt();
//		
//		for(int i=0; i<repeat; i++) {
//		System.out.println("달 입 력 : ");
//		int input = scan.nextInt();
//		
//		System.out.printf("%d 월은 %d일 까지 있습니다 \n" ,input, cal.maxDays(input));
//		}
//		System.out.println("bye~");
//	}
//}








package Practice2;

import java.util.Scanner;

public class Nemo{
	
	private static final int[] MAX_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
	public int maxDays(int input) {
		return MAX_DAYS[input - 1];
	}
	public static void main(String[] args) {
		
		String PROMPT = "cal> ";
		Scanner scan = new Scanner(System.in);
		Nemo cal = new Nemo();			// class 이름
	
		int month= 1;
		while(true) {
		System.out.println("달 입 력 : ");
		System.out.print(PROMPT);  
		int input = scan.nextInt();
		if ( input == -1) {
			break;
		}
		if ( input > 12) {
			continue;
		}
		System.out.printf("%d 월은 %d일 까지 있습니다 \n" ,input, cal.maxDays(input));
		}
		
		System.out.println("bye~");
	}
}





