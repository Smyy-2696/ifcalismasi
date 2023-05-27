package ifcalismasi;

import java.util.Scanner;

public class Calisma07 {
    public static void main(String[] args) {
         /*  Example 1: Kullanicidan 3 tane sayi aliniz.
                 Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz
                 Eger ucgen ise “eskenar” Ucgen olma durumunu kontrol ediniz.
                 INFO :
                 Ucgen Olma Sarti: herhangi iki kenar toplami ucuncu kenarda buyuk olmali
                                   herhangi iki kenar farki ucuncu kenardan kucuk olmali
                 a+b>c>|a-b|
                 a+c>b>|a-c|
                 b+c>a>|b-c|
                 a=b=c ise eskenar ucgen     */

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen üç tane sayı giriniz");
        int a=Math.abs(scan.nextInt());
        int b=Math.abs(scan.nextInt());
        int c= Math.abs(scan.nextInt());

        boolean ucgenMi=(a+b>c &&  a-b<c)&&
        (a+c>b && a-c<b)&&
                (b+c>a &&  b-c<a);

        if (ucgenMi){
            if (a==b && a==c && b==c){
                System.out.println("ücgen hemde eskenar");
            }else{
                System.out.println("üçgen ama eskenar değil");
            }
        }else{
            System.out.println("bu bir üçgen değil");
        }















    }
}
