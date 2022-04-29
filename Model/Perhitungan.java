package Model;

public class Perhitungan {
    private int a;
    private int b;
    private int hasil;

    public Perhitungan(int _a, int _b, int _hasil) {
        this.a = _a;
        this.b = _b;
        _hasil = 0;
        this.hasil = _hasil;
        printJudul();

    }

    public void HitungPenambahan() {
        this.hasil = this.a + this.b;

    }

    public void HitungPerkalian() {
        this.hasil = this.a * this.b;
    }

    public void printJudul() {
        System.out.println("Penghitungan");
    }

    public int HitungTambah(int a, int b) {
        this.a = a;
        this.b = b;
        HitungPenambahan();
        return this.hasil;
    }

    public int HitungKali(int a, int b) {
        this.a = a;
        this.b = b;
        HitungPerkalian();
        return this.hasil;
    }

}
