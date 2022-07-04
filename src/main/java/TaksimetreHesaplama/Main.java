package TaksimetreHesaplama;

import java.util.Scanner;

public class Main {
   static float acilis=10,toplamKm,toplamUcret=0;
        public static void main(String[] args) {
            float acilis=10,toplamKm,toplamUcret;

            Scanner scan=new Scanner(System.in);
            System.out.println("Toplam KM miktarini giriniz: ");
            System.out.println("Ödenecek ücret: "+ ucretHesapla(scan.nextFloat()));
        }
        static float ucretHesapla(float km){
            toplamUcret= (float) (acilis+(km*2.20));

            if(toplamUcret<20)
                toplamUcret=20;

            return toplamUcret;
        }
}
