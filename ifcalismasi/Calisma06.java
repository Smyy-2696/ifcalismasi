package ifcalismasi;

import java.util.Scanner;

public class Calisma06 {
    public static void main(String[] args) {
        /*1)Kullanicidan alinan password "pwd123!" oldugunda verilen password un dogru olup olmadigini kontrol eden ve kullaniciya
        uygun mesaj veren kodu yaziniz*/

        Scanner scan=new Scanner(System.in);
        System.out.println("bir password giriniz");
        String psw=scan.nextLine();

        if (psw.equalsIgnoreCase("pwd123!")){
            System.out.println("doğru giriş yaptınız");
        }else {
            System.out.println("lütfen dogru passwordu giriniz");
        }

















    }
}
