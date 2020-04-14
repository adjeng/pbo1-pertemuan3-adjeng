package operator;

public class OperatorUnary {
    public static void main(String[] args) {
        int i = 0;

        i++;                        // i tadinya 0 ditambahkan 1 sehingga i = 1
        System.out.println(i);      // betulkan i nilainya 1
        i++;                        // karena tadinya sudah bernilai 1 maka sekarang bertambah ditambahkan lagi menjadi 1 dan 2
        System.out.println(i);      // tuh betulkan i nilainya 2
        i = i+1;                    // bisa dilihat i++ sama dengan i = i+1
        System.out.println(i);      // i tadi 2 sekarang menjadi 3


        // Berlaku juga untuk penambahan angka lain dan operator aritmatika lain
        i+=3;                     // sama dengan i = i+3
        System.out.println(i);

        i+=3;
        System.out.println(i);

        i*=3;                     // sama dengan i = i*3
        System.out.println(i);

        i*=3;
        System.out.println(i);
    }
}