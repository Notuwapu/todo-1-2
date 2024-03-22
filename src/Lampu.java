public class Lampu {

    // Properti
    private String jenis; // "Bohlam", "LED", "Lampu Neon", dll.
    private int watt; // Daya lampu
    private boolean menyala; // Status lampu (nyala/mati)
    private String gambar; // Path/Nama file gambar

    // Constructor
    public Lampu(String jenis, int watt, String gambar) {
        this.jenis = jenis;
        this.watt = watt;
        this.menyala = false;
        this.gambar = gambar;
    }

    // Metode
    public void nyalakan() {
        if (menyala) {
            System.out.println("Lampu sudah menyala.");
        } else {
            menyala = true;
            System.out.println("Lampu " + jenis + " (" + watt + " watt) dinyalakan.");
        }
    }

    public void matikan() {
        if (!menyala) {
            System.out.println("Lampu sudah mati.");
        } else {
            menyala = false;
            System.out.println("Lampu " + jenis + " (" + watt + " watt) dimatikan.");
        }
    }

    public void tampilkanGambar() {
        System.out.println("Menampilkan gambar " + gambar);
        // Implementasi untuk menampilkan gambar (tergantung library yang digunakan)
    }

    public String getJenis() {
        return jenis;
    }

    public int getWatt() {
        return watt;
    }

    public boolean isMenyala() {
        return menyala;
    }

    public String getGambar() {
        return gambar;
    }
}
