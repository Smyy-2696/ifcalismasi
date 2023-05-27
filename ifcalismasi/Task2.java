package ifcalismasi;

import java.util.Scanner;

public class Task2 {


    public static void main(String[] args) {
        /*  TASK :
     *  Kullanicidan 3 tene pozitif  tam sayi alniz.
     *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
        eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz
        INFO :
         üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan büyük olmali
         a+b>c>a-b
         a+c>b>a-c
         b+c>a>b-c
        a=b=c ise es kenar ucgen

     */
        Scanner scan = new Scanner(System.in);
        System.out.println("üç tane satı giriniz");
        int a = Math.abs(scan.nextInt());
        int b = Math.abs(scan.nextInt());
        int c = Math.abs(scan.nextInt());

        boolean ucgenmi = (a + b > c && c > Math.abs(a - b)) &&
                (a + c > b && b > Math.abs(a - c)) &&
                (b + c > a && a > Math.abs(b - c));

        if (ucgenmi) {

            if (a == b && b == c & a == c) {
                System.out.println("hem ücgen hemd eeskenar ücgen");
            } else {
                System.out.println("ücgen ama eskenar değil");
            }

        }
    }
}