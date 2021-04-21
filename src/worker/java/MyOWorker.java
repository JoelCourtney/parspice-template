import parspice.sender.DoubleArraySender;
import parspice.worker.OWorker;

public class MyOWorker extends OWorker<double[]> {

    public MyOWorker() {
        super(new DoubleArraySender(3));
    }

    @Override
    public void setup() throws Exception {
        // This is optional
    }

    @Override
    public double[] task(int i) throws Exception {
        return new double[]{1, 2, i};
    }
}
