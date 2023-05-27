package ifcalismasi;

import java.util.Scanner;

public class Calisma04 {
    public static void main(String[] args) {
        //Example 1: Gun sayisini verdiginizde gun ismini yazan kodu yaziniz
        //  1==> Pazar, 2 ==> Pazartesi .....

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 1-7 arası gün sayısı giriniz");
        int gun=scan.nextInt();

        if (gun==1){
            System.out.println("pazartesi");
        } else if (gun==2) {
            System.out.println("salı");

        } else if (gun==3) {
            System.out.println("carsamba");

        } else if (gun==4) {
            System.out.println("persembe");

        } else if (gun==5) {
            System.out.println("cuma");

        } else if (gun==6) {
            System.out.println("cumartesi");

        }else if (gun==7){
            System.out.println("pazar");
        }else{
            System.out.println("tanımlı bir numara gitriniz");
        }


    }
}
