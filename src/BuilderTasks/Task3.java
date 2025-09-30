package BuilderTasks;

public class Task3 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Java ilə StringBuilder öyrənmək çox maraqlıdır");
        String[] words = stringBuilder.toString().split(" ");
        String defaulWord = "";
        for (int i = 0; i <words.length; i++) {
            if(words[i].length()>defaulWord.length()){
                defaulWord = words[i];
            }
        }
        System.out.println("En uzun soz : "+defaulWord);





    }
}
