import java.util.Scanner;

public class percobaan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//................deklarasi................//

        int n, kali = 1;
        System.out.print("masukkan nilai n: ");
        n = sc.nextInt();

//...............perulangan...............//

        for (int i = 1; i <= n; i++) {
            kali *= i;
        }

//...............output..................//

        System.out.println(kali);
    }
}
