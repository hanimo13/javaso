import java.util.Scanner;

public class ForEx9 {

    // 중첩 for

    //
    public static void main(String[] args) {
        // * 을 출력할 라인의 수 입력 받기
        Scanner scanner = new Scanner(System.in);
        System.out.println("* 을 출력할 라인의 수 입력 >>");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }

            System.out.println();
        }
        scanner.close();
    }
}
