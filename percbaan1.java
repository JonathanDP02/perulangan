import java.util.Scanner;

public class percbaan1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//..............deklarasi....................//

        System.out.print("Input n: ");
        int n = sc.nextInt();

//..............perulangan...................//

        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}