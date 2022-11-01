package Star;

public class Star02 {

    public static void main(String[] args) {

        for(int i = 0; i < 5; i++) {
            for(int j = 4; j > 0; j--) {
                if(i < j) { // i가 j보다 작으면 공백 출력
                    System.out.print(" ");
                } else {
                    System.out.print("*");  // 아니면 별출력
                }
            }
            System.out.print("\n"); // 줄바꿈
        }
    }
}
