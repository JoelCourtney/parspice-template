import parspice.ParSPICE;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        final int numIterations = 1000;
        final int numWorkers = 4;

        ParSPICE par = new ParSPICE("build/libs/worker.jar", 50050);
        List<double[]> results = par.run(new MyWorker(), numIterations, numWorkers);
    }
}
