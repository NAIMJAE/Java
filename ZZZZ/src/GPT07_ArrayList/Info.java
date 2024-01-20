package GPT07_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Info {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> nameinput = new ArrayList<>();
		ArrayList<Integer> ageinput = new ArrayList<>();
		

		
		while(true) {
			System.out.println("exit를 입력하면 정보가 출력됩니다.");
			System.out.println("이름을 입력하세요.");
			System.out.print("이름 : ");
			String inputName = sc.nextLine();
			
			if (inputName.equalsIgnoreCase("exit")) {
                break;
            }
			
			System.out.println("나이를 입력하세요.");
			System.out.print("나이 : ");
			int inputAge = Integer.parseInt(sc.nextLine());
			
			nameinput.add(inputName);
            ageinput.add(inputAge);
				
			}
			System.out.println("입력한 정보를 출력합니다.");
	
	        for (int i = 0; i < ageinput.size(); i++) {
	            System.out.println("이름: " + nameinput.get(i) + ", 나이: " + ageinput.get(i));
	        }
	
	        sc.close();
		}	
	}

