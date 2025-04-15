package baseball;

import java.util.*;
import camp.nextstep.edu.missionutils.Randoms;
import static camp.nextstep.edu.missionutils.Console.readLine;

public class Main {

    public static void main(String[] args) {

        boolean gameAgain = true;

        // 동작 코드
        while (gameAgain) {
            List<Integer> computerNumber = RandomNumber();

            boolean gameOver = false;
            System.out.println("숫자 야구 게임을 시작합니다.");

            while(!gameOver){
                try {
                    System.out.print("숫자를 입력해주세요 : ");
                    String input = readLine();

                    List<Integer> userNumber = UserInput(input);

                    int[] result = compareNumber(computerNumber, userNumber);

                    if (result[0] == 3) {
                        System.out.println("3스트라이크");
                        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                        gameOver = true;
                    } else if (result[0] == 0 && result[1] == 0) {
                        System.out.println("낫싱");
                    } else {
                        System.out.printf("%d볼 %d스트라이크\n", result[1], result[0]);
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            String restart = readLine();

            if(restart.equals("1")){
                gameAgain = true;
            } else if(restart.equals("2")){
                gameAgain = false;
                System.out.println("게임이 종료 되었습니다.");
            }
        }
    }

    // RandomNum 생성
    private static List<Integer> RandomNumber() {
        List<Integer> computer = new ArrayList<>();
        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }

        return computer;
    }

    private static List<Integer> UserInput(String input) {
        if (input.length() != 3 || !input.matches("\\d+")) {
            throw new IllegalArgumentException("입력은 1부터 9까지의 서로 다른 3자리 숫자여야 합니다.");
        }

        List<Integer> userNum = new ArrayList<>();
        for (char c : input.toCharArray()) {
            int num = Character.getNumericValue(c);
            if (num < 1 || num > 9 || userNum.contains(num)) {
                throw new IllegalArgumentException("입력은 1부터 9까지의 서로 다른 3자리 숫자여야 합니다.");
            }
            userNum.add(num);
        }

        return userNum;
    }

    private static int[] compareNumber(List<Integer> computerNumber, List<Integer> userNumber) {
        int strike = 0;
        int ball = 0;

        for (int i = 0; i < 3; i++) {
            if (computerNumber.get(i).equals(userNumber.get(i))) {
                strike++;
            }
            else if(userNumber.contains(computerNumber.get(i))) {
                ball++;
            }
        }
        return new int[]{strike, ball};
    }
}