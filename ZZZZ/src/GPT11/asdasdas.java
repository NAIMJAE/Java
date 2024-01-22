package GPT11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class asdasdas {
    public static void main(String[] args) {
        List<Map<String, String>> listOfMaps = new ArrayList<>();
        int check = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (check == 0) {
                System.out.println("1. 입력\n2. 출력\n3. 목록 보기\n4. 종료");
                System.out.print("선택하세요: ");

                String choiceStr = scanner.next();

                try {
                    int choice = Integer.parseInt(choiceStr);

                    switch (choice) {
                        case 1:
                            check = 1;
                            break;
                        case 2:
                            printList(listOfMaps);
                            check = 0;
                            break;
                        case 3:
                            printListWithIndexes(listOfMaps);
                            check = 3;  // 목록 보기 모드로 변경
                            break;
                        case 4:
                            System.out.println("프로그램을 종료합니다.");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("숫자를 입력해주세요.");
                    scanner.nextLine();  // clear the buffer
                }
            } else if (check == 1) {
                System.out.print("제목을 입력하세요: ");
                String title = scanner.next();
                scanner.nextLine();  // clear the buffer

                System.out.print("내용을 입력하세요: ");
                String content = scanner.nextLine();

                Map<String, String> userMap = new HashMap<>();
                userMap.put(title, content);
                listOfMaps.add(userMap);

                check = 0;
            } else if (check == 2) {
                printList(listOfMaps);

                System.out.print("출력할 내용의 목록 인덱스를 입력하세요: ");
                try {
                    int index = scanner.nextInt();
                    if (index >= 0 && index < listOfMaps.size()) {
                        printMap(listOfMaps.get(index));
                    } else {
                        System.out.println("올바른 인덱스를 입력하세요.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("숫자를 입력해주세요.");
                    scanner.nextLine();  // clear the buffer
                }

                check = 0;
            } else if (check == 3) {
                printListWithIndexes(listOfMaps);

                System.out.print("출력할 목록의 인덱스를 입력하세요 ('back'으로 돌아가기): ");
                String userInput = scanner.nextLine();

                if (userInput.equalsIgnoreCase("back")) {
                    check = 0;
                } else {
                    try {
                        int index = Integer.parseInt(userInput);
                        if (index >= 0 && index < listOfMaps.size()) {
                            printMap(listOfMaps.get(index));
                        } else {
                            System.out.println("올바른 인덱스를 입력하세요.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("숫자를 입력하거나 'back'을 입력해주세요.");
                    }
                }
            }
        }
    }

    private static void printList(List<Map<String, String>> list) {
        System.out.println("List 컬렉션 내용:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Index " + i);
            printMap(list.get(i));
        }
    }

    private static void printListWithIndexes(List<Map<String, String>> list) {
        System.out.println("List 컬렉션 목록 및 인덱스:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Index " + i + ": " + list.get(i).keySet());
        }
    }

    private static void printMap(Map<String, String> map) {
        System.out.println("Map 컬렉션 내용:");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

