package ifcalismasi;


import java.util.Scanner;

public class Calisma08 {
    public static void main(String[] args) {  /*
                    Password'un ilk harfi buyuk harf ise
                        'A' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
                        Adana ==> Gecerli
                    Passwordun ilk harfi kucuk harf ise
                        'z' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
                        zehirli ==> Gecerli         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen password giriniz");
        String pwd= scan.nextLine();

        char ilk=pwd.charAt(0);

        if (ilk>='A' &&  ilk<='Z') {
            if (ilk == 'A') {System.out.println("gecerli password");}
        else  {System.out.println("gecersiz password");}}
        else if (ilk>='a' && ilk<='z') {
            if (ilk=='z'){System.out.println("gecerli password");}
            else{System.out.println("gecersiz pasword");}}




    }






    }

