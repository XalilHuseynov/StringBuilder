package StringTasks;

public class Task2 {
    public static void main(String[] args) {
        String sentence = "salam,dunya";
        sentence = sentence.replace(',',' ');
        String[] words = sentence.split(" ");
        System.out.println("Corrected sentence : "+sentence);
        System.out.println("Words count : "+words.length);

    }
}
