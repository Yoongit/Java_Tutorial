package cd.dlwlrma5.javatutorials.typeconversion;

public class TypeConversionDemo {

	public static void main(String[] args) {

		double a = 3.0F;	//F가 붙어 float형이라 에러가 발생해야하지만 java에서 자동으로 더블로 변환시켜주어 에러가 발생하지않는다.
							// ---->자동형변환	double > float
		
		// float a = 3.0;		// 3.0 은 double형이다. double > float 이기 때문에 자동형변환이 일어나지 않아 오류가 발생한다.
		
		
		int b = 3;
		float c = 1.0F;
		double d = b + c;  // 3.0F + 1.0F --> 4.0 
		
		System.out.println(d);
		
		
		
	}

}
