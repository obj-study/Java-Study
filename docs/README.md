## 구현할 기능 목록

- [ ] 요구사항
  - [ ] 프로그램 종료 시 System.exit() 호출 X
  - [ ] build.gradle 파일 변경 X, 외부 라이브러리 사용 X
---

- [ ] 컴퓨터에서 랜덤 수 3개 생성
  - [ ] 1~9까지의 서로 다른 임의의 수 3개를 랜덤으로 받기
  - [ ] Random 값은 camp.nextstep.edu.missionutils.Randoms의 pickNumberInRange()를 활용
 
    
- [ ] 사용자 수 3개 입력
  - [ ] 서로 다른 3자리의 수
  - [ ] 입력 값은 camp.nextstep.edu.missionutils.Console의 readLine()을 활용
  - [ ] 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException을 발생시킨 후 프로그램 종료
---
    
- [ ] 시작 문구
  - [ ] "숫자 야구 게임을 시작합니다."

    
- [ ] 결과값 출력
  - [ ] 입력한 수에 대한 결과
  - [ ] "볼", "스크라이크", "낫싱"
  - [ ] 모두 맞힌 경우: "3개의 숫자를 모두 맞히셨습니다! 게임 종료"


- [ ] 재시작/종료
  - [ ] "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요."
  - [ ] 종료시 "게임 종료!"