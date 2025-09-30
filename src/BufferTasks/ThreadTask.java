package BufferTasks;

public class ThreadTask {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();

        Thread thread1 = new Thread(()->{
            for (int i = 0; i <1000 ; i++) {
                stringBuilder.append("A");
                stringBuffer.append("A");
            }
        });

        Thread thread2 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                stringBuffer.append("B");
                stringBuilder.append("B");
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("String builder length : "+stringBuilder.length());
        System.out.println("String buffer length : "+stringBuffer.length());
    }
}
