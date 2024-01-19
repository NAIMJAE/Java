package sub2;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Grade {
	
	String name;
	int num;
	public void grade(String name, int num) {
		this.name = name;
		this.num = num;
	}
	@Override
	public String toString() {
		return "Grade [name=" + name + ", num=" + num + "]";
	}


	private static Scanner sc = new Scanner(System.in);
	private static List<Grade> gradelist = new ArrayList<>();
	private static Grade a1 = new Grade();	
	
	public static void main(String[] args) {
		
		while (true) {
			System.out.println("1.점수 입력  | 2. 성적 확인");
			System.out.print(">");
			int input = sc.nextInt();
			
			if(input == 1) {
				recode();
				
			}else if(input == 2) {
				for (Grade aa : gradelist) {
					System.out.println(aa);
				}
			}else {
				System.out.println("잘못 입력");
			}
		}
	}
	
	public static void recode() {
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("성적 : ");
		int num = sc.nextInt();
		a1.grade(name, num);
		gradelist.add(a1);
	}
}

/// 집에서 할거 오늘 수행평가 했던 예문과 비슷한 형식의 코드 외워서 내껄로 만들기
