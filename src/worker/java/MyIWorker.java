import parspice.sender.DoubleArraySender;
import parspice.worker.IWorker;

public class MyIWorker extends IWorker<double[]> {

    public MyIWorker() {
        super(new DoubleArraySender(3));
    }

    @Override
    public void setup() throws Exception {

    }

    @Override
    public void task(double[] input) throws Exception {
        int hello = 2;
    }
}
