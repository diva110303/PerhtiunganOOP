import Model.Perhitungan;

public class Main {
    public static void main(String[] args) {
        Perhitungan s = new Perhitungan(4, 2, 0);

        int tambah = s.HitungTambah(4, 5);
        System.out.println(tambah);

        int kali = s.HitungKali(4, 5);
        System.out.println(kali);

    }
}
