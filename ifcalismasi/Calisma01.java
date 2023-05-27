package ifcalismasi;

import java.util.Scanner;

public class Calisma01 {
    public static void main(String[] args) {


        //Ornek 2: Bir String deki tekrarsiz characterleri ekrana yazdiriniz
        //       abbccdc  ==> ad

        String ch="aac";

        char ch1=ch.charAt(0);
        if ( ch.indexOf(ch1)==ch.lastIndexOf(ch1)) {
            System.out.println(ch1);
        }
        char ch2=ch.charAt(1);
        if (ch.indexOf(ch2)==ch.lastIndexOf(ch2)){
            System.out.println(ch2);
        }
        char ch3=ch.charAt(2);
        if (ch.indexOf(ch3)==ch.lastIndexOf(ch3)){
            System.out.println(ch3);
        }




















    }
}
