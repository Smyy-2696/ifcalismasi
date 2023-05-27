package ifcalismasi;

import java.util.Scanner;

public class Calisma05 {
    public static void main(String[] args) {
            /*
             Example 1:Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu
                       asagidaki tabloya gore yazdiran kodu olusturunuz
                       0-4 ==> bebek
                       5-12 ==> cocuk
                       13-20 ==> genc
                       21-30 ==> yetiskin
                       30 ustu ==> Tanimlanmamis
                       Hata Mesaji olarak "Gecerli bir yas giriniz" yazdiriniz         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen yasınızı giriniz");
        int age=scan.nextInt();

        if (age>0 && age<=4){
            System.out.println("bebek");
        } else if (age>=5 && age<=12) {
            System.out.println("çocuk");

        } else if (age>=13 && age<=20) {
            System.out.println("genç");

        } else if (age>=21 &&  age<=30) {
            System.out.println("yetişkin");

        }else{
            System.out.println("tanımlanmamış");
        }


    }
}
