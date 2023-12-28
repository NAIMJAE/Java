package ch02;
// 교재 p.47
public class FloatDoubleExample {
	public static void main(String[] args) {
		// 정밀도 확인
		float var1 = 0.1234567890123456789f; // float와 double의 유효 숫자 차이
		double var2 = 0.1234567890123456789;
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		
		// 10의 거듭제곱 리터럴
		double var3 = 3e6;
		float var4 = 3e6F;
		double var5 = 2e-3;
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println("var5 : " + var5);
	}
}
