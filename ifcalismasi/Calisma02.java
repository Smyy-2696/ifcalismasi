package ifcalismasi;

import java.util.Scanner;

public class Calisma02 {
    public static void main(String[] args) {
        //Ornek : Kullanicidan  alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int num=scan.nextInt();

        if (num%2==0){
            System.out.println("çift sayıdır");
        } else if (num%2==1) {
            System.out.println("tek sayıdır");

        }


    }
}
