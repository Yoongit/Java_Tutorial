package cf.dlwlrma5.javatutorials.constant;

public class ConstantDemo {

	public static void main(String[] args) {

		int a = 2;
		//int a = 2.2;  2.2가 실수이기 때문에 에러가 뜬다.
		float b = 2.2F;	//F를 붙여 float datatype을 정해주어 에러가 해결된다.
		double c = 2.2; //실수는 double이 기본형
		
		long d = 2147483648L; //L을 붙여 long datatype을 정해주어 에러가 해결된다.
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}

}
