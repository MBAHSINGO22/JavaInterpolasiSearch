public class Larik {
    // Metode cetak yang menerima array integer sebagai argumen
    public static void cetak(int[] array) {
        // Menggunakan loop for untuk mengiterasi setiap elemen dalam array
        // 'i' adalah variabel iterasi yang dimulai dari 0 dan berlanjut sampai 'i' kurang dari panjang array
        for (int i = 0; i < array.length; i++) {
            // Mencetak nilai dari setiap elemen array pada indeks 'i'
            System.out.println(array[i]);
        }
    }
}
