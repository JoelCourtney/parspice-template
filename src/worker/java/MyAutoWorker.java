import parspice.worker.AutoWorker;

public class MyAutoWorker extends AutoWorker {

    @Override
    public void setup() throws Exception {
        // This is optional
    }

    @Override
    public void task(int i) throws Exception {
        int hello = 2;
    }
}
