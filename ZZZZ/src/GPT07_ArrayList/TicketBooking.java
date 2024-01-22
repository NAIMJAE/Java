package GPT07_ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class TicketBooking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[][] movieSeat = {{"A1", "A2", "A3", "A4", "A5", "A6"},
                                {"B1", "B2", "B3", "B4", "B5", "B6"},
                                {"C1", "C2", "C3", "C4", "C5", "C6"},
                                {"D1", "D2", "D3", "D4", "D5", "D6"}};

        System.out.println("|-23.12.25(월).19:40 ~ 21:50 어벤저스-|");
        System.out.println("|--------------SCREEN--------------|");
        for (int i = 0; i < movieSeat.length; i++) {
            for (int j = 0; j < movieSeat[i].length; j++) {
                System.out.print("| " + movieSeat[i][j] + " |");
            }
            System.out.println();
        }

        System.out.println("원하시는 좌석과 이름을 입력해 주세요.");
        ArrayList<String> bookedNum = new ArrayList<>();
        ArrayList<String> bookedName = new ArrayList<>();

        while (true) {
            System.out.print("좌석 번호 : ");
            String inputNum = sc.nextLine();
            int index = bookedNum.indexOf(inputNum);

            if (index != -1) {
                System.out.println("이미 예약된 좌석입니다.");
                continue;
            } else {
                bookedNum.add(inputNum);
            }
            System.out.print("고객 이름 : ");
            String inputName = sc.nextLine();
            bookedName.add(inputName);

            System.out.println("예매에 성공하였습니다.");
            System.out.print("추가 예매를 진행하시겠습니까? (예/아니요): ");
            String inputYes = sc.nextLine();

            if (inputYes.equals("아니요")) {
                System.out.println("예매 정보");
                for (int i = 0; i < bookedNum.size(); i++) {
                    System.out.println("좌석 번호 : " + bookedNum.get(i) + "\n고객 이름 : " + bookedName.get(i));
                }
                break;
            } else if (!inputYes.equals("예")) {
                System.out.println("잘못 입력하셨습니다.");
            }
        }
    }
}
