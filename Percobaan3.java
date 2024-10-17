import java.util.Scanner;

public class Percobaan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//.................deklarasi....................//

        int n;
        System.out.print("Masukkan nilai n: ");
        n = sc.nextInt();

//...............perulangan.....................//

        for (int i = 1; i <= n; i++) {
            System.out.print(i * i + " ");
        }
    }
}
