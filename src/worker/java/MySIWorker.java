import parspice.sender.IntSender;
import parspice.sender.LongSender;
import parspice.worker.SIWorker;

public class MySIWorker extends SIWorker<Long, Integer> {

    public MySIWorker() {
        super(new LongSender(), new IntSender());
    }

    @Override
    public void setup(Long input) throws Exception {
        // do something with input
    }

    @Override
    public void task(Integer input) throws Exception {
        // do something with input
    }
}
