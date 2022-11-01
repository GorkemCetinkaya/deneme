package ders02dataTurleri_scanner;

import java.util.Scanner;

public class c03_scanner {
    public static void main(String[] args) {

        // Kullanıcıdan ismini alıp büyük harfle yazdırın

        // 1. Adım scan objesi oluştur
        Scanner scan = new Scanner(System.in);

        //2. Adım kullanıcıya ne istediğimizi yazdırma
        System.out.println("Lütfen adınızı giriniz.");

        /* Kullanıcıdan istediğimiz bilginin turune uygun olarak bir
        variable oluşturup scanner methotlarından uygun olanını kullanarak
        alınan değeri variabe a atayalım
         */
        String kullaniciAdi= scan.next();

        System.out.println(kullaniciAdi.toUpperCase());

    }
}
