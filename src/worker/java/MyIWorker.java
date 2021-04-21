import parspice.sender.IntSender;
import parspice.worker.IWorker;

public class MyIWorker extends IWorker<Integer> {

    public MyIWorker() {
        super(new IntSender());
    }

    @Override
    public void setup() throws Exception {
        // This is optional
    }

    @Override
    public void task(Integer input) throws Exception {
        // do something with input
    }
}
