package ifcalismasi;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

           /*  TASK :
         *  Kullanicidan IT alanini bilgisini alarak console'a
         *  meslegi = qa ==> Quality Analyst
                     dev ==> Developer
                      ba ==> Busines Analyst
                      pm ==> Project Manager
        bilgilileri yazdiriniz
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("IT alan bilginizi giriniz");
        String alan=scan.nextLine();

        if(alan.equalsIgnoreCase("qa")){
            System.out.println("Quality Analyst");
        }else if(alan.equalsIgnoreCase("dev")){
            System.out.println("Developer");
        }else if(alan.equalsIgnoreCase("ba")){
            System.out.println("Business Analyst");}
        else if(alan.equalsIgnoreCase("pm")){
            System.out.println("Project Manager");
        }












    }
}
