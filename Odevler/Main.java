package Odevler;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,muziki,tarih;

        // sınıf tanımlandı
        Scanner inp = new Scanner(System.in);

        //kullanıcı değeri alınması
        System.out.print("Matematik notunuz: ");
        mat = inp.nextInt();
        System.out.println(mat);

        System.out.print("Fizik notunuz: ");
        fizik = inp.nextInt();
        System.out.println(fizik);

        System.out.print("Kimya notunuz: ");
        kimya = inp.nextInt();
        System.out.println(kimya);

        System.out.print("Türkçe notunuz: ");
        turkce = inp.nextInt();
        System.out.println(turkce);

        System.out.print("Tarih notunuz: ");
        tarih = inp.nextInt();
        System.out.println(tarih);

        System.out.print("Müzik notunuz: ");
        muziki = inp.nextInt();
        System.out.println(muziki);

        int toplam = (mat +muziki + tarih + turkce + fizik + kimya);
        double hesapla = toplam / 6;
        System.out.println("Ortalaman:"+ hesapla);
        System.out.println(hesapla > 60 ? "Sınıfı geçtiniz" : "Sınıfta kaldınız");


    }
}
