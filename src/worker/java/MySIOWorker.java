import parspice.sender.DoubleArraySender;
import parspice.sender.IntSender;
import parspice.sender.LongSender;
import parspice.worker.SIOWorker;

public class MySIOWorker extends SIOWorker<Long, Integer, double[]> {

    public MySIOWorker() {
        super(new LongSender(), new IntSender(), new DoubleArraySender(3));
    }

    @Override
    public void setup(Long input) throws Exception {
        // do something with input
    }

    @Override
    public double[] task(Integer input) throws Exception {
        return new double[]{1., 2., input};
    }
}
