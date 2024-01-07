package GPT01;

import java.util.Scanner;

public class UserChoice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validChoice = false;
        Animal animal = null; // animal 변수 초기화

        while (!validChoice) {
            System.out.println("어떤 동물 소리를 듣고 싶나요? (dog 또는 cat)");
            String userInput = scanner.nextLine();

            if ("dog".equalsIgnoreCase(userInput)) {
                animal = new Dog();
                validChoice = true;
            } else if ("cat".equalsIgnoreCase(userInput)) {
                animal = new Cat();
                validChoice = true;
            } else {
                System.out.println("올바른 동물을 선택해주세요.");
            }
        }

        if (animal != null) { // animal이 null이 아닐 때에만 makeSound() 호출
            animal.makeSound();
        }

        scanner.close();
    }
}
