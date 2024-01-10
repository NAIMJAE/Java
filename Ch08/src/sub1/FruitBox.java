package sub1;

// 치환 변수 T를 가지는 제네릭 클래스
// 제네릭 클래스 기호 <치환변수>를 class에 적어줘야함
public class FruitBox <T>{

	private T fruit;
	
	public T getFruit() {
		return fruit;
	}
	
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}
}
