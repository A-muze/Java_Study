package Star;

public class Star05 {

    public static void main(String[] args) {

        for(int i = 0; i < 5; i++) {    // 5줄 생성
            for(int j = 0; j < i; j++) {    // j가 i보다 작으면
                //   첫째 줄에는 i와 j 모두 0이므로 조건은 false가 되어 공백을 출력하지 않는다
                System.out.print(" ");  // 공백을 출력
            }
            for(int k = 4; k >= i; k--) {   // k = 4이며 i의 초기값은 0이기 때문에 0 ~ 4까지 즉 5번을 반복한다
                System.out.print("*");  // 별 출력
            }
            // 반복문 k가 끝이나면 i 반복문의 줄바꿈이 실행된다
            System.out.print("\n"); // 줄바꿈
        }
    }
}
