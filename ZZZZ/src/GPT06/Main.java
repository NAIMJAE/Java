package GPT06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        
        // 사용자로부터 나이 입력 받기 (예시: Scanner를 이용한 입력)
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("강아지의 나이를 입력하세요: ");
        int ageInput = scanner.nextInt();

        try {
            myDog.setAge(ageInput);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
