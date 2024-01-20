package ch05_String_Array;
// 교재 p.153
public class GrabageObjectExample {
	public static void main(String[] args) {
		String hobby = "여행";
		hobby = null;  // "여행"에 해당하는 String 객체를 쓰레기로 만듦
		
		String kind1 = "자동차";
		String kind2 = kind1; // kind1에 저장되어 있는 번지를 kind2 변수에 대입
		kind1 = null;
		// kind1 변수에 null값을 대입하여 GarbageObject로 만들었지만
		// "자동차"라는 객체가 null이 된것이 아니라 kind1 변수가 참조하는 번지수가 null이 된것
		// 그래서 여전히 kind2는 "자동차" 객체를 참조 중 
		System.out.println("kind2 : " + kind2);
	}
}
