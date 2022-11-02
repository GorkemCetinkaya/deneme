package ders03_dataCastingWrapper;

public class MailSoru {
    public static void main(String[] args) {
        String email = "enes@gmail.com";

        if (!email.contains("@")) {

            System.out.println("Geçersiz email");
        } else if (!email.contains("@gmail.com")) {
            System.out.println("gmail adresi girin");
        } else if (!email.endsWith("@gmail.com")) {
            System.out.println("yazım hatası");

        } else {
            System.out.println("Email adresiniz başarıyla kaydedilmiştir");
        }
    }
}