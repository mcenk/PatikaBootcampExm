package TaksimetreHesaplama;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            float acilis=10,toplamKm,toplamUcret;

            Scanner scan=new Scanner(System.in);
            System.out.println("Toplam KM miktarini giriniz: ");
            toplamKm=scan.nextFloat();

            toplamUcret= (float) (acilis+(toplamKm*2.20));

            if(toplamUcret<20)
                toplamUcret=20;


            System.out.println("Ödenecek ücret: "+toplamUcret);

        }
}
