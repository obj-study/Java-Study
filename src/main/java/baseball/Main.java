package baseball;


import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class Main {
    public static void main(String[] args) {

        System.out.println("숫자 야구 게임을 시작합니다.");

        // 3개의 숫자 랜덤값을 컴퓨터에 받아서 저장 (상대)
        List<Integer> computer = new ArrayList<>();
        while(computer.size() < 3){
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }

        // 사용자 입력 3개의 숫자 받아오기 (Scanner 이용)
        System.out.print("숫자를 입력해주세요 : ");
        List<Integer> user = new ArrayList<>();
        while(user.size() < 3){
            readLine();
            user.add(Integer.parseInt(readLine()));
        }

        // 사용자가 입력한 값이 숫자가 아니면 에러 띄우기


    }
}
