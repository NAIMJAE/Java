package sub1;
/**
 * 날짜 : 2024/01/09
 * 이름 : 박임재
 * 내용 : Java Object 클래스 실습
 */
// 모든 클래스는 명시되어 있지 않지만 Object 클래스를 상속 받음
public class Apple{

	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Apple [hashCode="+hashCode()+", country=" + country + ", price=" + price + "]";
	}
	public String getCountry() {
		return country;
	}
	public int getPrice() {
		return price;
	}
	
	@Override
	public boolean equals(Object obj) {
	    // obj가 Student 클래스의 인스턴스인지 확인
	    if (obj instanceof Apple target) {
	        // obj를 Student 타입으로 형변환한 것이므로, 이제 target 변수에 obj가 가리키는 객체가 저장됨
	        if (price == target.getPrice() && country.equals(target.getCountry())) {
	            // 학생 번호와 이름이 동일하면 true 반환
	            return true;
	        }
	    }
	    // 위의 조건을 만족하지 않거나 obj가 Student 클래스의 인스턴스가 아니면 false 반환
	    return false;
	}
}
