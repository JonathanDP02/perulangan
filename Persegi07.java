public class Persegi07 {
    public static void main(String[] args) {

//................deklarasi.................//

        int n=5, m=1;

//...............perulangan.................//

        while (m<=n) {
            int i = 1;

            while (i<=n) {
                if (m==1||m==n||i==1||i==n) {
                    System.out.print("5");
                }else {
                    System.out.print(" ");
                }
                i++;
            }
            System.out.println();
            m++;
        }

    }
}
