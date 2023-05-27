package ifcalismasi;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
         *  dort islemden biri ile isleme koyup sonucun yazdiriniz
         */
        Scanner scan = new Scanner(System.in);//kullanıcıdan input almak için canner obj create ettik.
        System.out.println("iki sayı giriniz");
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();
        System.out.println(" işlem oporatörü giriniz");
        char opr=scan.next().charAt(0);

        if (opr=='1'){
            System.out.println(sayi1+sayi2);
        } else if (opr=='2') {
            System.out.println(sayi1-sayi2);

        }else if (opr=='3'){
            System.out.println(sayi1*sayi2);
        }else if(opr=='4'){
            System.out.println(sayi1/sayi2);
        }else{
            System.out.println("tanımlı işlem giriniz");
        }


    }

}
