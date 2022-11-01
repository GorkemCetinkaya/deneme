package ders03_dataCastingWrapper;

import java.util.Scanner;

public class assas {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen kg olrak kilonuzu girin");
        double kilo= scan.nextDouble();
        System.out.println("Cm olarak boyunuzu girin");
        double boy= scan.nextDouble();



        double vke = (kilo*10000 / (boy*boy));
        System.out.println("Vücut kütle endeksiniz" + vke);

        if (vke>30){
            System.out.println("Obez");

        } else if (vke>25) {
            System.out.println("Kilolu");
            
        } else if (vke>20) {
            System.out.println("Normal");
            
        } else if (vke>0) {
            System.out.println("Zayıf");
            
        }else {
            System.out.println("Yanlış giriş");
        }
    }
}
