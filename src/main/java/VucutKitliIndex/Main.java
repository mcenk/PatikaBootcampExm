package VucutKitliIndex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //vucut-bot indexi
        double kilo, boy, kitleIndex;
        Scanner input = new Scanner(System.in);

        System.out.print("Boy = ");
        boy = input.nextDouble();
        System.out.print("Kilo = ");
        kilo = input.nextDouble();
        kitleIndex =( kilo /( boy * boy));
        System.out.println("Vucut Kitle Indeksiniz  = " + kitleIndex);




    }
}
