package BuilderTasks;

public class Task4 {
    public static void main(String[] args) {
        String [] words = {"Level", "Java", "Anna", "Palindrome", "civic"};
        StringBuilder stringBuilder;

        for (int i = 0; i <words.length ; i++) {
            stringBuilder = new StringBuilder(words[i]);

            if(words[i].equalsIgnoreCase(stringBuilder.reverse().toString())){
                System.out.println(words[i] +" -> true");
            }else{
                System.out.println(words[i]+" -> false");
            }

        }



    }
}
