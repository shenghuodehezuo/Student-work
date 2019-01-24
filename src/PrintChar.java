import com.sun.media.sound.SoftTuning;

public class PrintChar implements Runnable {
    private char c;
    private int times;

    public PrintChar() {
    }

    public PrintChar(char c, int times) {
        this.c = c;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i=0;i<times;i++){
            System.out.println(c);
        }
    }
}
