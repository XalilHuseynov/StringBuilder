package ClassAndHomeTasks.HomeTask;

public class AppendMain  {
    public static void main(String[] args) throws InterruptedException {
        AppendTask appendTask = new AppendTask(new StringBuffer());

        Thread thread1 = new Thread(appendTask);
        Thread thread2 = new Thread(appendTask);
        Thread thread3 = new Thread(appendTask);
        Thread thread4 = new Thread(appendTask);
        Thread thread5 = new Thread(appendTask);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        thread5.join();

        //StringBuffer netice hemise 5000 , StringBuilderde ise ferqli cunki onun append metodu sinxron deyil.
        System.out.println("Uzunluq : "+appendTask.getStringBuffer().length());

    }
}
