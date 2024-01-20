package GPT12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생의 이름과 점수를 입력해주세요");
		System.out.print("학생 이름 : ");
		String stName = sc.nextLine();
		System.out.print("학생 점수 : ");
		int stScore = sc.nextInt();
		
		Student st = new Student(stScore, stName);

		st.show();
		
		File file = new File("data");
			try {
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data"));
				oos.writeObject(stScore);
			} catch (Exception e) {
				e.printStackTrace();
			} 
	
			Student student = null;
			try {
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data"));
				student = (Student) ois.readObject();
			} catch (Exception e) {
				e.printStackTrace();
			} 
		
		
		
	}
}
