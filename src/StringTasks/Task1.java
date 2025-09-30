package StringTasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name : ");
        String inputName= input.nextLine();

        System.out.println("Length : "+inputName.length());
        System.out.println("To lower case : "+inputName.toLowerCase());
        System.out.println("First letter : "+inputName.charAt(2));
        System.out.println("Trim : "+inputName.trim());



    }
}
