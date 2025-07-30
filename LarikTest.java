public class LarikTest {
    public static void main(String[] args) {
        // Membuat array berisi 10 data bertipe integer
        int[] array = new int[10];
        // Menggunakan loop for untuk mengisi setiap elemen dalam array dengan angka 1 hingga 10
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1; // Misalnya, kita mengisi array dengan angka 1 hingga 10
        }

        // Menggunakan method cetak dari kelas Larik untuk menampilkan isi dari array
        // Method ini akan mengiterasi setiap elemen dalam array dan mencetaknya
        Larik.cetak(array);
    }
}