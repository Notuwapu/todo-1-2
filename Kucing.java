public class Kucing {

    // Properti
    private String nama;
    private String warna;
    private int usia;
    private boolean isKeluargan;

    // Constructor
    public Kucing(String nama, String warna, int usia, boolean isKeluargan) {
        this.nama = nama;
        this.warna = warna;
        this.usia = usia;
        this.isKeluargan = isKeluargan;
    }

    // Metode (aksi yang bisa dilakukan oleh objek)
    public void bersuara() {
        System.out.println("Meow! Meow!");
    }

    public void makan() {
        System.out.println(" sedang makan");
    }

    public void tidur() {
        System.out.println(" sedang tidur");
    }

    public void bermain() {
        System.out.println(" sedang bermain");
    }

    // Metode untuk menampilkan informasi kucing
    public void printInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Warna: " + warna);
        System.out.println("Usia: " + usia + " tahun");
        if (isKeluargan) {
            System.out.println("Status: Kucing peliharaan");
        } else {
            System.out.println("Status: Kucing liar");
        }
    }
}
