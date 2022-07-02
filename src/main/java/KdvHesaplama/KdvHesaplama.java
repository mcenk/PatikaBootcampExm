package KdvHesaplama;

import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        double fiyat, kdv, kdvTutari, toplamTutar;

        Scanner scan = new Scanner(System.in);
        System.out.print(" Urun Fiyatini Giriniz : ");
        fiyat = scan.nextDouble();

        if (fiyat>0) {
            kdv = fiyat > 1000 ? 0.08 : 0.18;

            kdvTutari = kdv * fiyat;

            toplamTutar = fiyat + kdvTutari;

            System.out.println("KDV'siz Tutar : " + fiyat+ "Tl");
            System.out.println("KDV Orani : " + kdv+ "Tl");
            System.out.println("KDV Tutari : " + kdvTutari+ "Tl");
            System.out.println("Toplam Tutar : " + toplamTutar+ "Tl");
        } else {
            System.out.println("Girelen tutar hatalidir");
        }
    }
}
