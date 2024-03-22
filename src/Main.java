public class Main {

    public static void main(String[] args) {
        Lampu lampuBohlam = new Lampu("Bohlam", 60, "lampu-bohlam.png");
        lampuBohlam.nyalakan();
        lampuBohlam.tampilkanGambar();

        Lampu lampuLED = new Lampu("LED", 5, "lampu-led.png");
        lampuLED.nyalakan();
        lampuLED.matikan();

        System.out.println("Jenis lampu: " + lampuBohlam.getJenis());
        System.out.println("Daya lampu: " + lampuLED.getWatt() + " watt");
    }
}
