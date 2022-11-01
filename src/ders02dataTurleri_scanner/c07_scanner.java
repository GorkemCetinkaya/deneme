package ders02dataTurleri_scanner;

import java.util.Scanner;

public class c07_scanner {
    public static void main(String[] args) {

        // Kullanıcıdan iki sayı alıp ikisinin değerlerini değiştirin(swap)

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen birinci sayıyı giriniz");
        int sayi1= scan.nextInt();

        System.out.println("Lütfen ikinci sayıyı giriniz");
        int sayi2= scan.nextInt();

        int bos;

        bos=sayi2;

        sayi2 = sayi1;

        sayi1 = bos;

                System.out.println("sayi1 in değeri : " + sayi1);
        System.out.println("sayi2 nin değeri : " + sayi2);
    }
}
