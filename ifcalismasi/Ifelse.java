package ifcalismasi;

import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {


    /*
        Print "Lutfen is unvaninizi girin
        jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
        Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin.
        Example :
        Eger jobTitle  qa ise print is unvaniniz Quality Analyst
        test data: qa ise print Quality Analyst
        dev ise print Developer
        ba ise print Business Analyst
        pm ise print Project Manager
       */


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen is unvaninizi girin");
        String isUnvani=scan.nextLine().toLowerCase();

        if(isUnvani.equals("qa")){
            System.out.println(" Quality Analyst");}
        else if (isUnvani.equals("dev")) {
            System.out.println("Developer");

        }else if(isUnvani.equals("ba")){
            System.out.println("Business Analyst");
        }else if(isUnvani.equals("pm")){
            System.out.println("Project Manager");
        }

        else{
            System.out.println("tanımlı değil");
        }


    }
}



