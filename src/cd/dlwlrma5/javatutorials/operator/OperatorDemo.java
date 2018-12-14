package cd.dlwlrma5.javatutorials.operator;

public class OperatorDemo {

	public static void main(String[] args) {
		
		/*
		 *  + 더하기
		 *  - 빼기
		 *  * 곱하기
		 *  / 나누기
		 *  % 나머지
		 */
		
		int result = 1 + 2;
		System.out.println(result);
		// 3
		
		result = result -1;
		System.out.println(result);
		// 2
		
		result = result * 2;
		System.out.println(result);
		// 4
	
		result = result / 2;
		System.out.println(result);
		// 2
		
		result = result +8;
		System.out.println(result);
		// 10
		
		result = result % 3;
		System.out.println(result);
		//1
		
		
		int a = 3;
		System.out.println(0%a);	//0
		System.out.println(1%a);	//1
		System.out.println(2%a);	//2
		System.out.println(3%a);	//0
		System.out.println(4%a);	//1
		System.out.println(5%a);	//2
		System.out.println(6%a);	//0
									// 순환한다.
		
		
		String firstString = "My name is";
		String secondString = " Yoongit";
		String thirdString = firstString + secondString;
		System.out.println(thirdString);
		// 문자열도 연산이 가능하다.
		
		
		
			
		
		
		
		
		
		
		
	}

}
