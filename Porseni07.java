import java.util.Scanner;

public class Porseni07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
//............deklasi...........................//

        int jmlAtlet = 5, jmlPlm;
        String namaAtlet;

        System.out.println("=================");
        System.out.println("==== Porseni ====");
        System.out.println("=================");
        System.out.print("Masukkan jumlah mahasiswa polinema yang daftar: ");
        jmlPlm = sc.nextInt();
        sc.nextLine();

//...................perulangan..................//

        for (int i = 1; i <= jmlPlm; i++) {

            System.out.println("");
            System.out.println("Polinema ke-" + i);

//..................nestedloop..................//

            System.out.println("Cabor : Badminton");
            for (int j = 1; j <= jmlAtlet; j++) {
                System.out.print("Nama atlet " + j + "\t :");
                namaAtlet = sc.nextLine();  
            }

            System.out.println("Cabor : Tenis Meja");
            for (int j = 1; j <= jmlAtlet; j++) {
                System.out.print("Nama atlet " + j + "\t :");
                namaAtlet = sc.nextLine(); 
            }

            System.out.println("Cabor : Basket");
            for (int j = 1; j <= jmlAtlet; j++) {
                System.out.print("Nama atlet " + j + "\t :");
                namaAtlet = sc.nextLine();
            }

            System.out.println("Cabor : Bola Voly");
            for (int j = 1; j <= jmlAtlet; j++) {
                System.out.print("Nama atlet " + j + "\t :");
                namaAtlet = sc.nextLine();
            }
        }
    }
}
