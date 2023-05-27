package ifcalismasi;

import java.util.Scanner;

public class Calisma03 {
    public static void main(String[] args) {
        //Ornek : Kullanicinin vermis oldugu character buyuk harf ise ekrana "Buyuk Harf",
        // kucuk harf ise ekrana "Kucuk Harf" yazdiran kodu olusturunuz

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");

        char ch=scan.next().charAt(0);

        if (ch>='a' &&  ch<='z'){
            System.out.println("küçük harf");
        } else if (ch>='A' &&  ch<='Z') {
            System.out.println("büyük harf");

        }else {
            System.out.println("harf değil");
        }


    }
}
