package Star;

import java.util.Scanner;

public class Star01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = 0; i < n; i++) {    // 줄바꿈
            for(int j = 0; j < m; j++) {    // 별 출력
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
