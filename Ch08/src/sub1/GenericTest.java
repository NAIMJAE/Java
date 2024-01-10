package sub1;
/**
 * 날짜 : 2024/01/10
 * 이름 : 박임재
 * 내용 : Java Generic 실습
 */
public class GenericTest {
	public static void main(String[] args) {
		
		Apple a = new Apple("한국", 3000);
		Banana b = new Banana("일본", 2000);
		
		// FruitBox를 호출해 객체를 만들때 이 치환변수의 타입을 알려줘야함.
		// FruitBox의 <T>를 <알맞은 타입>으로 바꿔 적어줘야
		FruitBox<Apple> box1 = new FruitBox<Apple>();
		FruitBox<Banana> box2 = new FruitBox<Banana>();

		box1.setFruit(a);
		box2.setFruit(b);
		
		System.out.println("box 1 내용 : " + box1.getFruit());
		System.out.println("box 2 내용 : " + box2.getFruit());
	}
}
