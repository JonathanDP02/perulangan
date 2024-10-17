import java.util.Scanner;

public class percobaan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//..................deklarasi......................//

        int a = 3, tambah = 1, n;
        System.out.print("Masukkan nilai n: ");
        n = sc.nextInt();

//.................perulangan....................//

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            a =+ tambah;
            tambah =+ 2;
        }
    }
}
