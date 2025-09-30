package ClassAndHomeTasks.HomeTask;

public class AppendTask implements Runnable {
    private StringBuffer stringBuffer;

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            stringBuffer.append("X");
        }
    }

    public AppendTask(StringBuffer stringBuffer) {
        this.stringBuffer = stringBuffer;
    }

    public StringBuffer getStringBuffer() {
        return stringBuffer;
    }

    public void setStringBuffer(StringBuffer stringBuffer) {
        this.stringBuffer = stringBuffer;
    }

}
