package ifcalismasi;

import java.util.Scanner;

public class BakiyeSorusuAtm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("*");
        System.out.println("ATMYE HOŞGELDİNİZ");
        System.out.println("yapmak istediğiniz işlemi seçiniz");
        int secim=sc.nextInt();
        int bakiye=1000;

        switch (secim){
            case 1:
                System.out.println("bakiye: " +bakiye);
                break;
            case 2:
                System.out.println("yatırılacak tutarı giriniz");
                int yatacakTutar=sc.nextInt();
                bakiye=bakiye+yatacakTutar;
                System.out.println("bakiye : " + bakiye );

                break;
            case 3:
                System.out.println("Ne kadar para çekmek istiyorsunuz");
                int cekilecekTutar=sc.nextInt();
                if (cekilecekTutar>bakiye){
                    System.out.println("bakiye yetersiz");
                    System.out.println("mevcut bakiye : " + bakiye);}

                break;
            case 4:
                System.out.println("çıkış");
                break;
            default:
                System.out.println("giriş hatalı");

        }


















    }
}
