package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.*;

public class ComRandomNum {

    public static void main (String[] args) {

        // 3개의 숫자를 랜덤으로 받기 (배열로?)
        List<Integer> computer = new ArrayList<>();
        while(computer.size() < 3){
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }

    }
}
