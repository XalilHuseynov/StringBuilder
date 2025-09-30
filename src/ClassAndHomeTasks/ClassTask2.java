package ClassAndHomeTasks;

public class ClassTask2 {
    public static void main(String[] args) {

        String sentence="A man, a plan, a canal: Panama";
        StringBuilder newSentence = new StringBuilder(sentence.replaceAll("[^a-zA-Z0-9]","").toLowerCase());
        System.out.println(newSentence);
        if(newSentence.equals(newSentence.reverse())){
            System.out.println(sentence+" is palindrome");
        }else{
            System.out.println(sentence+" is not palindrome");
        }

    }
}
