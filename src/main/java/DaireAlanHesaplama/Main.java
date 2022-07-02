package DaireAlanHesaplama;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        final double pi= 3.14;
        double r,a, hesaplama,alan,cevre;

        Scanner scan = new Scanner(System.in);

        System.out.print("Yaricapi giriniz =  ");
        r =scan.nextDouble();

        System.out.print("Merkez aciyi giriniz =  ");
        a =scan.nextDouble();
        alan=(pi*r*r);
        cevre=2*pi*r;
        hesaplama = ((pi*(r*r)*a)/360);
        System.out.println(hesaplama);
        System.out.println(cevre);
        System.out.println("Toplam alan" + alan);


    }
}
