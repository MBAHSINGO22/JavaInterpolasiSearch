public class PencarianInterpolasi {

    // Method Pencarian Interpolasi
    public static int PencarianInterpolasi(int[] array, int x) {
        int low = 0, high = (array.length - 1);

        // Menggunakan algoritma interpolation search
        while (low <= high && x >= array[low] && x <= array[high]) {
            if (low == high) {
                if (array[low] == x) return low;
                return -1;
            }

            int pos = low + (((high - low) / (array[high] - array[low])) * (x - array[low]));

            if (array[pos] == x)
                return pos;

            if (array[pos] < x)
                low = pos + 1;

            else
                high = pos - 1;
        }
        return -1;
    }

    // Method Main
    public static void main(String[] args) {
        int[] array = {10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47};
        int x = 18; // Elemen yang dicari

        int index = PencarianInterpolasi(array, x);

        if (index == -1)
            System.out.println("Elemen tidak ditemukan dalam array");
        else
            System.out.println("Elemen ditemukan pada indeks: " + index);
    }
}