package ders03_dataCastingWrapper;

import java.util.Scanner;

public class SifreControl {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String sifre;
        int bayrak;
        boolean sifreDogrMu;




        do {
            System.out.println("Lütfen şifrenizi giriniz");
            sifre= scan.nextLine();
            bayrak=0;

            int sonuc = kucukHarfKonroluYap(sifre);
            bayrak = bayrak+sonuc;
            sonuc = buyukHarfKonroluYap(sifre);
            bayrak = bayrak+sonuc;

            sonuc= ozelKarakterKontroluYap(sifre);
            bayrak=bayrak+sonuc;

            sonuc= sayiKontroluYap(sifre);
            bayrak=bayrak+sonuc;

            if (sifre.length()<8){
                System.out.println("Şifre en az 8 karakter olmlıdır");

            }else {
                bayrak++;
            }

        }while (bayrak!= 5);
        System.out.println("Şifreniz başarıyla kaydedildi");
    }

    private static int sayiKontroluYap(String sifre) {
        int bayrak=0;

        for (int i = 0; i <sifre.length(); i++){
            if (sifre.charAt(i)>='0' && sifre.charAt(i)<='9'){
                bayrak++;
                break;
            }

        }
        if (bayrak==0){
            System.out.println("Şifre sayı içermelidir");
            return 0;
        }else return 1;


    }

    private static int ozelKarakterKontroluYap(String sifre) {
        int bayrak=0;
        String ozelKarakterler = "<>£#$½{[]}|_?=)+*(/&%+^'!é@,.";

        for (int i = 0; i <sifre.length(); i++) {
            if (ozelKarakterler.contains(sifre.substring(i,i+1))){
                bayrak++;
                break;
            }
            
        }
        if (bayrak==0){
            System.out.println("Şifre özel karakter içermelidir");
            return 0;
        }else return  1;

    }

    private static int buyukHarfKonroluYap(String sifre) {
        int bayrak=0;

        for (int i = 0; i <sifre.length(); i++){
            if (sifre.charAt(i)>='A' && sifre.charAt(i)<='Z'){
                bayrak++;
                break;
            }

        }
        if (bayrak==0){
            System.out.println("Şifre buyuk harf içermelidir");
            return 0;
        }else return 1;

    }

    private static int kucukHarfKonroluYap(String sifre) {
        int bayrak=0;

        for (int i = 0; i <sifre.length(); i++){
            if (sifre.charAt(i)>='a' && sifre.charAt(i)<='z'){
                bayrak++;
                break;
            }

            }
        if (bayrak==0){
            System.out.println("Şifre küçük harf içermelidir");
            return 0;
        }else return 1;


        }
    }

    
   

