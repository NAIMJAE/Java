package test1;
/**
 * 
 * 날짜 : 2023/12/28
 * 이름 : 박임재
 * 내용 : Java 반복문 연습문제
 */
public class Test_09 {
	public static void main(String[] args) {
		
		int count = 0;
		
		for(int i=1 ; i<=9 ; i++) {
			
			if(i<=5) {
				// i=1 i=2 i=3 i=4 i=5
				count = i;
			}else {
				// i=6 i=7 i=8 i=9
				count = 10-i;
			}
			
			for(int j=1 ; j<=5-count ; j++) {
				System.out.print(" ");
			}
			
			for(int k=1 ; k<=2*count-1 ; k++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
	}

}
// c  i   j   k
// 1  1  ~4  ~1
// 2  2  ~3  ~3
// 3  3  ~2  ~5
// 4  4  ~1  ~7
// 5  5  ~0  ~9
// 4  6  ~1  ~7   -2
// 3  7  ~2  ~5   -4
// 2  8  ~3  ~3   -6
// 1  9  ~4  ~1   -8