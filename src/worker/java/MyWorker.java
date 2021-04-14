import parspice.sender.DoubleArraySender;
import parspice.worker.OWorker;

public class MyWorker extends OWorker<double[]> {

    public MyWorker() {
        super(new DoubleArraySender(3));
    }

    @Override
    public void setup() throws Exception {

    }

    @Override
    public double[] task(int i) throws Exception {
        return new double[]{1, 2, i};
    }
}
