package cf.dlwlrma5.javatutorials.datatype;

public class IntDatatypeDemo {

	public static void main(String[] args) {
		
		//정수
		
		byte a;		//-128~127	1byte
		short b;	//-32,768 ~ 32,767	2byte
		int c;		//-2,147,483,648 ~ 2,147,483,647	4byte
		long d;		//-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807	8byte
					// 표현 수의 크기가 커질수록 메모리 크기가 커진다.
					// 따라서 효율적으로 사용해야한다.
		
		a = 127;					//127이상의 수를 주면 에러가 뜬다.
		b = 32767;					//32,767이상의 수를 주면 에러가 뜬다.
		c = 2147483647;				//2,147,483,647이상의 수를 주면 에러가 뜬다.
		d = 922337333;		//9,223,372,036,854,775,807이상의 수를 주면 에러가 뜬다.
		

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

		
		
		//실수
		
		float e;		//+-1.40129846432481707e-45 ~ 3.40282346638528860e+38	4byte
		double f; 		//+-4.94065645841246544e-324d ~ 1.7769313486231570e+308d	8byte
		
		e = (float)1.4;
		f = 1.7;
		
		System.out.println(e);
		System.out.println(f);
		
		
		//문자
		
		char g;		//모든 유니코드 문자		2byte
		
		g = 'e';
		
		System.out.println(g);
	
	}

}
