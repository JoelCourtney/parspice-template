import parspice.sender.DoubleArraySender;
import parspice.worker.IOWorker;

public class MyIOWorker extends IOWorker<double[], double[]> {

    public MyIOWorker() {
        super(new DoubleArraySender(3), new DoubleArraySender(3));
    }

    @Override
    public void setup() throws Exception {

    }

    @Override
    public double[] task(double[] input) throws Exception {
        return input;
    }
}
