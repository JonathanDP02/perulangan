import java.util.Scanner;

public class RataNilai07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i=1;

        while (i<=5) {
            System.out.print("Input Nilai Mahasiswa ke " + i);
            System.out.println();
            int totalNilai=0;
            int rataNilai;

            for(int j=1; j<=5; j++){
                System.out.print("Nilai ke-" +j + " = ");
                int nilaiMhs=sc.nextInt();
                totalNilai += nilaiMhs;
            }
            rataNilai=totalNilai/5;
            System.out.println("Rata-rata Nilai Mahasiswa ke " + i + " adalah " +rataNilai);
            i++; 
        }
    }
}
