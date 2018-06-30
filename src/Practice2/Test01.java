//package Practice2;
//
//import java.util.Scanner;
//
//public class Test01 {
//	
//	public static void main(String[] args) {
//		
////		System.out.println(" 일 월  화 수  목 금  토");
////		System.out.println("--------------------");
////		System.out.println(" 1  2  3  4  5  6  7");
////		System.out.println(" 8  9 10 11 12 13 14");
////		System.out.println("15 16 17 18 19 20 21");
////		System.out.println("22 23 24 25 26 27 28");
//			
//		int a,b;
//		System.out.println("두수 입력");
//		Scanner scan = new Scanner(System.in);
//		String s1, s2;
//		s1 = scan.next();
//		s2 = scan.next();
//			
//		a = Integer.parseInt(s1);    			 // 형변환 
//		b = Integer.parseInt(s2); 	 			 // 형변환 
//		System.out.printf(s1 + " , " + s2);
//		int c = a+b;
////		System.out.println("두 수의 합은\n" +c +"입니다");
//		System.out.printf("\n두 수의 합은 %d입니다.", c );
//		scan.close();
//		
//	}
//}










//package Practice;
//
//import java.util.Scanner;
//
//public class Test02 {
//	
//	private final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//	public int maxDays(int input) {
//		return MAX_DAYS[input - 1];
//	}
//	public static void main(String[] args) {
//		
////		System.out.println(" 일 월  화 수  목 금  토");
////		System.out.println("--------------------");
////		System.out.println(" 1  2  3  4  5  6  7");
////		System.out.println(" 8  9 10 11 12 13 14");
////		System.out.println("15 16 17 18 19 20 21");
////		System.out.println("22 23 24 25 26 27 28");
//		
//		
//		System.out.println("달을 입력하시오");	
//		Scanner scan = new Scanner(System.in);
//		Calendar cal = new Calendar();
//		int input = scan.nextInt();
//		
//		System.out.println(input + "월은 " +array[input-1]+"일 까지 있음");	
//	}
//}











//
//package Practice;
//
//import java.util.Scanner;
//
//public class Test03 {
//	public static void main(String[] args) {
//		System.out.println("입력하세요 : ");
//		
//		Scanner scan = new Scanner(System.in);
//		int input = scan.nextInt();
//		
//		int[] array = {31,28,31,30,31,30,31,31,30,31,30,31};
//		
//		if(input==2) {
//			System.out.println(array[3]);
//			
//		}
//	}
//}


//import java.util.Scanner;
//
//public class Test03{
//	public static void main(String[] args) {
//		System.out.println(" 입 력 하 세 요 :  ");
//		
//		Scanner scan = new Scanner(System.in);
//		int input = scan.nextInt();
//		
//		for(int i=1; i<=input; i++) {
//			System.out.println(i * input);
//		}
//		
//	}
//}











//package Practice;
////
////import java.util.Scanner;
////
////public class Test04{
////	public static void main(String[] args) {
////		System.out.println(" 입 력 하 세 요 :  ");
////		
////		Scanner scan = new Scanner(System.in);
////		int input = scan.nextInt();
////		
////		for(int i=1; i<=input; i++) {        //  i는 구구단 시작단 
////			System.out.println(i * input);
////		} 
////	}
////}
//
//
//
//
//import java.util.Scanner;
//
//public class Test04{
//	public static void main(String[] args) {
//		System.out.println(" what : ");
//		
//		Scanner scan = new Scanner(System.in);
//		String input = scan.nextLine();
//		
//		String[] value = input.split("","");
//		int first = Integer.parseInt(value[0]);
//		int second = Integer.parseInt(value[1]);
//
//		System.out.println(first * second);
//		
//	}
//}






