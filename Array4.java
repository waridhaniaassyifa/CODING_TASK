public class Main {
    public static void main(String[] args) {
        // Mendeklarasikan array dengan tipe data integer
        int[] nilaiArray = {111,222,333,444,555,666,777,888,999};
        // Menampilkan semua nilai dalam array menggunakan perulangan for
        System.out.println("Nilai dalam data array adalah:");
        for (int i = 0; i < nilaiArray.length; i++) {
            System.out.println(nilaiArray[i]);
        }
    }
}