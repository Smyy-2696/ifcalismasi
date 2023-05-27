package ifcalismasi;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
          /* TASK :
         *  Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
        INFO :
        BMI = kilo(kg) /(boy*boy)(m)
        BMI <=20 oldukca zayifsiniz
        20<BMI<=25 Normal sinirlardasiniz
        25<BMI<=30 Sisman kategorisindesiniz
        30<BMI ==> Obez grubundasiniz.

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("boyunuzu ve kilonuzu giriniz");
        double m=scan.nextDouble();
        double kg=scan.nextDouble();
        double BMI=kg/(m*m);

        if(BMI<=20) {
            System.out.println("OLdukça zayıfsınız");
        }else if(BMI<=25) {
            System.out.println("Normla sınırlardasınız");
        }else if(BMI<=30) {
            System.out.println("şişman kategorindesiniz");
        }else if (BMI>30){
            System.out.println("Obez grubundasınız");}










    }
}
