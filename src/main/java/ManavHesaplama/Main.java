package ManavHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armutKilosu = 2.14, elmaKilosu =3.67, domatesKilosu = 1.11 , muzKilosu = 0.95, patlicanKilosu = 5.00,
                armutKilo, elmaKilo,domatesKilo,muzKilo,patlicanKilo, toplamTutar;

        Scanner scan = new Scanner(System.in);
        System.out.println("Armut Kilo Giriniz:");
        armutKilo= scan.nextDouble();

        System.out.println("Elma Kilo Giriniz:");
        elmaKilo= scan.nextDouble();

        System.out.println("Domates Kilo Giriniz:");
        domatesKilo= scan.nextDouble();

        System.out.println("Muz Kilo Giriniz:");
        muzKilo= scan.nextDouble();

        System.out.println("Patlican Kilo Giriniz:");
        patlicanKilo= scan.nextDouble();


        toplamTutar=((armutKilo*armutKilosu)+(elmaKilo*elmaKilosu)
                +(domatesKilo*domatesKilosu)
                +(muzKilo*muzKilosu)+(patlicanKilo*patlicanKilosu)) ;
        System.out.println("Toplam Tutar :  "  +toplamTutar);
    }
}
