import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Program meminta anda untuk memasukkan angka
        {Scanner scanner = new Scanner(System.in);
            System.out.print(
                    " Silahkan " +
                            " Masukkan angka  ");
            int angka = scanner.nextInt();
            //Program akan menghasilkan angka Genap atau Ganjil
            int i = 1;
            while (i <= angka) {
                if (i % 2 == 0) {
                    System.out.println(i + " genap");
                } else {
                    System.out.println(i + " ganjil");
                }
                i++;
            }
            System.out.println("Terimakasih sudah mencobanya ya^_^");
        }
    }
}