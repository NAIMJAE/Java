package grade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradeInput {
	
	private static List<GradeList> list = new ArrayList<>();
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("1. 성적 입력 | 2. 성적 출력");
			System.out.print(">");
			int userChoice = sc.nextInt();
			
			if(userChoice==1) {
				inputScore();
				System.out.println();
			}else if(userChoice==2) {
				show();
				System.out.println();
			}
		}
	}
	
	public static void inputScore(){
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("점수 : ");
		int score = sc.nextInt();
		if(score < 0 || score > 100) {
			if(score < 0) {
				System.out.println("점수는 0점을 이하일 수 없습니다.");
				
			}else {
				System.out.println("점수는 100점을 초과할 수 없습니다.");
				
			}return;
		}
		
		String grade = gradeCheck(score);
		
		GradeList gradelist = new GradeList(name, score, grade);
		list.add(gradelist);
	}
	
	public static String gradeCheck(int score) {
		String grade;
		if (score >= 90) {
			grade = "A";
		}else if (score >= 80) {
			grade = "B";
		}else if (score >= 70) {
			grade = "C";
		}else if (score >= 60) {
			grade = "D";
		}else {
			grade = "F";
		}
		return grade;
	}
	
	public static void show() {
		System.out.println(" 이름 | 점수 | 등급");
		for(int i = 0 ; i < list.size() ; i++ ) {
			GradeList gradeList = list.get(i);
			if(gradeList != null) {
				System.out.print(gradeList.getName()+" | ");
				System.out.print(gradeList.getScore()+" | ");
				System.out.print(gradeList.getGrade()+"\n");
			}
		}
	}
}
