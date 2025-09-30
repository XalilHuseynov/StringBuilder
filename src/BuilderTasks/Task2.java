package BuilderTasks;

public class Task2 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("StringBuilder çox faydalıdır!!!");
        stringBuilder.delete(0,5);
        stringBuilder.delete(stringBuilder.length()-3,stringBuilder.length());
        System.out.println(stringBuilder);






    }
}
