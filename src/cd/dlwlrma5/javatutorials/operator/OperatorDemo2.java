package cd.dlwlrma5.javatutorials.operator;

public class OperatorDemo2 {
	public static void main(String[] args) {
	
		
		int a = 10;
	int b = 3;
	
	float c = 10.0F;
	float d = 3.0F;
	
	System.out.println(a/b);	//3
	System.out.println(c/d);	//3.33333
	System.out.println(a/d);	//3.33333 	정수가 자동으로 형변환되어(int->float) 3.3333의 결과값이 나온다.
	}
}