package hafta1;

import java.util.Scanner;

public class UcakBiletiFiyatiHesapla {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Mesafeyi km türünden giriniz: ");
        int mesafe = scanner.nextInt();

        System.out.println("Yaşınızı giriniz: ");
        int yas = scanner.nextInt();

        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
        int yolculukTipi = scanner.nextInt();

        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz!");
        } else {
            double normalTutar = mesafe * 0.10;
            double indirimliTutar = normalTutar;

            if (yas < 12) {
                indirimliTutar -= normalTutar * 0.50;
            } else if (yas >= 12 && yas <= 24) {
                indirimliTutar -= normalTutar * 0.10;
            } else if (yas > 65) {
                indirimliTutar -= normalTutar * 0.30;
            }

            if (yolculukTipi == 2) {
                indirimliTutar -= indirimliTutar * 0.20;
                indirimliTutar *= 2; //
            }

            System.out.println("Toplam bilet fiyatı: " + indirimliTutar + " TL");
        }
    }
}
