package ders02dataTurleri_scanner;

import java.util.Scanner;

public class c05_scanner {

    public static void main(String[] args) {

        // kullanıcıdan bir dikdortgenin 2 kenar uzunnluğu alıp
        //dikdörtgenin alanını yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen iki kenar uzunluğu girin" +
                "\niki kenar uzunlugu arasında enter a basın");

        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();

        System.out.println("Dikdörtgenin alanı: " + (kenar1*kenar2));
        }
    }
