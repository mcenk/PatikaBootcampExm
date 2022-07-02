package OrtalamaHesaplama;

import java.util.Scanner;

public class Main {
        public static void main (String[]args){
            double fizik, matematik, kimya,turkce,tarih,muzik, ortalama;

            Scanner input = new Scanner(System.in);
            System.out.print("Matematik Notunu Giriniz : ");
            matematik = input.nextDouble();
            System.out.print("Fizik Notunu Giriniz : ");
            fizik = input.nextDouble();
            System.out.print("Kimya Notunu Giriniz : ");
            kimya = input.nextDouble();
            System.out.print("Turkce Notunu Giriniz : ");
            turkce = input.nextDouble();
            System.out.print("Tarih Notunu Giriniz : ");
            tarih = input.nextDouble();
            System.out.print("Muzik Notunu Giriniz : ");
            muzik= input.nextDouble();

            ortalama= (matematik+fizik+kimya+turkce+tarih+muzik)/6;
            System.out.println("Ortalama"+ortalama);
            System.out.println( ortalama>60 ? "Gecti" : "Kaldi");
        }
    }


