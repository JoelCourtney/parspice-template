import parspice.sender.DoubleArraySender;
import parspice.sender.IntSender;
import parspice.worker.IOWorker;

public class MyIOWorker extends IOWorker<Integer, double[]> {

    public MyIOWorker() {
        super(new IntSender(), new DoubleArraySender(3));
    }

    @Override
    public void setup() throws Exception {
        // This is optional
    }

    @Override
    public double[] task(Integer input) throws Exception {
        // do something with input
        return new double[]{1., 2., 3.};
    }
}
