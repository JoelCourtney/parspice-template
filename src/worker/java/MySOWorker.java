import parspice.sender.DoubleArraySender;
import parspice.sender.LongSender;
import parspice.worker.SOWorker;

public class MySOWorker extends SOWorker<Long, double[]> {

    public MySOWorker() {
        super(new LongSender(), new DoubleArraySender(3));
    }

    @Override
    public void setup(Long input) throws Exception {
        // do something with input
    }

    @Override
    public double[] task(int i) throws Exception {
        return new double[]{1., 2., i};
    }
}
