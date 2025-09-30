package ClassAndHomeTasks.HomeTask;

import java.util.Scanner;

public class HomeTask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter sentence : ");
        StringBuilder stringBuilder = new StringBuilder(input.nextLine());

        String vowels = "aeəıioöuüAEƏIİOÖUÜ";
        int counter=0;
        for (int i = 0; i <stringBuilder.length() ; i++) {
            if(stringBuilder.charAt(i) ==','){
                stringBuilder.setCharAt(i,';');
            }
            if(vowels.indexOf(stringBuilder.charAt(i)) !=-1){
               counter++;
            }
        }

        System.out.println("Vowels : "+counter);
        System.out.println("Replace (, -> ;) : "+stringBuilder);
        System.out.println("Reverse : "+stringBuilder.reverse());

    }
}
