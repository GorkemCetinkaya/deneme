package ders02dataTurleri_scanner;

import java.util.Scanner;

public class c06_scanner {
    public static void main(String[] args) {

        // Kullanıcıdan ismini soyşsmini ve yaşını alıp aşagidaki formatta yazdırınız

        //Ismıniz : Jhon
        // Soyisminiz : Doe
        // Yasiniz : 44
        // Kaydiniz basariyla tamamlanmıştır

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");

        //String için kullanılabilen next() sadece ilk space kadari kısmı alır
        //                           nextLine() ise o satıra yazılan tüm bilgiyi alır

        String isim= scan.nextLine();

        System.out.println("Lütfen soyisminizi yazın");
        String soyisim= scan.nextLine();

        System.out.println("Lütden yasinizi giriniz");
        double yas= scan.nextDouble();


        System.out.println("Isminiz : " + isim + "\nSoyisminiz : " + soyisim +
                             "\nYasiniz : " + yas + "\nKaydiniz basariyla tamamlanmistir");
    }
}
