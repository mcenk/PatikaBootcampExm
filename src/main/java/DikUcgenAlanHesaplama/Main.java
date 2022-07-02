package DikUcgenAlanHesaplama;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner dikdortgen = new Scanner(System.in);
        int a,b,u;
        double hipo,alan;
        System.out.print("1. Kenar uzunlugunu giriniz: ");
        a = dikdortgen.nextInt();
        System.out.print("2. Kenar uzunlugunu giriniz: ");
        b = dikdortgen.nextInt();
        hipo = (a*a)*(b*b);
        System.out.println("Hipatunus Kenarı: "+ hipo);
        u = (int) ((a+b+hipo) / 2);
        alan =u*(u-a)*(u-b)*(u-hipo);
        System.out.println("Hesaplanan Alan: "+ alan);

    }
}
