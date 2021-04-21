import parspice.sender.LongSender;
import parspice.worker.SWorker;

public class MySWorker extends SWorker<Long> {

    public MySWorker() {
        super(new LongSender());
    }

    @Override
    public void setup(Long input) throws Exception {
        // do something with input
    }

    @Override
    public void task(int i) throws Exception {
        int hello = 2;
    }
}
