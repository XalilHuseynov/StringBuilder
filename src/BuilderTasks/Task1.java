package BuilderTasks;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Java çox güclüdür");
        stringBuilder.insert(0,"Baslangic: ");
        stringBuilder.append(" :Son");
        System.out.println(stringBuilder);



    }
}
