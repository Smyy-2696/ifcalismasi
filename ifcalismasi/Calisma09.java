package ifcalismasi;

import java.util.Scanner;

public class Calisma09 {
    public static void main(String[] args) {
            /*
           Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra

           Eger calisan kadin ise;
            60 yasindan buyukse "Emekli Olabilir "yazdirin

           Eger calisan erkek ise;
            65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olusturunuz
        */


        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen cinsiyetinizi giriniz ");
        String x=scan.next();
        System.out.println("lütfen 0- 120 aralığında bir yaş giriniz");
        int age= scan.nextInt();

        if (x.equalsIgnoreCase("kadın"))
        {if (age>60){System.out.println("emekli olabilir");}
        else {System.out.println("calısmalı");}}

        else if (x.equalsIgnoreCase("erkek"))
        {if (age>65){System.out.println("emekli olabilir");}
        else {System.out.println("calısmalı");}}

        else{System.out.println("tanımlı değil");}

































    }
}
