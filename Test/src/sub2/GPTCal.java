package sub2;

import java.util.Scanner;

public class GPTCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operand1 = 0;
        int operand2 = 0;
        int operator = 0; // 1: 덧셈, 2: 뺄셈, 3: 곱셈, 4: 나눗셈
        int result = 0;

        while (true) {
            System.out.print(">");
            String input = sc.next();

            if (isOperand(input) && operator == 0) {
                operand1 = Integer.parseInt(input);
            } else if (isOperator(input)) {
                operator = getOperatorCode(input);
            } else if (isOperand(input) && operator != 0) {
                operand2 = Integer.parseInt(input);
                result = performCalculation(operand1, operand2, operator);
                System.out.println(result);

                // 추가: 사용자가 "exit"을 입력하면 프로그램 종료
                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                // 초기화
                operand1 = 0;
                operand2 = 0;
                operator = 0;
            }
        }
    }

    private static boolean isOperand(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isOperator(String input) {
        return input.equals("+") || input.equals("-") || input.equals("*") || input.equals("/");
    }

    private static int getOperatorCode(String input) {
        switch (input) {
            case "+":
                return 1;
            case "-":
                return 2;
            case "*":
                return 3;
            case "/":
                return 4;
            default:
                return 0; // 알 수 없는 연산자
        }
    }

    private static int performCalculation(int operand1, int operand2, int operator) {
        switch (operator) {
            case 1:
                return operand1 + operand2;
            case 2:
                return operand1 - operand2;
            case 3:
                return operand1 * operand2;
            case 4:
                if (operand2 != 0) {
                    return operand1 / operand2;
                } else {
                    System.out.println("Error: Division by zero!");
                    return 0;
                }
            default:
                System.out.println("Error: Unknown operator!");
                return 0;
        }
    }
}
