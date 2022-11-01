package ders02dataTurleri_scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class c04_scanner {

    public static void main(String[] args) {

        //kulanıcıdan bir double bir int sayı alıp toplamını ver çarpmını yazdır

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen ondalıklı bir sayı girin.");
        double ondalikliSayi= scan.nextDouble();


        System.out.println("Lütfen bir tamsayı girin");
        int tamSayi= scan.nextInt();

        System.out.println("Girilen sayıların toplamı :" + (ondalikliSayi+tamSayi));

        System.out.println("Girilen sayıların çarpımı : " + (ondalikliSayi*tamSayi) );
    }
}
