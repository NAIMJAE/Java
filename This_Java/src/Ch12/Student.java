package Ch12;
// 교재 p.500
public class Student {
	private int no;
	private String name;
	
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public int getNo() {
		return no;
	}
	
	@Override
	public int hashCode() {
		int hashCode = no + name.hashCode();
		return hashCode;
	}
	
	@Override
	public boolean equals(Object obj) {
	    // obj가 Student 클래스의 인스턴스인지 확인
	    if (obj instanceof Student target) {
	        // obj를 Student 타입으로 형변환한 것이므로, 이제 target 변수에 obj가 가리키는 객체가 저장됨
	        if (no == target.getNo() && name.equals(target.getName())) {
	            // 학생 번호와 이름이 동일하면 true 반환
	            return true;
	        }
	    }
	    // 위의 조건을 만족하지 않거나 obj가 Student 클래스의 인스턴스가 아니면 false 반환
	    return false;
	}
}