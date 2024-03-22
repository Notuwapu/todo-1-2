public class Main {

    public static void main(String[] args) {

        // Membuat 3 objek kucing berbeda
        Kucing kucing1 = new Kucing("Whiskers", "Hitam", 2, true);
        Kucing kucing2 = new Kucing("Luna", "Abu-abu", 1, true);
        Kucing kucing3 = new Kucing("Garfield", "Oren", 4, false);

        // Memanggil metode printInfo() untuk setiap objek kucing
        kucing1.printInfo();
        kucing1.bersuara();
        kucing2.printInfo();
        kucing2.makan();
        kucing3.printInfo();
        kucing3.tidur();
    }
}
