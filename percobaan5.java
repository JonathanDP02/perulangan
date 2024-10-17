import java.util.Scanner;

public class percobaan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//....................deklarasi....................//

        int bil1, bil2, hasil = 0;
        System.out.print("Masukkan bilangan pertama: ");
        bil1 = sc.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        bil2 = sc.nextInt();

//....................perulangan....................//

        for (int i = 1; i <= bil1; i++) {
            hasil += bil2;
        }

//...................output........................//

        System.out.println("Hasil perkalian menggunakan penambahan: " + hasil);
    }
}
